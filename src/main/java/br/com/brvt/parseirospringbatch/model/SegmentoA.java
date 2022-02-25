package br.com.brvt.parseirospringbatch.model;

public class SegmentoA extends Cnab240BB {
    /*
     * CNAB240 BB 
     *          * Conforme documentação disponível em:
     * https://www.bb.com.br/docs/portal/disem/PgtVer03BB.pdf
     */
   
    private String saCtrBanco;
    private String saCtrLote;
    private String saCtrRegistro;
    private String saSrvRegistro;
    private String saSrvSegmento;
    private String saSrvMovTipo;
    private String saSrvMovCodigo;
    private String saFavCamara;
    private String saFavBanco;
    private String saFavContAgencia;
    private String saFavContAgenciaDv;
    private String saFavContConta;
    private String saFavContContaDv;
    private String saFavContDv;
    private String saFavNome;
    private String saCdtSeuNumero;
    private String saCdtDataPgto;
    private String saCdtMoedaTipo;
    private String saCdtMoedaQtde;
    private String saCdtValorPgto;
    private String saCdtNossoNumero;
    private String saCdtDataReal;
    private String saCdtValorReal;
    private String saInformacao2;
    private String saInformacaoPoupanca;
    private String saCodFinDoc;
    private String saCodFinTed;
    private String saCodFinComplementar;
    private String saCnab;
    private String saAviso;
    private String saOcorrencias;

    public SegmentoA (String linha) {
        setSaCtrBanco(linha.substring(0, 3));
        setSaCtrLote(linha.substring(3, 7));
        setSaCtrRegistro(linha.substring(7, 8));
        setSaSrvRegistro(linha.substring(8, 13));
        setSaSrvSegmento(linha.substring(13, 14));
        setSaSrvMovTipo(linha.substring(14, 15));
        setSaSrvMovCodigo(linha.substring(15, 17));
        setSaFavCamara(linha.substring(17, 20));
        setSaFavBanco(linha.substring(20, 23));
        setSaFavContAgencia(linha.substring(23, 28));
        setSaFavContAgenciaDv(linha.substring(28, 29));
        setSaFavContConta(linha.substring(29, 41));
        setSaFavContContaDv(linha.substring(41, 42));
        setSaFavContDv(linha.substring(42, 43));
        setSaFavNome(linha.substring(43, 73));
        setSaCdtSeuNumero(linha.substring(73, 93));
        setSaCdtDataPgto(linha.substring(93, 101));
        setSaCdtMoedaTipo(linha.substring(101, 104));
        setSaCdtMoedaQtde(linha.substring(104, 119));
        setSaCdtValorPgto(linha.substring(119, 134));
        setSaCdtNossoNumero(linha.substring(134, 154));
        setSaCdtDataReal(linha.substring(154, 162));
        setSaCdtValorReal(linha.substring(162, 177));
        setSaInformacao2(linha.substring(177, 217));
        setSasaInformacaoPoupanca(linha.substring(177, 179));
        setSaCodFinDoc(linha.substring(217, 219));
        setSaCodFinTed(linha.substring(219, 224));
        setSaCodFinComplementar(linha.substring(224, 226));
        setSaCnab(linha.substring(226, 229));
        setSaAviso(linha.substring(229, 230));
        setSaOcorrencias(linha.substring(230, 240));
    }
    
    public String getSaCtrBanco() {
        return this.saCtrBanco;
    }
    
    public void setSaCtrBanco(String saCtrBanco) {
        this.saCtrBanco = saCtrBanco;
    }
    
    public String getSaCtrLote() {
        return this.saCtrLote;
    }
    
    public void setSaCtrLote(String saCtrLote) {
        this.saCtrLote = saCtrLote;
    }
    
    public String getSaCtrRegistro() {
        return this.saCtrRegistro;
    }
    
    public void setSaCtrRegistro(String saCtrRegistro) {
        this.saCtrRegistro = saCtrRegistro;
    }
    
    public String getSaSrvRegistro() {
        return this.saSrvRegistro;
    }
    
    public void setSaSrvRegistro(String saSrvRegistro) {
        this.saSrvRegistro = saSrvRegistro;
    }
    
    public String getSaSrvSegmento() {
        return this.saSrvSegmento;
    }
    
