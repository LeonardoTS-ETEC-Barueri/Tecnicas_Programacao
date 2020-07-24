package CRUD;

import interfaces.*;    // O asterisco permite que você importe tudo que existe no pacote interfaces.
                        // Cuidado ao fazer isso, geralmente importamos apenas o que necessitamos.

public class PessoaFisicaCRUD implements PessoaCRUDInterface {    // Em "implements" - Assinamos o "contrato" de implementar o que estava em nossa interface.

    
    // Implementação dos Métodos Abstratos.
    
    @Override // Isso é um "Javadoc" - Diz que esse método existe em algum lugar e está sendo re-escrito aqui.
    public void createPessoa(String nome) {
        // Normalmente fariamos conexão com o Banco de Dados, jogariamos na tabela, etc...
        // Por questões didáticas vamos fazer um exeplo de forma abstrata.
        
        System.out.println("CHAMADA DO MÉTODO CREATE");
    }

    @Override
    public void readPessoa() {
        System.out.println("CHAMADA DO MÉTODO READ");
    }

    @Override
    public void updatePessoa(String nome) {
        System.out.println("CHAMADA DO MÉTODO UPDATE");
    }

    @Override
    public void deletePessoa(String nome) {
        System.out.println("CHAMADA DO MÉTODO DELETE");
    }
    
    // Se o cliente em sua regra de negócio disser que precisamos de um CRUD para Pessoas Jurídicas... Veja na outra classe CRUD.
    
}
