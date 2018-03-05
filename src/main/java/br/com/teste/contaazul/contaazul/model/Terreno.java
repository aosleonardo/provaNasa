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
        if (eixoX < 0) {
            throw new IllegalArgumentException("Eixo X não pode ser menor que 0.");
        }
        this.eixoX = eixoX;
    }

    public int getEixoY() {
        return eixoY;
    }

    public void setEixoY(int eixoY) {
        if (eixoY < 0) {
            throw new IllegalArgumentException("Eixo Y não pode ser menor que 0.");
        }
        this.eixoY = eixoY;
    }
}