    public void setSaSrvSegmento(String saSrvSegmento) {
        this.saSrvSegmento = saSrvSegmento;
    }
    
    public String getSaSrvMovTipo() {
        return this.saSrvMovTipo;
    }
    
    public void setSaSrvMovTipo(String saSrvMovTipo) {
        this.saSrvMovTipo = saSrvMovTipo;
    }
    
    public String getSaSrvMovCodigo() {
        return this.saSrvMovCodigo;
    }
    
    public void setSaSrvMovCodigo(String saSrvMovCodigo) {
        this.saSrvMovCodigo = saSrvMovCodigo;
    }
    
    public String getSaFavCamara() {
        return this.saFavCamara;
    }
    
    public void setSaFavCamara(String saFavCamara) {
        this.saFavCamara = saFavCamara;
    }
    
    public String getSaFavBanco() {
        return this.saFavBanco;
    }
    
    public void setSaFavBanco(String saFavBanco) {
        this.saFavBanco = saFavBanco;
    }
    
    public String getSaFavContAgencia() {
        return this.saFavContAgencia;
    }
    
    public void setSaFavContAgencia(String saFavContAgencia) {
        this.saFavContAgencia = saFavContAgencia;
    }
    
    public String getSaFavContAgenciaDv() {
        return this.saFavContAgenciaDv;
    }
    
    public void setSaFavContAgenciaDv(String saFavContAgenciaDv) {
        this.saFavContAgenciaDv = saFavContAgenciaDv;
    }
    
    public String getSaFavContConta() {
        return this.saFavContConta;
    }
    
    public void setSaFavContConta(String saFavContConta) {
        this.saFavContConta = saFavContConta;
    }
    
    public String getSaFavContContaDv() {
        return this.saFavContContaDv;
    }
    
    public void setSaFavContContaDv(String saFavContContaDv) {
        this.saFavContContaDv = saFavContContaDv;
    }
    
    public String getSaFavContDv() {
        return this.saFavContDv;
    }
    
    public void setSaFavContDv(String saFavContDv) {
        this.saFavContDv = saFavContDv;
    }
    
    public String getSaFavNome() {
        return this.saFavNome;
    }
    
    public void setSaFavNome(String saFavNome) {
        this.saFavNome = saFavNome;
    }
    
    public String getSaCdtSeuNumero() {
        return this.saCdtSeuNumero;
    }
    
    public void setSaCdtSeuNumero(String saCdtSeuNumero) {
        this.saCdtSeuNumero = saCdtSeuNumero;
    }
    
    public String getSaCdtDataPgto() {
        return this.saCdtDataPgto;
    }
    
    public void setSaCdtDataPgto(String saCdtDataPgto) {
        this.saCdtDataPgto = saCdtDataPgto;
    }
    
    public String getSaCdtMoedaTipo() {
        return this.saCdtMoedaTipo;
    }
    
    public void setSaCdtMoedaTipo(String saCdtMoedaTipo) {
        this.saCdtMoedaTipo = saCdtMoedaTipo;
    }
    
    public String getSaCdtMoedaQtde() {
        return this.saCdtMoedaQtde;
    }
    
    public void setSaCdtMoedaQtde(String saCdtMoedaQtde) {
        this.saCdtMoedaQtde = saCdtMoedaQtde;
    }
    
    public String getSaCdtValorPgto() {
        return this.saCdtValorPgto;
    }
    
    public void setSaCdtValorPgto(String saCdtValorPgto) {
        this.saCdtValorPgto = saCdtValorPgto;
    }
    
    public String getSaCdtNossoNumero() {
        return this.saCdtNossoNumero;
    }
    
    public void setSaCdtNossoNumero(String saCdtNossoNumero) {
        this.saCdtNossoNumero = saCdtNossoNumero;
    }
    
    public String getSaCdtDataReal() {
        return this.saCdtDataReal;
    }
    
    public void setSaCdtDataReal(String saCdtDataReal) {
        this.saCdtDataReal = saCdtDataReal;
    }
    
    public String getSaCdtValorReal() {
        return this.saCdtValorReal;
    }
    
    public void setSaCdtValorReal(String saCdtValorReal) {
        this.saCdtValorReal = saCdtValorReal;
    }
    
    public String getSaInformacao2() {
        return this.saInformacao2;
    }
    
