package interfaces;


public interface PessoaCRUDInterface {
    
    // Toda classe necessitará ter um método para CRUD.
    // C'reate; R'ead; U'pdate; D'elete
    
    // Métodos abstratos.
    public void createPessoa(String nome);
    public void readPessoa();
    public void updatePessoa(String nome);
    public void deletePessoa(String nome);
    
    
}
