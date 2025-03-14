import java.util.InputMismatchException;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numero = 0;
        String agencia;
        String nomeCliente;
        double saldo = 0;

        System.out.println("Por favor, digite o número da Agência !");
        agencia = scanner.next();

        try {
            System.out.println("Digite o numero da Conta !");
            numero = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Digite o saldo do Cliente !");
            saldo = scanner.nextDouble();
        } catch (InputMismatchException e) {
            System.out.println("Os campos numero da conta e saldo precisao ser numericos");
            return;
        } finally {
            scanner.close();
        }

        System.out.println("Digite o nome do Cliente !");
        nomeCliente = scanner.nextLine();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, " +
                "conta %d e seu saldo %.2f já está disponível para saque.", nomeCliente, agencia, numero, saldo);

        scanner.close();
    }
}