    public void setSaInformacao2(String saInformacao2) {
        this.saInformacao2 = saInformacao2;
    }
    
    public String getSasaInformacaoPoupanca() {
        return this.saInformacaoPoupanca;
    }
    
    public void setSasaInformacaoPoupanca(String poupanca) {
        this.saInformacaoPoupanca = poupanca;
    }
    
    public String getSaCodFinDoc() {
        return this.saCodFinDoc;
    }
    
    public void setSaCodFinDoc(String saCodFinDoc) {
        this.saCodFinDoc = saCodFinDoc;
    }
    
    public String getSaCodFinTed() {
        return this.saCodFinTed;
    }
    
    public void setSaCodFinTed(String saCodFinTed) {
        this.saCodFinTed = saCodFinTed;
    }
    
    public String getSaCodFinComplementar() {
        return this.saCodFinComplementar;
    }
    
    public void setSaCodFinComplementar(String saCodFinComplementar) {
        this.saCodFinComplementar = saCodFinComplementar;
    }
    
    public String getSaCnab() {
        return this.saCnab;
    }
    
    public void setSaCnab(String saCnab) {
        this.saCnab = saCnab;
    }
    
    public String getSaAviso() {
        return this.saAviso;
    }
    
    public void setSaAviso(String saAviso) {
        this.saAviso = saAviso;
    }
    
    public String getSaOcorrencias() {
        return this.saOcorrencias;
    }
    
    public void setSaOcorrencias(String saOcorrencias) {
        this.saOcorrencias = saOcorrencias;
    }
        
    @Override
    public String toString() {
        return ("Controle"+
                "\n\tCódigo          : " + this.getSaCtrBanco() + 
                "\n\tLote            : " + this.getSaCtrLote() +
                "\n\tRegistro        : " + this.getSaCtrRegistro() +
                "\nServiço" +
                "\n\tRegistro        : " + this.getSaSrvRegistro() +
                "\n\tSegmento        : " + this.getSaSrvSegmento() +
                "\n\tTipo Movimento  : " + this.getSaSrvMovTipo() +
                "\n\tCodigo Movimento: " + this.getSaSrvMovCodigo() +
                "\nFavorecido" +
                "\n\tCamara          : " + this.getSaFavCamara() +
                "\n\tBanco           : " + this.getSaFavBanco() +
                "\n\tAgencia         : " + this.getSaFavContAgencia() +
                "\n\tAgencia Dv      : " + this.getSaFavContAgenciaDv() +
                "\n\tConta           : " + this.getSaFavContConta() +
                "\n\tConta Dv        : " + this.getSaFavContContaDv() +
                "\n\tDv              : " + this.getSaFavContDv() + "Tamanho: " + this.getSaFavContDv().length() + 
                "\n\tNome            : " + this.getSaFavNome() +
                "\nCrédito" +
                "\n\tSeu Numero      : " + this.getSaCdtSeuNumero() + "Tamanho: " + this.getSaCdtSeuNumero().length() +
                "\n\tData Pgto       : " + this.getSaCdtDataPgto() +
                "\n\tMoeda Tipo      : " + this.getSaCdtMoedaTipo() +
                "\n\tMoeda Qtde      : " + this.getSaCdtMoedaQtde() +
                "\n\tValor Pgto      : " + this.getSaCdtValorPgto() +
                "\n\tNosso Numero    : " + this.getSaCdtNossoNumero() +
                "\n\tData Real       : " + this.getSaCdtDataReal() +
                "\n\tValor Real      : " + this.getSaCdtValorReal() +
                "\nInformacao2             : " + this.getSaInformacao2()  + "Tamanho: " + this.getSaInformacao2().length() +
                "\n- Poupança              : " + this.getSasaInformacaoPoupanca() +
                "\nCodigo Finalidade Doc   : " + this.getSaCodFinDoc() +
                "\nCodigo Finalidade Ted   : " + this.getSaCodFinTed() +
                "\n\tCodFinComplementar    : " + this.getSaCodFinComplementar() +
                "\nCnab                    : " + this.getSaCnab()  + "Tamanho: " +  this.getSaCnab().length() +
                "\nAviso                   : " + this.getSaAviso()  + "Tamanho: " +  this.getSaAviso().length() +
                "\nOcorrencias             : " + this.getSaOcorrencias());
    }
        
}

