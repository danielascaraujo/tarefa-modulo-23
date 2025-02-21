package br.com.dscaraujo;

import br.com.dscaraujo.TesteCliente;
import org.junit.Assert;
import org.junit.Test;

public class TesteClienteTest {

    @Test
    public void testeClasseCliente() {
        TesteCliente cli = new TesteCliente();
        cli.adicionarNome("Isabel");
        cli.adicionarNome1("Isabel");

        Assert.assertEquals("Isabel", cli.getNome());
    }

    @Test
    public void testeBuscarNome() {
        TesteCliente cli = new TesteCliente();
        cli.adicionarNome("Isabel");
        String nome = cli.buscarNome();
        Assert.assertEquals("Isabel", nome);
    }

    @Test
    public void testeExcluirNome() {
        TesteCliente cli = new TesteCliente();
        cli.adicionarNome("Isabel");
        cli.excluirNome();
        Assert.assertNull(cli.getNome());
    }

    @Test
    public void testeAtualizarNome() {
        TesteCliente cli = new TesteCliente();
        cli.adicionarNome("Maria Carolina");
        cli.atualizarNome("Manuela");
        Assert.assertEquals("Manuela", cli.getNome());
    }
}