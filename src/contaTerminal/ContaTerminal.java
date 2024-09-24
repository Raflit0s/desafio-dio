package contaTerminal;

import java.util.Scanner;

public class ContaTerminal {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

        System.out.print("Por favor, digite o número da Agência: ");
        int numero = sc.nextInt();
        sc.nextLine();

        System.out.print("Digite sua agência: ");
        String agencia = sc.nextLine();

        System.out.print("Digite seu nome: ");
        String nome = sc.nextLine();

        System.out.print("Digite seu saldo: ");
        double saldo = sc.nextDouble();

        System.out.println("Olá " + nome + " obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");

        sc.close();
	}
}
