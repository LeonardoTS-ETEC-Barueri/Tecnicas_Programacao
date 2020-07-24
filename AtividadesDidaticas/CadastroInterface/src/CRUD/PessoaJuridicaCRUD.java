package CRUD;

import interfaces.PessoaCRUDInterface;

public class PessoaJuridicaCRUD implements PessoaCRUDInterface { // Mesmo na classe para PessoaJuridica, podemos usar a interface PessoaCRUDInterface.
    
    // Implementação dos Métodos Abstratos.
    
    @Override
    public void createPessoa(String nome) {       
        System.out.println("CHAMADA DO MÉTODO CREATE - JURÍDICA");
    }

    @Override
    public void readPessoa() {
        System.out.println("CHAMADA DO MÉTODO READ - JURÍDICA");
    }

    @Override
    public void updatePessoa(String nome) {
        System.out.println("CHAMADA DO MÉTODO UPDATE - JURÍDICA");
    }

    @Override
    public void deletePessoa(String nome) {
        System.out.println("CHAMADA DO MÉTODO DELETE - JURÍDICA");
    }
    
    // Teste as classes CRUD na classe principal...
}
