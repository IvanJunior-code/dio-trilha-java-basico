package edu.bancodigital;

import java.util.List;

import edu.bancodigital.conta.Conta;

public class Banco {
    
    private String nome;
    private List<Conta> contas;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
