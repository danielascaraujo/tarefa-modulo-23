package br.com.dscaraujo.service;

import br.com.dscaraujo.dao.IClienteDao;

public class ClienteService {

    private IClienteDao clienteDao;

    public ClienteService(IClienteDao clienteDao) {
        this.clienteDao = clienteDao;
    }

    public String salvar() {
        return clienteDao.salvar();
    }
}