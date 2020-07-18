package leonardots_lojaferramentas;

// Herança para Diferença
// Cliente é uma pessoa, porém tem profissão e um saldo que será usado para comprar o que a interessa.

public class Cliente extends Pessoa{

    // Atributos
    private String profissao;
    private double saldo;
    
    // Método Construtor
    public Cliente(String nome, int idade, Loja ondeEstou, String profissao, double saldo){
        super(nome, idade, ondeEstou);
        this.profissao = profissao;
        this.saldo = saldo;
    }
    
    // Métodos Especiais (Getters/Setters)
    public String getProfissao() {
        return profissao;
    }
    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    // Métodos Personalizados
    @Override
    public String toString() {
        return String.format( "Cliente %s, %d anos {profissao=%s, saldo=%.2f}", super.getNome(), super.getIdade(), this.getProfissao(), this.getSaldo());
    }

}
