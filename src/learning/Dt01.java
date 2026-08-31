package learning;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Dt01 {
    static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Date y1 = sdf1.parse("30/08/2026");
        Date y2 = sdf2.parse("30/08/2026 20:34:15");
        Date x1 = new Date(); //Para Data atual
        Date x2 = new Date(System.currentTimeMillis());
        Date x3 = new Date(0L);

        System.out.println("y1: " + sdf2.format(y1));
        System.out.println("y2: " + sdf2.format(y2));
        System.out.println(x1);
        System.out.println(x2);
        System.out.println(x3);

        System.out.println("=----------------------");//


    }
}
