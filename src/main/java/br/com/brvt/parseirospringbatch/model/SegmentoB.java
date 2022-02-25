package br.com.brvt.parseirospringbatch.model;

public class SegmentoB extends Cnab240BB  {

    private String sbCtrBanco;
    private String sbCtrLote;
    private String sbCtrRegistro;
    private String sbSrvRegisto;
    private String sbSrvSegmento;
    private String sbCnab1;
    private String sbDCompFavInscTipo;
    private String sbDCompFavInscNumero;
    private String sbDCompFavLogradouro;
    private String sbDCompFavNumero;
    private String sbDCompFavComplemento;
    private String sbDCompFavBairro;
    private String sbDCompFavCidade;
    private String sbDCompFavCep;
    private String sbDCompFavCepComplemento;
    private String sbDCompFavEstado;
    private String sbDCompPagVencimento;
    private String sbDCompPagVlrDocumento;
    private String sbDCompPagVlrAbatimento;
    private String sbDCompPagVlrDesconto;
    private String sbDCompPagVlrMora;
    private String sbDCompPagVlrMulta;
    private String sbDCompCodDocumento;
    private String sbAviso;
    private String sbUG;
    private String sbISPB;
    
    public SegmentoB (String linha) {
        setSbCtrBanco(linha.substring(0, 3));
        setSbCtrLote(linha.substring(3, 7));
        setSbCtrRegistro(linha.substring(7, 8));
        setSbSrvRegistro(linha.substring(8, 13));
        setSbSrvSegmento(linha.substring(13, 14));
        setSbCnab1(linha.substring(14, 17));
        setSbDCompFavInscTipo(linha.substring(17, 18));
        setSbDCompFavInscNumero(linha.substring(18, 32));
        setSbDCompFavLogradouro(linha.substring(32, 62));
        setSbDCompFavNumero(linha.substring(62, 67));
        setSbDCompFavComplemento(linha.substring(67, 82));
        setSbDCompFavBairro(linha.substring(82, 97));
        setSbDCompFavCidade(linha.substring(97, 117));
        setSbDCompFavCep(linha.substring(117, 122));
        setSbDCompFavCepComplemento(linha.substring(122, 125));
        setSbDCompFavEstado(linha.substring(125, 127));
        setSbDCompPagVencimento(linha.substring(127, 135));
        setSbDCompPagVlrDocumento(linha.substring(135, 150));
        setSbDCompPagVlrAbatimento(linha.substring(150, 165));
        setSbDCompPagVlrDesconto(linha.substring(165, 180));
        setSbDCompPagVlrMora(linha.substring(180, 195));
        setSbDCompPagVlrMulta(linha.substring(195, 210));
        setSbDCompCodDocumento(linha.substring(210, 225));
        setSbAviso(linha.substring(225, 226));
        setSbUG(linha.substring(226, 232));
        setSbISPB(linha.substring(232, 240));
    }

    public String getSbCtrBanco() {
        return this.sbCtrBanco;
    }

    public void setSbCtrBanco(String sbCtrBanco) {
        this.sbCtrBanco = sbCtrBanco;
    }

    public String getSbCtrLote() {
        return this.sbCtrLote;
    }

    public void setSbCtrLote(String sbCtrLote) {
        this.sbCtrLote = sbCtrLote;
    }

    public String getSbCtrRegistro() {
        return this.sbCtrRegistro;
    }

    public void setSbCtrRegistro(String sbCtrRegistro) {
        this.sbCtrRegistro = sbCtrRegistro;
    }

    public String getSbSrvRegistro() {
        return this.sbSrvRegisto;
    }

    public void setSbSrvRegistro(String sbSrvRegistro) {
        this.sbSrvRegisto = sbSrvRegistro;
    }

    public String getSbSrvSegmento() {
        return this.sbSrvSegmento;
    }

    public void setSbSrvSegmento(String sbSrvSegmento) {
        this.sbSrvSegmento = sbSrvSegmento;
    }

    public String getSbCnab1() {
        return this.sbCnab1;
    }

    public void setSbCnab1(String sbCnab1) {
        this.sbCnab1 = sbCnab1;
    }

    public String getSbDCompFavInscTipo() {
        return this.sbDCompFavInscTipo;
    }

