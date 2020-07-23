package cadastro;

public class PessoaFisica extends Pessoa{
    
    // Atributos
    private String sobrenome;
    
    // Método Construtor
    
    // Métodos Especiais (Getter/Setter)
    public String getSobrenome(){
        return this.sobrenome;
    }
    public void setSobrenome(String sobrenome){
        this.sobrenome = sobrenome;
    }
    
    // Métodos Personalizados
    public void exibirNomeCompleto(String nome, String sobrenome){
        if ( (nome == null || nome.isEmpty()) || (sobrenome == null || sobrenome.isEmpty()) ){
            System.out.println("Erro nome ou sobrenome inválido");
        } else {
            super.setNome(nome);
            this.setSobrenome(sobrenome);
            System.out.println("NOME COMPLETO: " + super.getNome() + " " + this.getSobrenome());
        }
        
        
    }
    
}
