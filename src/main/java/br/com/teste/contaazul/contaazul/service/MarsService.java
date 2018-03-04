package br.com.teste.contaazul.contaazul.service;

import br.com.teste.contaazul.contaazul.enuns.OrientacaoEnum;
import br.com.teste.contaazul.contaazul.model.*;
import org.springframework.stereotype.Service;

@Service
public class MarsService {
    public String executaComando(String comando) {
        Terreno terreno = new Terreno(5,5);
        Posicao posicao = new Posicao(0,0);
        Coordenada coordenada = new Coordenada(OrientacaoEnum.NORTE, posicao);

        Robo mars = new Robo();
        mars.ligar(terreno,coordenada);
        mars.executarComandos(new Comando(comando));
        return mars.desligar();
    }
}
