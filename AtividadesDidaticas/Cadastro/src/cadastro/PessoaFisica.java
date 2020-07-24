package cadastro;

public class PessoaFisica extends Pessoa{
    
    // Atributos
    private String sobrenome;
    private String idadeString;
    private int idadeInt;
    
    // Método Construtor
    
    // SETTER E GETTER DE IDADE COM SOBRECARGA (OVERLOAD) APLICADO.
    public String getIdadeString() {
        return idadeString;
    }
    public void setIdade(String idadeString){
        this.idadeString = idadeString;
    }
    
    public int getIdadeInt(){
        return this.idadeInt;
    }
    public void setIdade(int idadeInt){
        this.idadeInt = idadeInt;
    }
    
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
        } else if (this.getIdadeInt() > 0){
            super.setNome(nome);
            this.setSobrenome(sobrenome);
            System.out.println("NOME COMPLETO: " + super.getNome() + " " + this.getSobrenome() + "\nIDADE: " + this.getIdadeInt());  
        } else if (Integer.parseInt(this.getIdadeString()) > 0){
            super.setNome(nome);
            this.setSobrenome(sobrenome);
            System.out.println("NOME COMPLETO: " + super.getNome() + " " + this.getSobrenome() + "\nIDADE: " + this.getIdadeString());
        } else {
            super.setNome(nome);
            this.setSobrenome(sobrenome);
            System.out.println("NOME COMPLETO: " + super.getNome() + " " + this.getSobrenome());
        }
    }
    
}
