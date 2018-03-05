package br.com.teste.contaazul.contaazul.service;

import br.com.teste.contaazul.contaazul.model.*;
import org.springframework.stereotype.Service;

@Service
public class MarsService {
    public String executaComando(String comando) {
        Coordenada coordenada = new Coordenada();

        Robo mars = new Robo();
        mars.ligar(new Terreno(),coordenada);
        mars.executarComandos(new Comando(comando));
        return mars.desligar();
    }
}
