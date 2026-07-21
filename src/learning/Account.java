package learning;

public class Account {

    private int numeroConta;
    private String titular;
    private double saldo;

    public Account(int numeroConta, String titular) {
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.saldo = 0.00;
    }

    public int getNumeroConta(int numeroConta){

        return numeroConta;
    }

    public String getTitular(String titular){

        return titular;
    }

    public void setTitular(String titular){

        this.titular = titular;
    }

    public void depositar(double valor){ //metodo de deposito

        saldo += valor;
    }

    public void retirar(double valor){ // metodo de sacar

        saldo -= (valor + 5.0);
    }

    public String toString(){

        return "Conta: " + numeroConta + "\nTitular: " + titular + "\nSaldo: " + saldo;
    }

}
