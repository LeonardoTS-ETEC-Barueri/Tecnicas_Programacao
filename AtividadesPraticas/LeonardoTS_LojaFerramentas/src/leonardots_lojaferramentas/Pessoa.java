package leonardots_lojaferramentas;

// É simplesmente uma pessoa.

public abstract class Pessoa {
    
    // Atributos
    protected String nome, interesse;
    protected int idade;
    protected Loja ondeEstou;
    
    // Método Construtor
    public Pessoa(String nome, int idade, Loja ondeEstou){
        this.nome = nome;
        this.idade = idade;
        this.ondeEstou = ondeEstou;
    }
    
    // Métodos Especiais (Getters/Setters)
    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public int getIdade(){
        return this.idade;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }
    
    public String getInteresse() {
        return interesse;
    }
    public void setInteresse() {
        int seletorInteresse = (int) ( 1 + Math.random() * (this.getOndeEstou().getInventario().size() - 1) );
        this.interesse = this.getOndeEstou().getInventario().get(seletorInteresse).getNome();
    }
    public void setInteresse(String interesse){
        this.interesse = interesse;
    }
    public void setInteresse(int interesse){
        interesse--;
        try {
            this.interesse = this.getOndeEstou().getInventario().get(interesse).getNome();
        } catch (Exception IndexOutOfBoundsException) {
            System.out.println("Ops, a lista não vai até esse item.");
        }
    }

    public Loja getOndeEstou() {
        return ondeEstou;
    }
    public void setOndeEstou(Loja ondeEstou) {
        this.ondeEstou = ondeEstou;
    }
    
    // Métodos Personalizados
    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + ", interesse=" + interesse + ", idade=" + idade + '}';
    }
    

   
    
    
    
}