    public void setSbDCompFavInscTipo(String sbDComppFavInscTipo) {
        this.sbDCompFavInscTipo = sbDComppFavInscTipo;
    }

    public String getSbDCompFavInscNumero() {
        return this.sbDCompFavInscNumero;
    }

    public void setSbDCompFavInscNumero(String sbDComppFavInscNumero) {
        this.sbDCompFavInscNumero = sbDComppFavInscNumero;
    }

    public String getSbDCompFavLogradouro() {
        return this.sbDCompFavLogradouro;
    }

    public void setSbDCompFavLogradouro(String sbDCompFavLogradouro) {
        this.sbDCompFavLogradouro = sbDCompFavLogradouro;
    }

    public String getSbDCompFavNumero() {
        return this.sbDCompFavNumero;
    }

    public void setSbDCompFavNumero(String sbDCompFavNumero) {
        this.sbDCompFavNumero = sbDCompFavNumero;
    }

    public String getSbDCompFavComplemento() {
        return this.sbDCompFavComplemento;
    }

    public void setSbDCompFavComplemento(String sbDCompFavComplemento) {
        this.sbDCompFavComplemento = sbDCompFavComplemento;
    }

    public String getSbDCompFavBairro() {
        return this.sbDCompFavBairro;
    }

    public void setSbDCompFavBairro(String sbDCompFavBairro) {
        this.sbDCompFavBairro = sbDCompFavBairro;
    }

    public String getSbDCompFavCidade() {
        return this.sbDCompFavCidade;
    }

    public void setSbDCompFavCidade(String sbDCompFavCidade) {
        this.sbDCompFavCidade = sbDCompFavCidade;
    }

    public String getSbDCompFavCep() {
        return this.sbDCompFavCep;
    }

    public void setSbDCompFavCep(String sbDCompFavCep) {
        this.sbDCompFavCep = sbDCompFavCep;
    }

    public String getSbDCompFavCepComplemento() {
        return this.sbDCompFavCepComplemento;
    }

    public void setSbDCompFavCepComplemento(String sbDCompFavCepComplemento) {
        this.sbDCompFavCepComplemento = sbDCompFavCepComplemento;
    }

    public String getSbDCompFavEstado() {
        return this.sbDCompFavEstado;
    }

    public void setSbDCompFavEstado(String sbDCompFavEstado) {
        this.sbDCompFavEstado = sbDCompFavEstado;
    }

    public String getSbDCompPagVencimento() {
        return this.sbDCompPagVencimento;
    }

    public void setSbDCompPagVencimento(String sbDCompPagVencimento) {
        this.sbDCompPagVencimento = sbDCompPagVencimento;
    }

    public String getSbDCompPagVlrDocumento() {
        return this.sbDCompPagVlrDocumento;
    }

    public void setSbDCompPagVlrDocumento(String sbDCompPagVlrDocumento) {
        this.sbDCompPagVlrDocumento = sbDCompPagVlrDocumento;
    }

    public String getSbDCompPagVlrAbatimento() {
        return this.sbDCompPagVlrAbatimento;
    }

    public void setSbDCompPagVlrAbatimento(String sbDCompPagVlrAbatimento) {
        this.sbDCompPagVlrAbatimento = sbDCompPagVlrAbatimento;
    }

    public String getSbDCompPagVlrDesconto() {
        return this.sbDCompPagVlrDesconto;
    }

    public void setSbDCompPagVlrDesconto(String sbDCompPagVlrDesconto) {
        this.sbDCompPagVlrDesconto = sbDCompPagVlrDesconto;
    }

    public String getSbDCompPagVlrMora() {
        return this.sbDCompPagVlrMora;
    }

    public void setSbDCompPagVlrMora(String sbDCompPagVlrMora) {
        this.sbDCompPagVlrMora = sbDCompPagVlrMora;
    }

    public String getSbDCompPagVlrMulta() {
        return this.sbDCompPagVlrMulta;
    }

    public void setSbDCompPagVlrMulta(String sbDCompPagVlrMulta) {
        this.sbDCompPagVlrMulta = sbDCompPagVlrMulta;
    }

    public String getSbDCompCodDocumento() {
        return this.sbDCompCodDocumento;
    }

