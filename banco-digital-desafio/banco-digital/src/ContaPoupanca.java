public class ContaPoupanca extends Conta {

    @Override
    public void imprimirExtrato() {
       System.out.println("Extrato Conta Poupança");
       imprimirInfosComuns();
        
    }

    @Override
    protected void contaTransferida(double valor) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'contaTransferida'");
    }
    
        
}
