/*  private int idade;  #Uso do Private, set

   public void setIdade(int novaIdade){
       if (novaIdade >= 18){
           this.idade = novaIdade;
       } else {
           System.out.println("Idade Errada");
       }
   }
} */

package learning;

import java.util.Scanner;

public class Pessoa {
    Scanner leitor = new Scanner(System.in);
    String sabor;

    public Pessoa() {
        this.sabor = "Mussarela";
        System.out.println("O Sabor tradicional é: " + sabor);
    }

    public Pessoa(String novoSabor) {
        this.sabor = novoSabor;

        System.out.println("Mas o novo sabor pode ser também: ");
        String novoSabor1 = leitor.next();

        System.out.println("O novo sabor é: " + novoSabor1);
    }

    static void main(String[] args) {

        Pessoa sabor = new Pessoa();
        Pessoa novoSabor1 = new Pessoa("Digite um sabor: ");
    }
}

/*
*/

