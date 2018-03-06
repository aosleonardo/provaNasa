package br.com.teste.contaazul.contaazul.controller;

import br.com.teste.contaazul.contaazul.exception.BadRequestException;
import br.com.teste.contaazul.contaazul.model.Posicao;
import org.junit.Assert;
import org.junit.Test;

public class PosicaoTest extends ContaAzulApplicationTests {

    @Test
    public void construtorDefaultPosicaoDeveIniciarEmZeroZero() {
        // Init
        Posicao posicao = null;

        // Act
        posicao = new Posicao();

        // Check
        Assert.assertEquals(0 ,posicao.getX());
        Assert.assertEquals(0 ,posicao.getY());
    }

    @Test
    public void construtorPosicaoDeveIniciarXYComValores() {
        // Init
        Posicao posicao = null;

        // Act
        posicao = new Posicao(1,2);

        // Check
        Assert.assertEquals(1 ,posicao.getX());
        Assert.assertEquals(2 ,posicao.getY());
    }


    @Test
    public void incrementaXDeveSomarUmAoValor() {
        // Init
        Posicao posicao = new Posicao(1,2);

        // Act
        posicao.incrementaX();

        // Check
        Assert.assertEquals(2 ,posicao.getX());
        Assert.assertEquals(2 ,posicao.getY());
    }


    @Test
    public void incrementaYDeveSomarUmAoValor() {
        // Init
        Posicao posicao = new Posicao(1,2);

        // Act
        posicao.incrementaY();

        // Check
        Assert.assertEquals(1 ,posicao.getX());
        Assert.assertEquals(3 ,posicao.getY());
    }

    @Test
    public void decrementaXDeveSubtrairUmAoValor() {
        // Init
        Posicao posicao = new Posicao(1,2);

        // Act
        posicao.decrementaX();;

        // Check
        Assert.assertEquals(0 ,posicao.getX());
        Assert.assertEquals(2 ,posicao.getY());
    }

    @Test
    public void decrementaYDeveSubtrairUmAoValor() {
        // Init
        Posicao posicao = new Posicao(1,2);

        // Act
        posicao.decrementaY();

        // Check
        Assert.assertEquals(1 ,posicao.getX());
        Assert.assertEquals(1 ,posicao.getY());
    }

    @Test( expected = IllegalArgumentException.class)
    public void construtorPosicaoNaoPodeAceitarValoresNegativosEmXComValores() {
        // Init
        Posicao posicao = null;

        // Act
        posicao = new Posicao(-1,2);
    }

    @Test( expected = IllegalArgumentException.class)
    public void construtorPosicaoNaoPodeAceitarValoresNegativosEmYComValores() {
        // Init
        Posicao posicao = null;

        // Act
        posicao = new Posicao(1,-2);

    }


    @Test( expected = BadRequestException.class)
    public void decrementaXNaoPodeAtribuirValorNegativo() {
        // Init
        Posicao posicao = new Posicao(0,2);

        // Act
        posicao.decrementaX();
    }

    @Test( expected = BadRequestException.class)
    public void decrementaYNaoPodeAtribuirValorNegativo() {
        // Init
        Posicao posicao = new Posicao(2,0);

        // Act
        posicao.decrementaY();
    }

}