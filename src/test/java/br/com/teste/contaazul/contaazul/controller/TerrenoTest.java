package br.com.teste.contaazul.contaazul.controller;

import br.com.teste.contaazul.contaazul.model.Terreno;
import org.junit.Assert;
import org.junit.Test;

public class TerrenoTest extends ContaAzulApplicationTests {

    @Test
    public void construtorTerrenoDeveInicializarComDimensoes5por5() {
        // Init
        Terreno terreno = null;

        // Act
        terreno = new Terreno();

        // Check
        Assert.assertEquals(5l ,terreno.getEixoX());
        Assert.assertEquals(5l ,terreno.getEixoY());
    }

    @Test(expected = IllegalArgumentException.class)
    public void eixoYnaoPodeAceitarValorNegativo() {
        // Init
        Terreno terreno = new Terreno();

        // Act
        terreno.setEixoY(-1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void eixoXnaoPodeAceitarValorNegativo() {
        // Init
        Terreno terreno = new Terreno();

        // Act
        terreno.setEixoX(-1);
    }
}
