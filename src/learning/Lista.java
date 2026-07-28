package learning;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Lista {
    static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("Ryan");
        list.add("Marcos");
        list.add("Tom Holland");
        list.add("Dr. Doom");
        list.add("Ichi");
        list.add("Roman");
        list.add("Rato");

        System.out.println(list.size());

       for (String lista : list){
           System.out.println(lista);
           System.out.println("-----------------");
       }

       list.removeIf(lista -> lista.charAt(0) == 'M');
       for (String lista : list){
           System.out.println(lista);
       }

        System.out.println("_____________");
        System.out.println("Indice do Ryan: " + list.indexOf("Ryan"));
        System.out.println("Indice do RyanM: " + list.indexOf("RyanM"));
        System.out.println("-------------------------");

        List<String> filtro = list.stream().filter(lista -> lista.charAt(0) == 'R').collect(Collectors.toList());
        for (String lista2 : filtro){
            System.out.println(lista2);
        }

        System.out.println("----------------");
        //Achar alguem
        String name = list.stream().filter(lista -> lista.charAt(0) == 'R').findFirst().orElse(null);
        System.out.println(name);
        System.out.println("-------------");
        String name2 = list.stream().filter(lista -> lista.charAt(0) == 'J').findFirst().orElse(null);
        System.out.println(name2); //
    }
}
