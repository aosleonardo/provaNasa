package br.com.teste.contaazul.contaazul;

import br.com.teste.contaazul.contaazul.enuns.ComandoEnum;
import br.com.teste.contaazul.contaazul.enuns.OrientacaoEnum;
import br.com.teste.contaazul.contaazul.model.Coordenada;
import br.com.teste.contaazul.contaazul.model.Posicao;
import org.junit.Assert;
import org.junit.Test;

public class CoordenadaTest extends ContaazulApplicationTests {

    @Test
    public void construtorDefaultCoordenadaDeveInicializarComOrientacaoNorteEPosicaoZeroZero() {
        Coordenada coordenada = null;
        coordenada = new Coordenada();
        Assert.assertEquals(OrientacaoEnum.NORTE, coordenada.getOrientacao());
        Assert.assertEquals(0, coordenada.getPosicao().getX());
        Assert.assertEquals(0, coordenada.getPosicao().getY());
    }

    @Test (expected = NullPointerException.class)
    public void construtorCoordenadaNaoPodeAceitarParametrosNull() {
        Coordenada coordenada = null;
        coordenada = new Coordenada(null, null);
    }

    @Test (expected = NullPointerException.class)
    public void setOrientacaoNaoPodeAceitarNull() {
        Coordenada coordenada = new Coordenada();
        coordenada.setOrientacao(null);
    }

    @Test (expected = NullPointerException.class)
    public void setPosicaoNaoPodeAceitarNull() {
        Coordenada coordenada = new Coordenada();
        coordenada.setPosicao(null);
    }

    @Test
    public void aoNorteAoVirarParaEsquerdaAOrientacaoDeveSerOeste() {
        Coordenada coordenada = new Coordenada();
        coordenada.vira(ComandoEnum.ESQUERDA.getComando());
        Assert.assertEquals(OrientacaoEnum.OESTE, coordenada.getOrientacao());
    }

    @Test
    public void aoNorteAoVirarParaDireitaAOrientacaoDeveSerLeste() {
        Coordenada coordenada = new Coordenada();
        coordenada.vira(ComandoEnum.DIREITA.getComando());
        Assert.assertEquals(OrientacaoEnum.LESTE, coordenada.getOrientacao());
    }


    @Test
    public void aoSulAoVirarParaDireitaAOrientacaoDeveSerOeste() {
        Coordenada coordenada = new Coordenada(OrientacaoEnum.SUL, new Posicao());
        coordenada.vira(ComandoEnum.DIREITA.getComando());
        Assert.assertEquals(OrientacaoEnum.OESTE, coordenada.getOrientacao());

    }

}
