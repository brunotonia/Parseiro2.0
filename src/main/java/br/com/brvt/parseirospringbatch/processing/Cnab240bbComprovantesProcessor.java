package br.com.brvt.parseirospringbatch.processing;

import org.springframework.batch.item.ItemProcessor;

import br.com.brvt.parseirospringbatch.model.Cnab240BB;
import br.com.brvt.parseirospringbatch.model.ComprovanteComErro;
import br.com.brvt.parseirospringbatch.model.ComprovanteTransferencia;
import br.com.brvt.parseirospringbatch.model.Comprovantes;
import br.com.brvt.parseirospringbatch.model.HeaderArquivo;
import br.com.brvt.parseirospringbatch.model.HeaderLoteAB;
import br.com.brvt.parseirospringbatch.model.SegmentoA;
import br.com.brvt.parseirospringbatch.model.SegmentoB;
import br.com.brvt.parseirospringbatch.model.SegmentoZ;
// import br.com.brvt.parseirospringbatch.model.TrailerArquivo;
// import br.com.brvt.parseirospringbatch.model.TrailerLoteAB;

public class Cnab240bbComprovantesProcessor implements ItemProcessor <Cnab240BB, Comprovantes> {
    private HeaderArquivo headerArquivo = null;
    private HeaderLoteAB  headerLoteAB = null; 
    private SegmentoA segmentoA = null;
    private SegmentoB segmentoB = null;
    private SegmentoZ segmentoZ = null;
    // private TrailerLoteAB trailerLoteAB = null;
    // private TrailerArquivo trailerArquivo = null;

    @Override
	public Comprovantes process(Cnab240BB linha) throws Exception {
        
       Comprovantes comprovante = null;	
        if (linha.getClass() == HeaderArquivo.class) {
            headerArquivo = (HeaderArquivo)linha;
        } else if (linha.getClass() == HeaderLoteAB.class) {
            headerLoteAB = (HeaderLoteAB)linha;
        } else if (linha.getClass() == SegmentoA.class) {
            segmentoA = (SegmentoA)linha;
            if (!segmentoA.getSaOcorrencias().contains("00")) {
                comprovante = new ComprovanteComErro(headerLoteAB, segmentoA);
            }
        } else if (linha.getClass() == SegmentoB.class) {
            segmentoB = (SegmentoB)linha; 
        } else if (linha.getClass() == SegmentoZ.class) {
            segmentoZ = (SegmentoZ)linha;
            comprovante = new ComprovanteTransferencia(headerArquivo, headerLoteAB, segmentoA, segmentoB, segmentoZ);
        }
        return comprovante;
    }
    
}
