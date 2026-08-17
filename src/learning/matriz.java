package learning;

import java.util.Scanner;

public class matriz {
    static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int n = leitor.nextInt();

        int[][] mat = new int[n][n];

        for (int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                mat[i][j] = leitor.nextInt();
            }
        }

        for (int[] matriz : mat){
            for (int linha : matriz){
                System.out.print( "Matriz " + linha + " ");
            }
            System.out.println();
        }

    }
}
