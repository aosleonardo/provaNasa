package br.com.teste.contaazul.contaazul.enuns;

public enum ComandoEnum {
    PASSO(1, "M"), ESQUERDA(2,"L"), DIREITA(3,"R");
    
    private int value;
    private String comando;

    ComandoEnum(int value, String comando) {
        this.value = value;
        this.comando = comando;
    }

    @Override
    public String toString() {
        return this.getComando();
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getComando() {
        return comando;
    }

    public void setComando(String comando) {
        this.comando = comando;
    }

}
