package edu.bancodigital.cliente;

public class PessoaFisica extends Cliente {

    private String cpf;
    private boolean contaConjunta = false;
    private PessoaFisica segundaPessoaFisica = null;

    public PessoaFisica(String nome, String endereco, String cpf) {
        super(nome, endereco);
        this.cpf = cpf;
    }

    public String getCPF() {
        return cpf;
    }

    public void setCPF(String cpf) {
        this.cpf = cpf;
    }

    public boolean getContaConjunta() {
        return contaConjunta;
    }

    public void setContaConjunta(boolean conjunta, PessoaFisica segundaPessoaFisica) {
        if (conjunta && segundaPessoaFisica == null) {
            throw new IllegalArgumentException("Para uma conta conjunta, a segunda pessoa deve ser informada.");
        }
        this.contaConjunta = conjunta;
        
        if (conjunta) {
            setSegundaPessoaFisica(segundaPessoaFisica);
        } else {
            setSegundaPessoaFisica(null);
        }
    }

    public PessoaFisica getSegundaPessoaFisica() {
        return segundaPessoaFisica;
    }

    public void setSegundaPessoaFisica(PessoaFisica segundaPessoaFisica) {
        this.segundaPessoaFisica = segundaPessoaFisica;
    }

}