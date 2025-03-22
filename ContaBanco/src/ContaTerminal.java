import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
    //Habilitando a funcionalidade do usuário digitar
        Scanner scanner = new Scanner(System.in);

    //Usuário insere os dados de sua conta:
        System.out.println("Por favor, digite o número da Agencia! ");
        int numero = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Por favor, digite a Agência: ");
        String agencia = scanner.nextLine();

        System.out.println("Por favor, digite o seu nome: ");
        String nome = scanner.nextLine();

        System.out.println("Por favor, digite o saldo: ");
        double saldo = scanner.nextDouble();
        scanner.nextLine();

    //Imprime a mensagem da criação da conta do usuário    
        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo é %.2f", nome, agencia, numero, saldo);
    
    }
}