package learning;

import java.util.Scanner;

public class exMatriz {
    static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int m = leitor.nextInt();
        int n = leitor.nextInt();

        int[][] mat = new int[m][n];

        for (int i=0; i<mat.length; i++){
            for (int j=0; j<mat[i].length; j++){
                mat[i][j] = leitor.nextInt();
            }
        }

        int x = leitor.nextInt();

        for (int i=0; i<mat.length; i++){
            for (int j=0; j<mat[i].length; j++){
                
            }
        }
    }
}
