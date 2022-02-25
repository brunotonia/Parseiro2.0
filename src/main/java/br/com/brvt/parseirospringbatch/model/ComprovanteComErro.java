package br.com.brvt.parseirospringbatch.model;

import br.com.brvt.parseirospringbatch.util.CodigosCompe;
import br.com.brvt.parseirospringbatch.util.Util;

public class ComprovanteComErro extends Comprovantes {

    private HeaderLoteAB headerLoteAB;
    private SegmentoA segmentoA;    
    private Util util;

    private String nomeArquivo;
    private String conteudoArquivo;

    public ComprovanteComErro(HeaderLoteAB headerLoteAB, SegmentoA segmentoA) {
        this.headerLoteAB = headerLoteAB;
        this.segmentoA = segmentoA;
        this.util = new Util();
        setNomeArquivo();
        setConteudoArquivo();
    }
    
    public String getNomeArquivo() {
        return this.nomeArquivo;
    }

    public void setNomeArquivo() {
        this.nomeArquivo = 
            "ERRO " + segmentoA.getSaOcorrencias().trim() + " - " + segmentoA.getSaFavNome().trim() + " - R$ " + util.FormataValor(segmentoA.getSaCdtValorReal())
                + "- L" + headerLoteAB.getHlCtrLote() + "R" + headerLoteAB.getHlCtrRegistro() + ".txt";
    }

    public String getConteudoArquivo() {
        return this.conteudoArquivo;
    }

    public void setConteudoArquivo() {
        this.conteudoArquivo = 
            "Beneficiário: " + segmentoA.getSaFavNome() + "\n" +
            "Banco: " + segmentoA.getSaFavBanco() + " - " + new CodigosCompe().getNomeBanco(segmentoA.getSaFavBanco()) + "\n" +
            "Agência: " + util.FormataAgenciaSemDv(segmentoA.getSaFavContAgencia()) + " Conta: "  + util.FormataContaComDv(segmentoA.getSaFavContConta(), segmentoA.getSaFavContContaDv()) +"\n" +
            "Valor: R$ " + util.FormataValor(segmentoA.getSaCdtValorReal()) + "\n" +
            "LoteAB " + headerLoteAB.getHlCtrLote() + " Registro " + headerLoteAB.getHlCtrRegistro() + "\n\n" +
            "ERRO " + segmentoA.getSaOcorrencias().trim() + " - " + segmentoA.getSaFavNome().trim();
    }

    @Override
    public String toString() {
        return conteudoArquivo;
    }
    
}
