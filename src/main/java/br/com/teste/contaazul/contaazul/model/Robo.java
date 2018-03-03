package br.com.teste.contaazul.contaazul.model;

import br.com.teste.contaazul.contaazul.enuns.CoordenadaEnum;

public class Robo {

    private int coordenadaX;
    private int coordenadaY;
    private CoordenadaEnum orietacao;

    public Robo() {}

    public Robo(int coordenadaX, int coordenadaY, CoordenadaEnum orietacao) {
        this.coordenadaX = coordenadaX;
        this.coordenadaY = coordenadaY;
        this.orietacao = orietacao;
    }

    public int getCoordenadaX() {
        return coordenadaX;
    }

    public void setCoordenadaX(int coordenadaX) {
        this.coordenadaX = coordenadaX;
    }

    public int getCoordenadaY() {
        return coordenadaY;
    }

    public void setCoordenadaY(int coordenadaY) {
        this.coordenadaY = coordenadaY;
    }

    public CoordenadaEnum getOrietacao() {
        return orietacao;
    }

    public void setOrietacao(CoordenadaEnum orietacao) {
        this.orietacao = orietacao;
    }

    public void andarEixoY() {
        if(CoordenadaEnum.NORTE.equals(this.getOrietacao())) {
            this.coordenadaY ++;
        } else {
            this.coordenadaY --;
        }
    }

    public void andarEixoX() {
        if(CoordenadaEnum.LESTE.equals(this.getOrietacao())) {
            this.coordenadaX ++;
        } else {
            this.coordenadaX --;
        }
    }

    public void virar(String direcao) {
        this.orietacao = CoordenadaEnum.virar(this.orietacao, direcao);
    }

    @Override
    public String toString() {
        return new StringBuffer("(").append(this.getCoordenadaX()).append(",").append(this.getCoordenadaY()).append(",")
                .append(this.getOrietacao().getCoordenada()).append(")").toString();
    }


}
