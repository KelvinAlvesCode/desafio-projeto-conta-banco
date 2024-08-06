import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

    System.out.println("Por favor, digite o número da conta");
    int numeroConta = scanner.nextInt();

    scanner.nextLine();

    System.out.println("Por favor, digite o número da agência");
    String numeroAgencia = scanner.nextLine();

    System.out.println("Por favor, digite o nome do cliente");
    String nomeCliente = scanner.nextLine();

    System.out.println("Por favor, digite o saldo da conta");
    Double saldoConta = scanner.nextDouble();

    System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco!");
    System.out.println("Sua conta é " + numeroConta + "." + " Sua agência é " + numeroAgencia + ".");
    //System.out.println("Sua agência é " + numeroAgencia + ".");
    System.out.println("E seu saldo de " + saldoConta + " já está disponível para saque.");
    
    scanner.close();

    }
}
