package br.com.dscaraujo;

import br.com.dscaraujo.dao.ContratoDao;
import br.com.dscaraujo.dao.IContratoDao;
import br.com.dscaraujo.dao.mocks.ContratoDaoMock;
import br.com.dscaraujo.service.ContratoService;
import br.com.dscaraujo.service.IContratoService;
import org.junit.Assert;
import org.junit.Test;

public class ContratoServiceTest {

    @Test
    public void salvarTest() {
        IContratoDao dao = new ContratoDaoMock();
        IContratoService service = new ContratoService(dao);
        String retorno = service.salvar();
        Assert.assertEquals("Sucesso", retorno);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void esperadoErroNoSalvarComBancoDeDadosTest() {
        IContratoDao dao = new ContratoDao();
        IContratoService service = new ContratoService(dao);
        service.salvar(); // Não precisa do Assert aqui, pois a exceção já é verificada pelo @Test(expected)
    }

    @Test
    public void buscarTest() {
        IContratoDao dao = new ContratoDaoMock();
        IContratoService service = new ContratoService(dao);
        String contrato = service.buscar(1L);
        Assert.assertEquals("Contrato 1", contrato);
    }

    @Test
    public void excluirTest() {
        IContratoDao dao = new ContratoDaoMock();
        IContratoService service = new ContratoService(dao);
        service.excluir(1L);
        Assert.assertNull(service.buscar(1L));
    }

    @Test
    public void atualizarTest() {
        IContratoDao dao = new ContratoDaoMock();
        IContratoService service = new ContratoService(dao);
        service.atualizar(1L, "Contrato Atualizado");
        Assert.assertEquals("Contrato Atualizado", service.buscar(1L));
    }
}