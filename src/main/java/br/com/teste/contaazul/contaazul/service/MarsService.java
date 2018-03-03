package br.com.teste.contaazul.contaazul.service;

import br.com.teste.contaazul.contaazul.enuns.ComandoEnum;
import br.com.teste.contaazul.contaazul.enuns.CoordenadaEnum;
import br.com.teste.contaazul.contaazul.exception.BadRequestException;
import br.com.teste.contaazul.contaazul.model.Robo;
import br.com.teste.contaazul.contaazul.model.Terreno;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class MarsService {
    public String executaComando(String comando) {
        validarComando(comando);

        Robo mars = new Robo(0,0, CoordenadaEnum.NORTE);
        List<String> comandos = Arrays.asList(comando.split(""));

        comandos.forEach(c -> {

            if(c.toUpperCase().equals(ComandoEnum.PASSO.toString())) {

                if(CoordenadaEnum.NORTE.equals(mars.getOrietacao()) || CoordenadaEnum.SUL.equals(mars.getOrietacao())) {
                    mars.andarEixoY();
                } else {
                    mars.andarEixoX();
                }
            } else {
                mars.virar(c.toUpperCase());
            }
        });

        validarPosicaoRoboTerreno(mars);
        return mars.toString();
    }

    private void validarPosicaoRoboTerreno(Robo robo) {
        Terreno terreno = new Terreno(5,5);
        if(!terreno.posicaoRoboTerrenoValida(robo)) {
            throw new BadRequestException();
        }
    }

    private void validarComando(String comando) {
        if(!comando.toUpperCase().matches("[MLR]{1,}")) {
            throw new BadRequestException();
        }
    }
}
