package principal;


public class ContaComum extends Conta{
    // Atributos
    
    // Método Construtor
    
    // Métodos Especiais (Getter/Setter)
    
    // Métodos Personalizados.
    public void verificarSaldo(){   // Exemplo de Polimorfimos de Sobreposição (Subtype)
        System.out.println("[CONTA COMUM] SEU SALDO ATUAL É DE R$: " + super.getSaldo());
    }
}
