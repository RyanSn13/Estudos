package learning;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class DataHora {
    static void main(String[] args) {

        LocalDate d04 = LocalDate.parse("2022-07-20");
        LocalDateTime d05= LocalDateTime.parse("2022-07-20T01:30:26");
        Instant d06 = Instant.parse("2022-07-20T01:30:26Z");

        LocalDate r1 = LocalDate.ofInstant(d06, ZoneId.systemDefault());
        LocalDate r2 = LocalDate.ofInstant(d06, ZoneId.of("Portugal"));
        LocalDateTime r3 = LocalDateTime.ofInstant(d06, ZoneId.systemDefault());
        LocalDateTime r4 = LocalDateTime.ofInstant(d06, ZoneId.of("Portugal"));
        LocalDateTime r6 = LocalDateTime.now();

        DateTimeFormatter ftm1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter ftm2 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter ftm3 = DateTimeFormatter.ofPattern("dd/MM/yyyy").withZone(ZoneId.systemDefault());

        System.out.println("d04 = " + d04.format(ftm1));
        System.out.println("d04 = " + ftm1.format(d04));
        System.out.println("d04 = " + d04.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));

        System.out.println("d05 = " + d05.format(ftm1));
        System.out.println("d05 = " + d05.format(ftm2));

        System.out.println("d06 = " + ftm3.format(d06));

        System.out.println("----------------------------------");//

        System.out.println("r1 = " + r1);
        System.out.println("r2 = " + r2);
        System.out.println("r3 = " + r3);
        System.out.println("r4 = " + r4);

        System.out.println("------------------------");

        System.out.println("d04 dia = " + d04.getDayOfMonth());
        System.out.println("d04 dia = " + d04.getMonthValue());
        System.out.println("Hoje e data de Hoje: " + r6.getHour());



    }
}
