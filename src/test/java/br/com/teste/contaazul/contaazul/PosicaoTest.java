package br.com.teste.contaazul.contaazul;

import br.com.teste.contaazul.contaazul.exception.BadRequestException;
import br.com.teste.contaazul.contaazul.model.Posicao;
import org.junit.Assert;
import org.junit.Test;

public class PosicaoTest extends ContaazulApplicationTests {

    @Test
    public void construtorDefaultPosicaoDeveIniciarEmZeroZero() {
        Posicao posicao = null;
        posicao = new Posicao();
        Assert.assertEquals(0 ,posicao.getX());
        Assert.assertEquals(0 ,posicao.getY());
    }

    @Test
    public void construtorPosicaoDeveIniciarXYComValores() {
        Posicao posicao = null;
        posicao = new Posicao(1,2);
        Assert.assertEquals(1 ,posicao.getX());
        Assert.assertEquals(2 ,posicao.getY());
    }


    @Test
    public void incrementaXDeveSomarUmAoValor() {
        Posicao posicao = new Posicao(1,2);
        posicao.incrementaX();
        Assert.assertEquals(2 ,posicao.getX());
        Assert.assertEquals(2 ,posicao.getY());
    }


    @Test
    public void incrementaYDeveSomarUmAoValor() {
        Posicao posicao = new Posicao(1,2);
        posicao.incrementaY();
        Assert.assertEquals(1 ,posicao.getX());
        Assert.assertEquals(3 ,posicao.getY());
    }

    @Test
    public void decrementaXDeveSubtrairUmAoValor() {
        Posicao posicao = new Posicao(1,2);
        posicao.decrementaX();;
        Assert.assertEquals(0 ,posicao.getX());
        Assert.assertEquals(2 ,posicao.getY());
    }

    @Test
    public void decrementaYDeveSubtrairUmAoValor() {
        Posicao posicao = new Posicao(1,2);
        posicao.decrementaY();
        Assert.assertEquals(1 ,posicao.getX());
        Assert.assertEquals(1 ,posicao.getY());
    }

    @Test( expected = IllegalArgumentException.class)
    public void construtorPosicaoNaoPodeAceitarValoresNegativosEmXComValores() {
        Posicao posicao = null;
        posicao = new Posicao(-1,2);
    }

    @Test( expected = IllegalArgumentException.class)
    public void construtorPosicaoNaoPodeAceitarValoresNegativosEmYComValores() {
        Posicao posicao = null;
        posicao = new Posicao(1,-2);

    }


    @Test( expected = BadRequestException.class)
    public void decrementaXNaoPodeAtribuirValorNegativo() {
        Posicao posicao = new Posicao(0,2);
        posicao.decrementaX();
    }

    @Test( expected = BadRequestException.class)
    public void decrementaYNaoPodeAtribuirValorNegativo() {
        Posicao posicao = new Posicao(2,0);
        posicao.decrementaY();
    }

}
