package learning;

import java.util.Scanner;

public class PessoaID {

    private String nome;
    private int idade;

    public PessoaID(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public String getNome(){
        return nome;
    }

    public int getIdade(){
        return idade;
    }
    static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String n = leitor.next();

        System.out.println("Digite sua idade: ");
        int i = leitor.nextInt();

        PessoaID pessoa = new PessoaID(n, i);

        System.out.println("Nome = " + pessoa.getNome());
        System.out.println("Idade = " + pessoa.getIdade());
    }
}
