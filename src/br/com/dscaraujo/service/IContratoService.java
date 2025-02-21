package br.com.dscaraujo.service;

public interface IContratoService {

    String salvar();

    String buscar(Long id);

    void excluir(Long id);

    void atualizar(Long id, String novoValor);
}
