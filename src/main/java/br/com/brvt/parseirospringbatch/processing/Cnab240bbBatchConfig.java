package br.com.brvt.parseirospringbatch.processing;

import java.util.Arrays;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepScope;
import org.springframework.batch.core.launch.support.RunIdIncrementer;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.batch.item.ItemWriter;
import org.springframework.batch.item.file.FlatFileItemReader;
import org.springframework.batch.item.file.builder.FlatFileItemReaderBuilder;
import org.springframework.batch.item.file.transform.Range;
import org.springframework.batch.item.support.CompositeItemProcessor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import br.com.brvt.parseirospringbatch.model.Cnab240BB;
import br.com.brvt.parseirospringbatch.model.Comprovantes;
import br.com.brvt.parseirospringbatch.model.Linha;

@Configuration
@EnableBatchProcessing
public class Cnab240bbBatchConfig {

    @Autowired
    private JobBuilderFactory jobBuilderFactory;
    @Autowired
    private StepBuilderFactory stepBuilderFactory;

    @Bean
	public Job cnab240bbJob() {
		return jobBuilderFactory
				.get("cnab240bbJob")
				.start(cnab240bbStep())
				.incrementer(new RunIdIncrementer())
				.build();
	}

	@Bean
	public Step cnab240bbStep() {
		return stepBuilderFactory
				.get("cnab240bbStep")
				// .<Linha, Cnab240BB>chunk(1)
				// .<Cnab240BB, Comprovantes>chunk(1)
				.<Linha, Comprovantes>chunk(1)
				.reader(cnab240bbReader()) 
				// .processor(cnab240bbProcessor()) 
				// .processor(comprovanteProcessor())
				.processor(compositeItemProcessor()) 
				// .writer(cnab240bbWriter()) 
				.writer(comprovantesWriter()) 
				.build();
	}

	@StepScope
	@Bean
	public FlatFileItemReader<Linha> cnab240bbReader() { 
		Resource arquivoClientes = new FileSystemResource("C:/Users/F1694506/Downloads/Softwares/VSCode/parseiro-spring-batch/src/main/resources/IEDPAG41260120220.ret");
		return new FlatFileItemReaderBuilder<Linha>()
			.name("cnab240bbReader")
			.resource(arquivoClientes)
			.fixedLength()
			.columns(new Range[] {new Range(1, 14), new Range(1, 240)})
			.names(new String[] {"linha", "linhaCompleta"} )
			.targetType(Linha.class)
			.build();
	}

	@Bean
	public Cnab240bbLinhasProcessor cnab240bbProcessor () {
		return new Cnab240bbLinhasProcessor();
	}

	@Bean
	public Cnab240bbComprovantesProcessor comprovanteProcessor () {
		return new Cnab240bbComprovantesProcessor();
	}

	@Bean
    public ItemProcessor<Linha, Comprovantes> compositeItemProcessor() {
        CompositeItemProcessor<Linha, Comprovantes> compositeItemProcessor = new CompositeItemProcessor<>();
        compositeItemProcessor.setDelegates(Arrays.asList(new Cnab240bbLinhasProcessor(), new Cnab240bbComprovantesProcessor()));
        return compositeItemProcessor;
    }

	@Bean
	public ItemWriter<Cnab240BB> cnab240bbWriter() {
		return linhas -> linhas.forEach(System.out::println);
	}

	@Bean
	public ItemWriter<Comprovantes> comprovantesWriter() {
		return comprovantes -> comprovantes.forEach(System.out::println);
	}
	
}
