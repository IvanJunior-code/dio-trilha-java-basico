package edu.bancodigital.cliente;

import java.util.Optional;

public class PessoaFisica extends Cliente {

    private final String CPF;
    private PessoaFisica segundaPessoaFisica = null;

    public PessoaFisica(String nome, String endereco, String CPF) {
        super(nome, endereco);
        this.CPF = CPF;
    }

    public String getCPF() {
        return this.CPF;
    }

    public Optional<PessoaFisica> getSegundaPessoaFisica() {
        return Optional.ofNullable(this.segundaPessoaFisica);
    }

    public void setSegundaPessoaFisica(PessoaFisica segundaPessoaFisica) {
        if (segundaPessoaFisica == null) {
            throw new IllegalArgumentException("Para uma conta conjunta, a segunda pessoa deve ser informada.");
        } else {
            this.segundaPessoaFisica = segundaPessoaFisica;
            System.out.println(segundaPessoaFisica.getNome() + " vinculado(a) com sucesso.");
        }
    }

}
