public class ContaPoupanca extends Conta {

    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirSaldo() {
        System.out.println("====== Saldo da Conta Poupança ======");
        super.imprimirInfosComuns();
    }
    
}
