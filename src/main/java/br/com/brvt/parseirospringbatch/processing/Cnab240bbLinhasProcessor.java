package br.com.brvt.parseirospringbatch.processing;

import org.springframework.batch.item.ItemProcessor;

import br.com.brvt.parseirospringbatch.model.Cnab240BB;
import br.com.brvt.parseirospringbatch.model.HeaderArquivo;
import br.com.brvt.parseirospringbatch.model.HeaderLoteAB;
import br.com.brvt.parseirospringbatch.model.Linha;
import br.com.brvt.parseirospringbatch.model.SegmentoA;
import br.com.brvt.parseirospringbatch.model.SegmentoB;
import br.com.brvt.parseirospringbatch.model.SegmentoZ;

public class Cnab240bbLinhasProcessor implements ItemProcessor <Linha, Cnab240BB> {

	@Override
	public Cnab240BB process(Linha linha) throws Exception {
		Cnab240BB cnab240bb = null;			
		if (linha.getLinha().matches("^00100000*")) {
			cnab240bb = new HeaderArquivo(linha.getLinhaCompleta());
		}
		if (linha.getLinha().matches("^001\\d\\d\\d\\d1C\\d\\d\\d\\d*")) {
			cnab240bb = new HeaderLoteAB(linha.getLinhaCompleta());
		} 
		if (linha.getLinha().matches("^001\\d\\d\\d\\d3\\d\\d\\d\\d\\dA")) {
			cnab240bb = new SegmentoA(linha.getLinhaCompleta());
		}
		if (linha.getLinha().matches("^001\\d\\d\\d\\d3\\d\\d\\d\\d\\dB")) {
			cnab240bb = new SegmentoB(linha.getLinhaCompleta());
		}
		if (linha.getLinha().matches("^001\\d\\d\\d\\d3\\d\\d\\d\\d\\dZ")) {
			cnab240bb = new SegmentoZ(linha.getLinhaCompleta());
		}
        return cnab240bb;
    }


}