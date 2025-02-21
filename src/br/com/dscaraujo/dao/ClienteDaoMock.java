package br.com.dscaraujo.dao;

public class ClienteDaoMock implements IClienteDao {

    @Override
    public String salvar() {
        return "Sucesso"; // Retorna "Sucesso" para simular um salvamento bem-sucedido
    }
}
