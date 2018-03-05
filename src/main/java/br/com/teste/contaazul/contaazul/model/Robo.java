package br.com.teste.contaazul.contaazul.model;

import br.com.teste.contaazul.contaazul.enuns.OrientacaoEnum;
import br.com.teste.contaazul.contaazul.exception.BadRequestException;

public class Robo {

    private Coordenada coordenada;
    private Terreno terreno;

    public Robo() {}

    public void ligar(Terreno terreno, Coordenada coordenada) {
        this.coordenada = coordenada;
        this.terreno = terreno;
    }

    public void executarComandos(Comando comando) {
        comando.comados().forEach(c -> {
            if(comando.mover(c)){
                if(OrientacaoEnum.NORTE.equals(this.getCoordenada().getOrientacao()) || OrientacaoEnum.SUL.equals(this.getCoordenada().getOrientacao())) {
                    andarEixoY();                
                } else {
                    andarEixoX();
                }
            }else {
                this.getCoordenada().vira(c);
            }
            posicaoValida();
        });
    }

    private void posicaoValida() {
        if(this.coordenada.getPosicao().getX() < 0 || this.coordenada.getPosicao().getX() > this.terreno.getEixoX() - 1
           || this.coordenada.getPosicao().getY() < 0 || this.coordenada.getPosicao().getY() > this.terreno.getEixoY() - 1) {
            throw new BadRequestException("Posição invalida.");
        }
    }

    private void andarEixoX() {
        if(OrientacaoEnum.LESTE.equals(this.getCoordenada().getOrientacao())) {
            this.getCoordenada().getPosicao().incrementaX();
        } else {
            this.getCoordenada().getPosicao().decrementaX();
        }
    }

    private void andarEixoY() {
        if(OrientacaoEnum.NORTE.equals(this.getCoordenada().getOrientacao())) {
            this.getCoordenada().getPosicao().incrementaY();
        } else {
            this.getCoordenada().getPosicao().decrementaY();
        }
    }

    public String desligar(){
        return getCoordenada().toString();
    }

    public Coordenada getCoordenada() {
        return coordenada;
    }

      public Terreno getTerreno() {
        return terreno;
    }
}
