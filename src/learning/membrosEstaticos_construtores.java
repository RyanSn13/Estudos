package learning;

public class membrosEstaticos_construtores {

    String cor;
    int velocidade;
    String modelo;

    static void main(String[] args) {

        membrosEstaticos_construtores carro1 = new membrosEstaticos_construtores();
        membrosEstaticos_construtores carro2 = new membrosEstaticos_construtores();
        membrosEstaticos_construtores carro3 = new membrosEstaticos_construtores();

        carro1.cor = "Vermelho";
        carro2.cor = "Azul";
        carro3.cor = "Preto";

        System.out.println(carro1.cor);
        System.out.println(carro2.cor);
        System.out.println(carro3.cor);
    }
}

