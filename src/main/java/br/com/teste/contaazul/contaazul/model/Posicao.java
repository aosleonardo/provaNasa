package br.com.teste.contaazul.contaazul.model;

public class Posicao {

    private int x;
    private int y;

    public Posicao() {
        this.x = 0;
        this.y = 0;
    }

    public Posicao(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void incrementaX() {
        this.x ++;
    }

    public void decrementaX() {
        this.x --;
    }

    public void incrementaY() {
        this.y ++;
    }

    public void decrementaY() {
        this.y --;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
