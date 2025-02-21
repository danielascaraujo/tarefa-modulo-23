package br.com.dscaraujo;

import br.com.dscaraujo.dao.ClienteDao;
import br.com.dscaraujo.dao.ClienteDaoMock;
import br.com.dscaraujo.dao.IClienteDao;
import br.com.dscaraujo.service.ClienteService;
import org.junit.Assert;
import org.junit.Test;

public class ClienteServiceTest {

    @Test
    public void salvarTest() {
        IClienteDao mockDao = new ClienteDaoMock();
        ClienteService service = new ClienteService(mockDao);
        String retorno = service.salvar();
        Assert.assertEquals("Sucesso", retorno);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void esperadoErroNoSalvarTest() {
        IClienteDao dao = new ClienteDao();
        ClienteService service = new ClienteService(dao);
        service.salvar(); // Não precisa do Assert aqui, pois a exceção já é verificada pelo @Test(expected)
    }
}
