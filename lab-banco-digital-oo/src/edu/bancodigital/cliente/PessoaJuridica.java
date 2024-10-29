package edu.bancodigital.cliente;

public class PessoaJuridica extends Cliente {
    
    private final String CNPJ;

    public PessoaJuridica(String nome, String endereco, String CNPJ) {
        super(nome, endereco);
        this.CNPJ = CNPJ;
    }
    
    public String getCNPJ() {
        return CNPJ;
    }

    public void emitirFaturaServico() {
        System.out.println("Emitindo Fatura de Serviço da conta empresarial.");
    }

}
