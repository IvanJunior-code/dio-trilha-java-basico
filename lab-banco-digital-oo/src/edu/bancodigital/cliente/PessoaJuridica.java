package edu.bancodigital.cliente;

public class PessoaJuridica extends Cliente {
    
    private String cnpj;

    public PessoaJuridica(String nome, String endereco, String cnpj) {
        super(nome, endereco);
        this.cnpj = cnpj;
    }
    
    public String getCNPJ() {
        return cnpj;
    }

    public void setCNPJ(String cnpj) {
        this.cnpj = cnpj;
    }

    public void emitirFaturaServico() {
        System.out.println("Emitindo Fatura de Serviço da conta empresarial.");
    }

}
