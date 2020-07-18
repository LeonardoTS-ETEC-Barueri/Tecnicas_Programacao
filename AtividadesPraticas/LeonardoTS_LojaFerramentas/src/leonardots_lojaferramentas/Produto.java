package leonardots_lojaferramentas;

// Permite o cadastro dos produtos para que sejam adicionados à lista da loja.

public class Produto {
    
    // Atributos
    private String nome, descricao;
    private double preco;
    
    // Método Construtor
    public Produto(String nome, String descricao, double preco){
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
    }
    
    // Métodos Especiais (Getters/Setters)
    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getDescricao(){
        return this.descricao;
    }
    public void setDescricao(String desc){
        this.descricao = desc;
    }
    
    public double getPreco(){
        return preco;
    }
    public void setPreco(double preco){
        this.preco = preco;
    }
    
    // Métodos Personalizados
    @Override
    public String toString() {
        return "Produto{" + "nome=" + nome + ", descricao=" + descricao + ", preco=" + preco + '}';
    }

    

   
}
