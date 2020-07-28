package principal;


public abstract class Conta {
    
    // Atributos
    private double saldo = 10000.00;
    // Método Construtor
    
    // Métodos Especiais (Getter/Setter)
    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    // Métodos Personalizados.
    public abstract void verificarSaldo();   // Note o ";" e a falta do corpo {}.

    
    
}
