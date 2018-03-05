package br.com.teste.contaazul.contaazul.model;

import br.com.teste.contaazul.contaazul.domain.ComandoEnum;
import br.com.teste.contaazul.contaazul.exception.BadRequestException;

import java.util.Arrays;
import java.util.List;

public class Comando {

    private String comando;

    public Comando() {}

    public Comando(String comando) {
        validarComando(comando);
        this.comando = comando;
    }

    public List<String> comados () {
        return  Arrays.asList(comando.toUpperCase().split(""));
    }

    public boolean mover(String comando) {
        return ComandoEnum.PASSO.toString().equals(comando);
    }

    public boolean esquerda(String comando) {
        return ComandoEnum.ESQUERDA.toString().equals(comando);
    }

    public boolean direita(String comando) {
        return ComandoEnum.DIREITA.toString().equals(comando);
    }

    private void validarComando(String comando) {
        if(!comando.toUpperCase().matches("[MLR]{1,}")) {
            throw new BadRequestException("Comando invalido.");
        }
    }
}


