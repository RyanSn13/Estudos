package entities; //Encapsulamento

public class Employee {

    private Integer id;
    private String name;
    private Double salary;

    public Employee(Integer id, String name, Double salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public void setName(){
        this.name = name;
    }
    public void setId(){
        this.id = id;
    }
    public void setSalary(){
        this.salary = salary;
    }
    public String getName(){
        return name;
    }
    public Integer getId(){
        return id;
    }
    public Double getSalary() {
        return salary;
    }

    public void acrescimoSalario(double porcent){
        salary += salary * porcent / 100.0;
    }
}
