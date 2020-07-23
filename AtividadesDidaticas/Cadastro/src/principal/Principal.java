package principal;
import cadastro.Pessoa;
import cadastro.PessoaFisica;

public class Principal {


    public static void main(String[] args) {
        System.out.println("[1] ISSO É UM TESTE");
        
        //Pessoa objPessoa = new Pessoa();    // Um erro acontece. A classe Pessoa está no pacote 'cadastro' então devemos importá-la pra uso no pacote principal.
        
        //objPessoa.nome = "MeuNomeAqui";   // Sem encapsulamento.
        //System.out.println("NOME: " + objPessoa.nome); // com encapsulamento.
        
        //objPessoa.setNome("Alfino");
        //System.out.println("NOME: " + objPessoa.getNome());
        
        System.out.println("[2] ISSO É OUTRO TESTE");
        
        PessoaFisica objPessoaFisica = new PessoaFisica();
        
        objPessoaFisica.exibirNomeCompleto("", "");
        // Essa chamada dispara set/get da classe Pessoa -- dispara set/get da classe PessoaFisica.
        // Essa chamada resolverá o que desejamos, exibirá o nome completo concatenado da forma correta.
        
    }
    
}
