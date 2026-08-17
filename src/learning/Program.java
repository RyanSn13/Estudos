package learning;

import entities.Employee;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        List<Employee> list = new ArrayList<>();

        System.out.print("Quantos empregados vão ser registrados?:  ");
        int fun = leitor.nextInt();

        System.out.println("---------------------------");

        for (int i=0; i<fun; i++){
            System.out.println("Employeer #" + i + ":");

            System.out.print("Nome: \n");
            String nome = leitor.next();

            System.out.print("Id: \n");
            int Ide = leitor.nextInt();

            System.out.print("Salario: ");
            double salario = leitor.nextDouble();

            list.add(new Employee(Ide, nome, salario));
        }

        System.out.println("Digite o empregado que vai ganhar aumento: ");
        int id = leitor.nextInt();

        Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        if (emp == null){
            System.out.println("Id não encotrado!");
        } else {
            System.out.println("Digite a porcentagem: ");
            double porcent = leitor.nextDouble();
            emp.acrescimoSalario(porcent);
        }

        System.out.println("Listas dos Empregados");
        for (Employee obj : list){
            System.out.println(obj);
        }
        leitor.close();
    }
    public static boolean hasId(List<Employee> list, int id){
        Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        return emp != null;
    }
}