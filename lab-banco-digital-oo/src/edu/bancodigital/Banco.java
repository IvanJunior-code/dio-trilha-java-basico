package edu.bancodigital;

import edu.bancodigital.conta.Conta;
import java.util.ArrayList;
import java.util.List;

public class Banco {
    
    private final String nome;
    private List<Conta> contas;

    public Banco(String nome) {
        this.nome = nome;
        this.contas = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

}
