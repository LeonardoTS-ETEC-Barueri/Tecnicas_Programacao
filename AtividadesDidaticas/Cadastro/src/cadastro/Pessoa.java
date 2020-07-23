package cadastro;

public class Pessoa {
    
    // Atributos
    protected String nome;
    private String endereco;
    
    // Método Construtor
    
    // Métodos Especiais (Getter/Setter)
    public String getNome(){
        if (this.nome == null){
            this.setNome("");
            return this.nome;
        } else {
            return this.nome;
        }
    }
    protected void setNome(String nome){
        if (nome.isEmpty()){
            this.nome = "ERRO - Nome é obrigatório.";
        } else {
            this.nome = nome;
        }
    }
    
    // Métodos 
    
}
