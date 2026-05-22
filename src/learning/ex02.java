package learning;

import java.util.Scanner;

public class ex02 {
    static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        ex02_1 product = new ex02_1();
        System.out.println("Enter product data -  ");
        System.out.print("Name: ");

        product.name = leitor.nextLine();
        System.out.print("Price: ");
        product.price = leitor.nextDouble();

        System.out.print("Quantity in stock: ");
        product.quantity = leitor.nextInt();

        System.out.println("hi");

    }

}
