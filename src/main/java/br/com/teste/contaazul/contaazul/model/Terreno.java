package br.com.teste.contaazul.contaazul.model;

public class Terreno {

    private int eixoX;
    private int eixoY;

    public Terreno() {
        this.eixoX = 5;
        this.eixoY = 5;

    }

    public Terreno(int eixoX, int eixoY) {
        this.eixoX = eixoX;
        this.eixoY = eixoY;
    }

    public int getEixoX() {
        return eixoX;
    }

    public void setEixoX(int eixoX) {
        this.eixoX = eixoX;
    }

    public int getEixoY() {
        return eixoY;
    }

    public void setEixoY(int eixoY) {
        this.eixoY = eixoY;
    }
}
