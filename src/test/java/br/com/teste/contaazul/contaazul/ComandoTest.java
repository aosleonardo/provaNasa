package br.com.teste.contaazul.contaazul;

import br.com.teste.contaazul.contaazul.domain.ComandoEnum;
import br.com.teste.contaazul.contaazul.exception.BadRequestException;
import br.com.teste.contaazul.contaazul.model.Comando;
import org.junit.Assert;
import org.junit.Test;

public class ComandoTest extends ContaAzulApplicationTests {

    @Test(expected = NullPointerException.class)
    public void construtorComandoNaoPodeAceitarComandoNull() {
        // Init
        Comando comando = null;

        // Act
        comando = new Comando(null);
    }

    @Test (expected = BadRequestException.class)
    public void comandoInvalidoDeveRetornarBadRequestException() {
        // Init
        Comando comando = null;

        // Act
        comando = new Comando("AHA!");
    }

    @Test
    public void comandoAceitaComandosValidos() {
        // Init
        Comando comando = null;

        // Act
        comando = new Comando("MMM");
    }

    @Test
    public void comandoMoverDeveSerVerdadeiroEmMover() {
        // Init
        final Comando comando = new Comando(ComandoEnum.PASSO.getComando());

        // Act / Check
        comando.comados().stream().forEach(c -> {
            Assert.assertEquals(true, comando.mover(c));
            Assert.assertEquals(false, comando.direita(c));
            Assert.assertEquals(false, comando.esquerda(c));

        });
    }

    @Test
    public void comandoDireitaDeveSerVerdadeiroEmDireita() {
        // Init
        final Comando comando = new Comando(ComandoEnum.DIREITA.getComando());

        // Act / Check
        comando.comados().stream().forEach(c -> {
            Assert.assertEquals(false, comando.mover(c));
            Assert.assertEquals(true, comando.direita(c));
            Assert.assertEquals(false, comando.esquerda(c));

        });
    }

    @Test
    public void comandoEsquerdaDeveSerVerdadeiroEmEsquerda() {
        // Init
        final Comando comando = new Comando(ComandoEnum.ESQUERDA.getComando());

        // Act / Check
        comando.comados().stream().forEach(c -> {
            Assert.assertEquals(false, comando.mover(c));
            Assert.assertEquals(false, comando.direita(c));
            Assert.assertEquals(true, comando.esquerda(c));

        });
    }
}
