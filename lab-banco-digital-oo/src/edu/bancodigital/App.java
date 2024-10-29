package edu.bancodigital;

import edu.bancodigital.cliente.PessoaFisica;
import java.util.Optional;

public class App {

    public static void main(String[] args) throws Exception {

        PessoaFisica cliente1 = new PessoaFisica("Cliente 1 Pessoa Fisica", "Endereço do cliente 1", "111.111.111-11");
        PessoaFisica cliente2 = new PessoaFisica("Cliente 2 Pessoa Fisica", "Endereço do cliente 2", "222.222.222-22");

        System.out.println("CPF: " + cliente1.getCPF() + ".");
        System.out.println("Nome: " + cliente1.getNome() + ".");
        System.out.println("Endereço: " + cliente1.getEndereco() + ".");

        cliente1.setSegundaPessoaFisica(cliente2);
        Optional<PessoaFisica> segundaPessoaOpt = cliente1.getSegundaPessoaFisica();
        segundaPessoaOpt.ifPresentOrElse(
                segundaPessoa -> System.out.println("Nome da segunda pessoa: " + segundaPessoa.getNome()),
                () -> System.out.println("Não há uma segunda pessoa física definida.")
        );

        System.out.println("CPF: " + cliente2.getCPF() + ".");
        System.out.println("Nome: " + cliente2.getNome() + ".");
        System.out.println("Endereço: " + cliente2.getEndereco() + ".");
        //System.out.println("Conta conjunta? " + cliente2.getSegundaPessoaFisica().getNome() + ".");

        // Conta contaCorrente = new ContaCorrente(cliente1);
        // contaCorrente.imprimirSaldo();
        // contaCorrente.depositar(250);
        // contaCorrente.imprimirSaldo();
        // contaCorrente.sacar(50);
        // contaCorrente.imprimirSaldo();
        // System.out.println("\n\n");
        // Conta contaPoupanca = new ContaPoupanca(cliente1);
        // contaPoupanca.imprimirSaldo();
        // contaCorrente.transferir(150, contaPoupanca);
        // contaPoupanca.imprimirSaldo();
        // contaCorrente.imprimirSaldo();
    }
}
