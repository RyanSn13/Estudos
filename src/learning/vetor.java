package learning;

import java.util.Scanner;

public class vetor {
    static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int n = leitor.nextInt();

        double[] vect = new double[n];

        for (int i=0; i<n; i++){
            vect[i] = leitor.nextDouble();
        }
        double sum = 0.0;
        for (int i=0; i<n; i++){
            sum += vect[i];
        }

        double avg = sum / n;

        System.out.println("Average: " + avg);
    }
}
