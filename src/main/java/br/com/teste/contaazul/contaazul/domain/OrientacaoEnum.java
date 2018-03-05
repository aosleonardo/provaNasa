package br.com.teste.contaazul.contaazul.domain;

public enum OrientacaoEnum {
    LESTE("E"), NORTE("N"), OESTE("W"), SUL("S");

   private String coordenada;

    OrientacaoEnum(String coordenada) {
        this.coordenada = coordenada;
    }

    public String getCoordenada() {
        return coordenada;
    }

    public void setCoordenada(String coordenada) {
        this.coordenada = coordenada;
    }

}
