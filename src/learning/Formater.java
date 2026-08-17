package learning;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Formater {
    static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        LocalDate d01 = LocalDate.now();
        LocalDateTime d05 = LocalDateTime.parse("2025-08-06T10:56:23");
        Instant d06 = Instant.parse("2026-08-06T10:57:26Z");


        DateTimeFormatter ftm1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("d01 = " + d01.format(ftm1));
    }
}
