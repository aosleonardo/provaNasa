package br.com.teste.contaazul.contaazul.controller;

import br.com.teste.contaazul.contaazul.ContaAzulApplicationTests;
import br.com.teste.contaazul.contaazul.exception.BadRequestException;
import br.com.teste.contaazul.contaazul.model.Comando;
import br.com.teste.contaazul.contaazul.model.Coordenada;
import br.com.teste.contaazul.contaazul.model.Robo;
import br.com.teste.contaazul.contaazul.model.Terreno;
import org.junit.Assert;
import org.junit.Test;

public class RoboTest extends ContaAzulApplicationTests {

    @Test(expected = NullPointerException.class)
    public void ligarDoRoboNaoPodeAceitarTerrenoNemCordenadasNull() {
        // Init
        Robo robo = new Robo();

        // Act
        robo.ligar(null, null);
    }

    @Test
    public void ligarEDesligarNaPosicaoPadraoDeveRetornarCoordenadaPadrao() {
        // Init
        Robo robo = new Robo();

        // Act
        robo.ligar(new Terreno(),new Coordenada());
        String resposta = robo.desligar();

        // Check
        Assert.assertEquals("(0,0,N)", resposta);
    }

    @Test(expected = BadRequestException.class)
    public void andarLimiteTerrenoX() {
        // Init
        Robo robo = new Robo();

        // Act
        robo.ligar(new Terreno(),new Coordenada());
        robo.executarComandos(new Comando("mmmmmmmmmmm"));
    }

    @Test(expected = BadRequestException.class)
    public void andarLimiteTerrenoY() {
        // Init
        Robo robo = new Robo();

        // Act
        robo.ligar(new Terreno(),new Coordenada());
        robo.executarComandos(new Comando("rmmmmmm"));
    }

    @Test(expected = BadRequestException.class)
    public void andarLimiteNegativoTerrenoX() {
        // Init
        Robo robo = new Robo();

        // Act
        robo.ligar(new Terreno(),new Coordenada());
        robo.executarComandos(new Comando("lmm"));
    }

    @Test(expected = BadRequestException.class)
    public void andarLimiteNegativoTerrenoY() {
        // Init
        Robo robo = new Robo();

        // Act
        robo.ligar(new Terreno(),new Coordenada());
        robo.executarComandos(new Comando("llmm"));
    }

}
