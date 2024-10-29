package edu.bancodigital.cliente;

public class PessoaFisica extends Cliente {

    private final String CPF;
    private boolean contaConjunta = false;
    private PessoaFisica segundaPessoaFisica = null;

    public PessoaFisica(String nome, String endereco, String CPF) {
        super(nome, endereco);
        this.CPF = CPF;
    }

    public String getCPF() {
        return CPF;
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
