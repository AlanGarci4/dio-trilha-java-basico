public class ContaCorrente extends Conta {

    @Override
    public void imprimirExtrato() {
       System.out.println("Extrato Conta Corrente");
       imprimirInfosComuns();
        
    }

    @Override
    protected void contaTransferida(double valor) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'contaTransferida'");
    }
    
          
}