    public void setSbDCompCodDocumento(String sbDCompCodDocumento) {
        this.sbDCompCodDocumento = sbDCompCodDocumento;
    }

    public String getSbAviso() {
        return this.sbAviso;
    }

    public void setSbAviso(String sbAviso) {
        this.sbAviso = sbAviso;
    }

    public String getSbUG() {
        return this.sbUG;
    }

    public void setSbUG(String sbUG) {
        this.sbUG = sbUG;
    }

    public String getSbISPB() {
        return this.sbISPB;
    }

    public void setSbISPB(String sbISPB) {
        this.sbISPB = sbISPB;
    }

    @Override
    public String toString() {
        return  ("Controle"+
                "\n\tCódigo            : " + this.getSbCtrBanco() + 
                "\n\tLote              : " + this.getSbCtrLote() +
                "\n\tRegistro          : " + this.getSbCtrRegistro() +
                "\nServiço" +
                "\n\tRegistro          : " + this.getSbSrvRegistro() +
                "\n\tSegmento          : " + this.getSbSrvSegmento() +
                "\nCnab                      : " + this.getSbCnab1() + "Tamanho: " + this.getSbCnab1().length() +
                "\nDados Complementares" +
                "\n- Favorecido" +
                "\n-- Inscricão" +
                "\n\t Tipo Inscrição   : " + this.getSbDCompFavInscTipo() + "Tamanho: " + this.getSbDCompFavInscTipo().length() +
                "\n\t Número Inscrição : " + this.getSbDCompFavInscNumero()  + "Tamanho: " + this.getSbDCompFavInscNumero().length() +
                "\n\tLogradouro        : " + this.getSbDCompFavLogradouro() + "Tamanho: " + this.getSbDCompFavLogradouro().length() +
                "\n\tNumero            : " + this.getSbDCompFavNumero()  + "Tamanho: " + this.getSbDCompFavNumero().length() +
                "\n\tComplemento       : " + this.getSbDCompFavComplemento()  + "Tamanho: " + this.getSbDCompFavComplemento().length() +
                "\n\tBairro            : " + this.getSbDCompFavBairro()  + "Tamanho: " + this.getSbDCompFavBairro().length() +
                "\n\tCidade            : " + this.getSbDCompFavCidade() + "Tamanho: " + this.getSbDCompFavCidade().length() +
                "\n\tCep               : " + this.getSbDCompFavCep()  + "Tamanho: " + this.getSbDCompFavCep().length() +
                "\n\tCepComplemento    : " + this.getSbDCompFavCepComplemento()  + "Tamanho: " + this.getSbDCompFavCepComplemento().length() +
                "\n\tEstado            : " + this.getSbDCompFavEstado() + "Tamanho: " + this.getSbDCompFavEstado().length() +
                "\n- Pagamento" +
                "\n\tVencimento        : " + this.getSbDCompPagVencimento() + "Tamanho: " + this.getSbDCompPagVencimento().length() +
                "\n\tValor Documento   : " + this.getSbDCompPagVlrDocumento() + "Tamanho: " + this.getSbDCompPagVlrDocumento().length() +
                "\n\tVaolr Abatimento  : " + this.getSbDCompPagVlrAbatimento() + "Tamanho: " + this.getSbDCompPagVlrAbatimento().length() +
                "\n\tValor Desconto    : " + this.getSbDCompPagVlrDesconto() + "Tamanho: " + this.getSbDCompPagVlrDesconto().length() +
                "\n\tValor Mora        : " + this.getSbDCompPagVlrMora() + "Tamanho: " + this.getSbDCompPagVlrMora().length() +
                "\n\tValor Multa       : " + this.getSbDCompPagVlrMulta() + "Tamanho: " + this.getSbDCompPagVlrMulta().length() +
                "\n\tCod\\Doc Favorecido : " + this.getSbDCompCodDocumento() + "Tamanho: " + this.getSbDCompCodDocumento().length() +
                "\nAviso                      : " + this.getSbAviso() + "Tamanho: " + this.getSbAviso().length() +
                "\n Código UG                 : " + this.getSbUG() + "Tamanho: " + this.getSbUG().length() +
                "\nISPB                       : " + this.getSbISPB() + "Tamanho: " + this.getSbISPB().length());
    }
}
