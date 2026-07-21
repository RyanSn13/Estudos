package learning;

import learning.Account;

import java.util.Scanner;

public class Program {
    static void main() {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o número da conta: ");
        int num = leitor.nextInt();

        System.out.println("Digite o seu nome: ");
        String nome = leitor.next();

        Account conta = new Account(num, nome);

        System.out.println();
        System.out.println("Dados da conta: ");
        System.out.println(conta);

        System.out.println("Valor que deseja depositar: ");
        double deposito = leitor.nextDouble();
        conta.depositar(deposito);

        System.out.println();
        System.out.println("Dados atualizados!: ");
        System.out.println(conta);

        System.out.println();
        System.out.println("Quanto deseja sacar: ");
        double saque = leitor.nextDouble();
        conta.retirar(saque);

        System.out.println();
        System.out.println("Dados atualizados!: ");
        System.out.println(conta);

    }
}
