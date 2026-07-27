package learning;

import java.util.Scanner;

public class ConTa {

    private String nome;
    private int numeroC;
    private double saldo;

    public ConTa(String nome, int numeroC, double saldo){
        this.nome = nome;
        this.numeroC = numeroC;
        this.saldo = saldo;
    }

    public void getNome(){
        this.nome = nome;
    }
    public void getNumeroC(){
        this.numeroC = numeroC;
    }
    public void getSaldo(){
        this.saldo = saldo;
    }

    public String setNome(){
        return nome;
    }
    public int setNumeroC(){
        return numeroC;
    }
    public double setSaldo(){
        return saldo;
    }
    static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("-----------CONTA-----------");

        System.out.print("Digite o nome do titular da conta: ");
        String n = leitor.next();

        System.out.print("Digite o numero da conta: ");
        int num = leitor.nextInt();

        System.out.print("Digite o saldo da conta: ");
        double s = leitor.nextDouble();

        ConTa conta = new ConTa(n, num, s);

        System.out.println("--LOGIN--");

        System.out.println("Titular - " + conta.setNome());
        System.out.println("Número Conta - " + conta.setNumeroC());
        System.out.println("Saldo Disponível: " + conta.setSaldo());
        System.out.println("-----------");
    }
}
