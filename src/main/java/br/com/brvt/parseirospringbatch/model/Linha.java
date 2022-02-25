package br.com.brvt.parseirospringbatch.model;

public class Linha {

    private String linha;
    private String linhaCompleta;

    public Linha() {
    }

    public Linha(String linha) {
        this.linha = linha;
    }

    public Linha(String linha, String linhaCompleta) {
        this.linha = linha;
        this.linhaCompleta = linhaCompleta;
        colocaEspacos();

    }

    public String getLinha() {
        return this.linha;
    }

    public void setLinha(String linha) {
        this.linha = linha;
    }

    public String getLinhaCompleta() {
        return this.linhaCompleta;
    }

    public void setLinhaCompleta(String restanteLinha) {
        this.linhaCompleta = restanteLinha;
        colocaEspacos();
    }

    @Override
    public String toString() {
        return "{" +
            " linha='" + getLinha() + "'" +
            ", restanteLinha='" + getLinhaCompleta() + "'" +
            "}";
    }
  
    public void imprimeTipoLinha() {
		if (linha.matches("^00100000*")) {
			System.out.println("Header Arquivo:  " + linhaCompleta.length()/*.substring(0, 14)*/ + ".");
		}
        if (linha.matches("^001\\d\\d\\d\\d1C\\d\\d\\d\\d*")) {
			System.out.println("Header Lote AB:  " + linhaCompleta.length()/*.substring(0, 14)*/ + ".");
		} 
		if (linha.matches("^001\\d\\d\\d\\d3\\d\\d\\d\\d\\dA")) {
			System.out.println("Segmento A:      " + linhaCompleta.length()/*.substring(0, 14)*/ + ".");
		}
		if (linha.matches("^001\\d\\d\\d\\d3\\d\\d\\d\\d\\dB")) {
			System.out.println("Segmento B:      " + linhaCompleta.length()/*.substring(0, 14)*/ + ".");
		}
		if (linha.matches("^001\\d\\d\\d\\d3\\d\\d\\d\\d\\dZ")) {
			System.out.println("Segmento Z:      " + linhaCompleta.length()/*.substring(0, 14)*/ + ".");
		}
		if (linha.matches("^001\\d\\d\\d\\d5*")) {
			System.out.println("Trailer Lote AB: " + linhaCompleta.length()/*.substring(0, 14)*/ + ".");
		}
		if (linha.matches("^00199999*")) {
			System.out.println("Trailer Arquivo: " + linhaCompleta.length()/*.substring(0, 14)*/ + ".");
		}			
    }

    public void colocaEspacos () {
        if(linhaCompleta.length() != 240) {
            int qtdEspacos = 240 - linhaCompleta.length();
            for (int i = 0; i < qtdEspacos; i++) {
                linhaCompleta += " ";
            }
        }
    }

}
