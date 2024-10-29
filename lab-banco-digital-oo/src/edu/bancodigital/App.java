package edu.bancodigital;

import edu.bancodigital.cliente.PessoaFisica;
import edu.bancodigital.conta.Conta;
import edu.bancodigital.conta.ContaCorrente;
import edu.bancodigital.conta.ContaPoupanca;
import java.util.Optional;

public class App {

    public static void main(String[] args) throws Exception {

        Banco banco = new Banco("Banco Teste");
        System.out.println(banco.getNome());

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

        Conta contaCorrente = new ContaCorrente(cliente1);
        banco.adicionarConta(contaCorrente);
        contaCorrente.imprimirSaldo();
        contaCorrente.depositar(250);
        contaCorrente.imprimirSaldo();
        contaCorrente.sacar(50);
        contaCorrente.imprimirSaldo();
        System.out.println("\n\n");
        Conta contaPoupanca = new ContaPoupanca(cliente1);
        banco.adicionarConta(contaPoupanca);
        contaPoupanca.imprimirSaldo();
        contaCorrente.transferir(150, contaPoupanca);
        contaPoupanca.imprimirSaldo();
        contaCorrente.imprimirSaldo();

        Conta contaPoupanca2 = new ContaPoupanca(cliente2);
        banco.adicionarConta(contaPoupanca2);
        contaPoupanca2.imprimirSaldo();
        contaPoupanca.transferir(1, contaPoupanca2);
        contaPoupanca2.imprimirSaldo();
        contaPoupanca.imprimirSaldo();

        System.out.println(banco.listarContas());
        System.out.println("Quantidade de contas que o banco possui: " + banco.mostrarQuantidadeContas());
        
    }
}
