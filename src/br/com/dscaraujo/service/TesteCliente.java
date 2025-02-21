package br.com.dscaraujo;

public class TesteCliente {

    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void adicionarNome(String nome) {
        setNome(nome);
    }

    public void adicionarNome1(String nome) {
        setNome(nome);
    }

    public String buscarNome() {
        return nome;
    }

    public void excluirNome() {
        nome = null;
    }

    public void atualizarNome(String novoNome) {
        nome = novoNome;
    }
}