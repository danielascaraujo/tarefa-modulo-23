package br.com.dscaraujo.service;

import br.com.dscaraujo.dao.IContratoDao;

public class ContratoService implements IContratoService {

    private IContratoDao contratoDao;

    public ContratoService(IContratoDao contratoDao) {
        this.contratoDao = contratoDao;
    }

    @Override
    public String salvar() {
        return contratoDao.salvar();
    }

    @Override
    public String buscar(Long id) {
        return contratoDao.buscar(id);
    }

    @Override
    public void excluir(Long id) {
        contratoDao.excluir(id);
    }

    @Override
    public void atualizar(Long id, String novoValor) {
        contratoDao.atualizar(id, novoValor);
    }
}