package br.com.teste.contaazul.contaazul.enuns;

public enum CoordenadaEnum {
    LESTE("E"), NORTE("N"), OESTE("W"), SUL("S");

   private String coordenada;

    CoordenadaEnum(String coordenada) {
        this.coordenada = coordenada;
    }

    public String getCoordenada() {
        return coordenada;
    }

    public void setCoordenada(String coordenada) {
        this.coordenada = coordenada;
    }

    public static CoordenadaEnum virar(CoordenadaEnum orietacao, String direcao) {
        CoordenadaEnum controle = CoordenadaEnum.NORTE;

        if(CoordenadaEnum.LESTE.equals(orietacao)) {
            if(ComandoEnum.DIREITA.getComando().equals(direcao)) {
                controle = CoordenadaEnum.SUL;
            }
        }

        if(CoordenadaEnum.NORTE.equals(orietacao)) {
            if(ComandoEnum.ESQUERDA.getComando().equals(direcao)) {
                controle = CoordenadaEnum.OESTE;
            } else {
                controle = CoordenadaEnum.LESTE;
            }
        }

        if(CoordenadaEnum.SUL.equals(orietacao)) {
            if(ComandoEnum.ESQUERDA.getComando().equals(direcao)) {
                controle = CoordenadaEnum.LESTE;
            } else {
                controle = CoordenadaEnum.OESTE;
            }
        }

        if(CoordenadaEnum.OESTE.equals(orietacao)) {
            if(ComandoEnum.ESQUERDA.getComando().equals(direcao)) {
                controle = CoordenadaEnum.SUL;
            }
        }
        return controle;
    }
}
