package learning;

import java.util.Scanner;

public class exercicioVetor {
    static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        double soma, media;

        System.out.print("Quantos números vc quer digitar? ");
        int qtd = leitor.nextInt();

        double[] vect = new double[qtd];

        for (int i=0; i<qtd; i++){
            System.out.print("Digite um número: ");
            vect[i] = leitor.nextDouble();
        }

        //soma
        soma = 0;
        for (int i=0; i<qtd; i++){
            soma += vect[i];
        }

        media = soma / qtd;

        System.out.print("Valores: ");

        for (int i=0; i<qtd; i++){
            System.out.println(vect[i]);
        }

        System.out.println("SOMA: " + soma);
        System.out.print("MEDIA: " + media);
    }
}
