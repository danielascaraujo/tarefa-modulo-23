package br.com.dscaraujo.dao.mocks;

import br.com.dscaraujo.dao.IContratoDao;

import java.util.HashMap;
import java.util.Map;

public class ContratoDaoMock implements IContratoDao {

    private Map<Long, String> contratos = new HashMap<>();
    private Long ultimoId = 0L;

    @Override
    public String salvar() {
        ultimoId++;
        contratos.put(ultimoId, "Contrato " + ultimoId);
        return "Sucesso";
    }

    @Override
    public String buscar(Long id) {
        return contratos.get(id);
    }

    @Override
    public void excluir(Long id) {
        contratos.remove(id);
    }

    @Override
    public void atualizar(Long id, String novoValor) {
        if (contratos.containsKey(id)) {
            contratos.put(id, novoValor);
        }
    }
}