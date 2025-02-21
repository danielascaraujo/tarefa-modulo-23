package br.com.dscaraujo.dao;

public interface IContratoDao {
    String salvar(); // Modifique para retornar String para consistência com os mocks

    String buscar(Long id);
    void excluir(Long id);
    void atualizar(Long id, String novoValor);
}