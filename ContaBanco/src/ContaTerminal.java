import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o número da Agência: ");
        String agencia = scanner.nextLine();
        
        System.out.println("Digite a sua conta: ");
        String conta = scanner.nextLine();

        System.out.println("Digite o seu nome: ");
        String cliente = scanner.nextLine();
        
        System.out.println("Digite seu saldo R$ ");
        String saldo = scanner.nextLine();

        System.out.println("Olá " + cliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + conta + " e seu saldo R$ " + saldo + " já está disponível para saque.");


    }
}
