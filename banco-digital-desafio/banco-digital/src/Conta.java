public abstract class Conta implements IConta {
    
    private static final int AGENCIA_PDRAO = 1;
    private static int SEQUENCIAL = 1;

    protected int agencia;
    protected int numero;
    protected double saldo;

    public Conta(){
         this.agencia = AGENCIA_PDRAO;
         this.numero = SEQUENCIAL++;
        
    }   
    
    @Override
    public void sacar(double valor) {
        saldo -= valor;
    }

    @Override
    public void despositar(double valor) {
        saldo += valor;
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.despositar(valor);
    }
       
    protected abstract void contaTransferida(double valor);

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }
    protected void imprimirInfosComuns() {
        System.out.println(String.format("Agencia: %d", this.agencia));
        System.out.println(String.format("Numero: %d", this.numero));
        System.out.println(String.format("Saldo: %.2f", this.saldo));
    }

}
