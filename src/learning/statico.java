package learning;
/*
public class statico {
    String nome;
    static String Escola = "Escola ABC";

}
 */

public class statico {
    String cor;
    String modelo;

    public statico(String cor, String modelo){
        this.cor = cor;
        this.modelo = modelo;
    }

    static void main(String[] args) {

        statico carro = new statico("Azul", "AUDI");

        System.out.println(carro);
    }
    @Override
    public String toString(){
        return "Cor: " + cor  + " | Modelo: " + modelo;//
    }
}