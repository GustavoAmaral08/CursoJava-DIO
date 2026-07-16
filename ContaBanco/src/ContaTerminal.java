import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Declaração das variáveis
        int numero;
        String agencia;
        String nomeCliente;
        double saldo;

        // Entrada de dados
        System.out.print("Por favor, digite o número da Conta: ");
        numero = scanner.nextInt();

        scanner.nextLine();

        System.out.print("Por favor, digite o número da Agência: ");
        agencia = scanner.nextLine();

        System.out.print("Por favor, digite o nome do Cliente: ");
        nomeCliente = scanner.nextLine();

        System.out.print("Por favor, digite o saldo da Conta: ");
        saldo = scanner.nextDouble();

        // Mensagem final
        String mensagem = "Olá "
                .concat(nomeCliente)
                .concat(", obrigado por criar uma conta em nosso banco, sua agência é ")
                .concat(agencia)
                .concat(", conta ")
                .concat(String.valueOf(numero))
                .concat(" e seu saldo ")
                .concat(String.valueOf(saldo))
                .concat(" já está disponível para saque.");

        System.out.println();
        System.out.println(mensagem);

        scanner.close();
    }
}