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
        return this.nome;
    }

    public void adicionarConta(Conta conta) {
        if (conta == null) {
            throw new IllegalArgumentException("A conta deve ser informada.");
        }
        this.contas.add(conta);
        System.out.println("Conta adicionada para o cliente " + conta.getCliente().getNome());
    }

    public List<Conta> listarContas() {
        return new ArrayList<>(this.contas);
    }

}
