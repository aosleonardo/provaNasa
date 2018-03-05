package br.com.teste.contaazul.contaazul;

import br.com.teste.contaazul.contaazul.model.Terreno;
import org.junit.Assert;
import org.junit.Test;

public class TerrenoTest extends ContaazulApplicationTests {

    @Test
    public void construtorTerrenoDeveInicializarComDimensoes5por5() {
        Terreno terreno = null;
        terreno = new Terreno();
        Assert.assertEquals(5l ,terreno.getEixoX());
        Assert.assertEquals(5l ,terreno.getEixoY());
    }

    @Test(expected = IllegalArgumentException.class)
    public void eixoYnaoPodeAceitarValorNegativo() {
        Terreno terreno = new Terreno();
        terreno.setEixoY(-1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void eixoXnaoPodeAceitarValorNegativo() {
        Terreno terreno = new Terreno();
        terreno.setEixoX(-1);
    }
}
