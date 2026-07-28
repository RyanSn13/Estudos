package learning;

import java.util.Scanner;

public class negativoNum {
    static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Quantos numeros quer digitar? ");
        int num = leitor.nextInt();

        int[] vect = new int[num];

        for (int i=0; i<num; i++){
            System.out.println("Digite um número: ");
            vect[i] = leitor.nextInt();
        }

        System.out.println("Numeros negativos");
        for (int i=0; i<num; i++){
            if (vect[i] < 0){
                System.out.println(vect[i]);
            }
        }

    }
}
