package br.com.dscaraujo.dao;

public class ContratoDao implements IContratoDao {

    @Override
    public String salvar() {
        throw new UnsupportedOperationException("Não funciona com o banco");
    }

    @Override
    public String buscar(Long id) {
        throw new UnsupportedOperationException("Não funciona com o banco");
    }

    @Override
    public void excluir(Long id) {
        throw new UnsupportedOperationException("Não funciona com o banco");
    }

    @Override
    public void atualizar(Long id, String novoValor) {
        throw new UnsupportedOperationException("Não funciona com o banco");
    }
}