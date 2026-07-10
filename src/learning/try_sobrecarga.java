package learning;

public class try_sobrecarga {

    private String titular;
    private double saldo;

    // Construtor 1: Para quem abre a conta sem depósito inicial
    public try_sobrecarga(String titular) {
        this.titular = titular; // O 'this' diferencia o atributo do parâmetro
        this.saldo = 0.0;
    }

    // Construtor 2: Para quem abre a conta já depositando um valor
    public try_sobrecarga(String titular, double depositoInicial) {
        this(titular); // O 'this()' chama o Construtor 1 para não repetir código!
        if (depositoInicial > 0) {
            this.saldo = depositoInicial;
        }
    }

    // Depósito normal em dinheiro ou PIX
    public void depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
            System.out.println("Depósito de R$" + valor + " realizado para " + this.titular);
        }
    }

    public void depositar(double valor, String numeroCheque) {
        if (valor > 0) {
            this.saldo += valor;
            System.out.println("Cheque nº " + numeroCheque + " de R$" + valor + " compensado para " + this.titular);
        }
    }

    // --- 4. GETTERS E SETTERS (Portas de acesso do Encapsulamento) ---
    public double getSaldo() {
        return this.saldo;
    }

    public String getTitular() {
        return this.titular;
    }

    public void setTitular(String titular) {
        if (titular != null && !titular.trim().isEmpty()) {
            this.titular = titular;
        }
    }

    // --- MÉTODO PRINCIPAL PARA TESTAR ---
    public static void main(String[] args) {
        // Testando a Sobrecarga de Construtores
        try_sobrecarga conta1 = new try_sobrecarga("Thiago");
        try_sobrecarga conta2 = new try_sobrecarga("Maria", 500.0);

        System.out.println("--- Executando Depósitos ---");
        // Testando a Sobrecarga de Métodos
        conta1.depositar(150.0);
        conta2.depositar(1000.0, "CHQ-9982");

        System.out.println("\n--- Saldos Finais ---");
        // Mostrando os resultados usando os Getters
        System.out.println("Saldo do " + conta1.getTitular() + ": R$" + conta1.getSaldo());
        System.out.println("Saldo da " + conta2.getTitular() + ": R$" + conta2.getSaldo());
    }
}