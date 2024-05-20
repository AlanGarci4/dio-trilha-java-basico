import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
       int numero = 1001-0;
       String agencia;
       String nomeCliente;
       double saldo = 0.00;
           
       Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
       
       System.out.println("Digite a Agência");
       agencia = scanner.next();

       System.out.println("Digite Seu Nome");
       nomeCliente = scanner.next();

       System.out.println("Olá " + nomeCliente + ", " + "obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero +" e o seu saldo de " + saldo + ", já está disponível para movimentações e saques.");
      
    }
}
