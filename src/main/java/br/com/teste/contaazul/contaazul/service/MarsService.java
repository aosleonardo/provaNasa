package br.com.teste.contaazul.contaazul.service;

import br.com.teste.contaazul.contaazul.enuns.OrientacaoEnum;
import br.com.teste.contaazul.contaazul.model.*;
import org.springframework.stereotype.Service;

@Service
public class MarsService {
    public String executaComando(String comando) {
        Coordenada coordenada = new Coordenada(OrientacaoEnum.NORTE, new Posicao());

        Robo mars = new Robo();
        mars.ligar(new Terreno(),coordenada);
        mars.executarComandos(new Comando(comando));
        return mars.desligar();
    }
}
