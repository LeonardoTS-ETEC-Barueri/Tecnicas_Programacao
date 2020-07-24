package principal;

import CRUD.PessoaFisicaCRUD;
import CRUD.PessoaJuridicaCRUD;

public class Principal {

    public static void main(String[] args) {
        
        PessoaFisicaCRUD objFisica = new PessoaFisicaCRUD();
        PessoaJuridicaCRUD objJuridica = new PessoaJuridicaCRUD();
        
        objFisica.createPessoa("Betina Física");
        objFisica.readPessoa();
        objFisica.updatePessoa("Betina Física Testada");
        objFisica.deletePessoa("Betina Física Testada");
        
        objJuridica.createPessoa("Alfino Juridico");
        objJuridica.readPessoa();
        objJuridica.updatePessoa("Alfino Juridico Testado");
        objJuridica.deletePessoa("Alfina Juridico Testado");
    }
    
}
