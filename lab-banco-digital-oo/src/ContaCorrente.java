public class ContaCorrente extends Conta {

    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirSaldo() {
        System.out.println("====== Saldo da Conta Corrente ======");
        super.imprimirInfosComuns();
    }
    
}
