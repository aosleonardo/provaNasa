package br.com.teste.contaazul.contaazul;

import br.com.teste.contaazul.contaazul.enuns.ComandoEnum;
import br.com.teste.contaazul.contaazul.exception.BadRequestException;
import br.com.teste.contaazul.contaazul.model.Comando;
import org.junit.Assert;
import org.junit.Test;

public class ComandoTest extends ContaazulApplicationTests{

    @Test(expected = NullPointerException.class)
    public void construtorComandoNaoPodeAceitarComandoNull() {
        // Init
        Comando comando = null;
        comando = new Comando(null);
    }

    @Test (expected = BadRequestException.class)
    public void comandoInvalidoDeveRetornarBadRequestException() {
        Comando comando = null;
        comando = new Comando("AHA!");
    }

    @Test
    public void comandoAceitaComandosValidos() {
        Comando comando = null;
        comando = new Comando("MMM");
    }

    @Test
    public void comandoMoverDeveSerVerdadeiroEmMover() {
        final Comando comando = new Comando(ComandoEnum.PASSO.getComando());
        comando.comados().stream().forEach(c ->
        {
            Assert.assertEquals(true, comando.mover(c));
            Assert.assertEquals(false, comando.direita(c));
            Assert.assertEquals(false, comando.esquerda(c));

        });
    }

    @Test
    public void comandoDireitaDeveSerVerdadeiroEmDireita() {
        final Comando comando = new Comando(ComandoEnum.DIREITA.getComando());
        comando.comados().stream().forEach(c ->
        {
            Assert.assertEquals(false, comando.mover(c));
            Assert.assertEquals(true, comando.direita(c));
            Assert.assertEquals(false, comando.esquerda(c));

        });
    }

    @Test
    public void comandoEsquerdaDeveSerVerdadeiroEmEsquerda() {
        final Comando comando = new Comando(ComandoEnum.ESQUERDA.getComando());
        comando.comados().stream().forEach(c ->
        {
            Assert.assertEquals(false, comando.mover(c));
            Assert.assertEquals(false, comando.direita(c));
            Assert.assertEquals(true, comando.esquerda(c));

        });
    }
}
