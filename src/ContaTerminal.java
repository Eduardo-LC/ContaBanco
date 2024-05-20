import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        // Cria um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita e lê o número da conta
        System.out.println("Por favor, digite o número da Conta!");
        int numero = scanner.nextInt();

        // Solicita e lê o número da agência
        System.out.println("Por favor, digite o número da Agência!");
        String agencia = scanner.next();

        // Solicita e lê o nome do cliente
        System.out.println("Por favor, digite o nome do Cliente!");
        scanner.nextLine();  // Consome a nova linha deixada pelo nextInt/next
        String nomeCliente = scanner.nextLine();

        // Solicita e lê o saldo da conta
        System.out.println("Por favor, digite o saldo da Conta!");
        double saldo = scanner.nextDouble();

        // Fecha o objeto scanner
        scanner.close();

        // Exibe a mensagem formatada
        String mensagem = "Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, " +
                "sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.";

        System.out.println(mensagem);
    }
}
