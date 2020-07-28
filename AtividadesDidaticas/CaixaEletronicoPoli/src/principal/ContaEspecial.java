package principal;

public class ContaEspecial extends Conta{
    
    // Atributos
    private double limite = 5000;
    
    // Método Construtor
    
    // Métodos Especiais (Getter/Setter)
    public double getLimite() {
        return limite;
    }
    public void setLimite(double limite) {
        this.limite = limite;
    }
    
    // Métodos Personalizados
    public void verificarSaldo(){   // Exemplo de Polimorfimos de Sobreposição (Subtype)
        System.out.println("[CONTA ESPECIAL] SEU SALDO ATUAL É DE R$: " + super.getSaldo());
        System.out.println("[CONTA ESPECIAL] SEU LIMITE ATUAL É DE R$: " + this.limite);
        System.out.println("[CONTA ESPECIAL] DISPONÍVEL PARA SAQUE R$: " + (super.getSaldo() + this.limite) );
    }

    
    
    
}
