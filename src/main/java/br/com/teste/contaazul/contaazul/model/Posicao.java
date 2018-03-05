package br.com.teste.contaazul.contaazul.model;

public class Posicao {

    private int x;
    private int y;

    public Posicao() {
        this.x = 0;
        this.y = 0;
    }

    public Posicao(int x, int y) {
        if(x < 0 || y < 0 ) {
            throw new IllegalArgumentException("A posição de X e Y não pode ser menor que 0.");
        }

        this.x = x;
        this.y = y;
    }

    public void incrementaX() {
        this.x ++;
    }

    public void decrementaX() {
        if(this.x <= 0) {
            throw new IllegalArgumentException("A posição X não pode ser menor que 0;");
        }
        this.x --;
    }

    public void incrementaY() {
        this.y ++;
    }

    public void decrementaY() {
        if(this.y <= 0) {
            throw new IllegalArgumentException("A posição Y não pode ser menor que 0;");
        }
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
