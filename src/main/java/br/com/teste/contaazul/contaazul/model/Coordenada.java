package br.com.teste.contaazul.contaazul.model;

import br.com.teste.contaazul.contaazul.enuns.ComandoEnum;
import br.com.teste.contaazul.contaazul.enuns.OrientacaoEnum;

public class Coordenada {

    private OrientacaoEnum orientacao;
    private Posicao posicao;

    public Coordenada() {
        this.orientacao = OrientacaoEnum.NORTE;
        this.posicao = new Posicao();
    }

    public Coordenada(OrientacaoEnum orientacao, Posicao posicao) {
        if(orientacao == null || posicao == null) {
            throw new NullPointerException();
        }
        this.orientacao = orientacao;
        this.posicao = posicao;
    }

    public void vira(String comando) {

        OrientacaoEnum controle = OrientacaoEnum.NORTE;

        if(OrientacaoEnum.LESTE.equals(this.getOrientacao())) {
            if(ComandoEnum.DIREITA.getComando().equals(comando)) {
                controle = OrientacaoEnum.SUL;
            }
        }

        if(OrientacaoEnum.NORTE.equals(this.getOrientacao())) {
            if(ComandoEnum.ESQUERDA.getComando().equals(comando)) {
                controle = OrientacaoEnum.OESTE;
            } else {
                controle = OrientacaoEnum.LESTE;
            }
        }

        if(OrientacaoEnum.SUL.equals(this.getOrientacao())) {
            if(ComandoEnum.ESQUERDA.getComando().equals(comando)) {
                controle = OrientacaoEnum.LESTE;
            } else {
                controle = OrientacaoEnum.OESTE;
            }
        }

        if(OrientacaoEnum.OESTE.equals(this.getOrientacao())) {
            if(ComandoEnum.ESQUERDA.getComando().equals(comando)) {
                controle = OrientacaoEnum.SUL;
            }
        }

        this.setOrientacao(controle);
    }

    public OrientacaoEnum getOrientacao() {
        return orientacao;
    }

    public void setOrientacao(OrientacaoEnum orientacao) {
        if(orientacao == null ) {
            throw new NullPointerException();
        }

        this.orientacao = orientacao;
    }

    public Posicao getPosicao() {
        return posicao;
    }

    public void setPosicao(Posicao posicao) {
        if(posicao == null ) {
            throw new NullPointerException();
        }
        this.posicao = posicao;
    }

    @Override
    public String toString() {
        return new StringBuffer("(").append(this.getPosicao().getX()).append(",").append(this.getPosicao().getY()).append(",")
                .append(this.getOrientacao().getCoordenada()).append(")").toString();
    }
}
