public class App {
    public static void main(String[] args) throws Exception {

        Cliente cliente1 = new Cliente();
        cliente1.setNome("Cliente 1");

        Conta contaCorrente = new ContaCorrente(cliente1);
        contaCorrente.imprimirSaldo();
        contaCorrente.depositar(250);
        contaCorrente.imprimirSaldo();
        contaCorrente.sacar(50);
        contaCorrente.imprimirSaldo();

        System.out.println("\n\n");
        
        Conta contaPoupanca = new ContaPoupanca(cliente1);
        contaPoupanca.imprimirSaldo();

        contaCorrente.transferir(150, contaPoupanca);
        
        contaPoupanca.imprimirSaldo();
        contaCorrente.imprimirSaldo();

    }
}
