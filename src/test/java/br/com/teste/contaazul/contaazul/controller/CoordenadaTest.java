package br.com.teste.contaazul.contaazul.controller;

import br.com.teste.contaazul.contaazul.domain.ComandoEnum;
import br.com.teste.contaazul.contaazul.domain.OrientacaoEnum;
import br.com.teste.contaazul.contaazul.model.Coordenada;
import br.com.teste.contaazul.contaazul.model.Posicao;
import org.junit.Assert;
import org.junit.Test;

public class CoordenadaTest extends ContaAzulApplicationTests {

    @Test
    public void construtorDefaultCoordenadaDeveInicializarComOrientacaoNorteEPosicaoZeroZero() {
        // Init
        Coordenada coordenada = null;

        // Act
        coordenada = new Coordenada();

        // Check
        Assert.assertEquals(OrientacaoEnum.NORTE, coordenada.getOrientacao());
        Assert.assertEquals(0, coordenada.getPosicao().getX());
        Assert.assertEquals(0, coordenada.getPosicao().getY());
    }

    @Test (expected = NullPointerException.class)
    public void construtorCoordenadaNaoPodeAceitarParametrosNull() {
        // Init
        Coordenada coordenada = null;

        // Act
        coordenada = new Coordenada(null, null);
    }

    @Test (expected = NullPointerException.class)
    public void setOrientacaoNaoPodeAceitarNull() {
        // Init
        Coordenada coordenada = new Coordenada();

        // Act
        coordenada.setOrientacao(null);
    }

    @Test (expected = NullPointerException.class)
    public void setPosicaoNaoPodeAceitarNull() {
        // Init
        Coordenada coordenada = new Coordenada();

        // Act
        coordenada.setPosicao(null);
    }

    @Test
    public void aoNorteAoVirarParaEsquerdaAOrientacaoDeveSerOeste() {
        // Init
        Coordenada coordenada = new Coordenada();

        // Act
        coordenada.vira(ComandoEnum.ESQUERDA.getComando());

        // Check
        Assert.assertEquals(OrientacaoEnum.OESTE, coordenada.getOrientacao());
    }

    @Test
    public void aoNorteAoVirarParaDireitaAOrientacaoDeveSerLeste() {
        // Init
        Coordenada coordenada = new Coordenada();

        // Act
        coordenada.vira(ComandoEnum.DIREITA.getComando());

        // Check
        Assert.assertEquals(OrientacaoEnum.LESTE, coordenada.getOrientacao());
    }


    @Test
    public void aoSulAoVirarParaDireitaAOrientacaoDeveSerOeste() {
        // Init
        Coordenada coordenada = new Coordenada(OrientacaoEnum.SUL, new Posicao());

        // Act
        coordenada.vira(ComandoEnum.DIREITA.getComando());

        // Check
        Assert.assertEquals(OrientacaoEnum.OESTE, coordenada.getOrientacao());

    }

}
