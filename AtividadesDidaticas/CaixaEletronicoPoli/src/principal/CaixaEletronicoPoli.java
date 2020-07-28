package principal;


public class CaixaEletronicoPoli {


    public static void main(String[] args) {

        ContaComum objCC = new ContaComum();
        ContaEspecial objCE = new ContaEspecial();
        
        System.out.println("= TESTE CONTA COMUM =");
        objCC.verificarSaldo();
        System.out.println("");
        System.out.println("= TESTE CONTA ESPECIAL =");
        objCE.verificarSaldo();
        System.out.println("");
        
        //Conta objC = new Conta();     // Não pode ser instânciado por ser uma Classe Abstrata que serve apenas de modelo para suas herdeiras, possibilitando, mas não obrigando, a herança e o polimorfismo de seus métodos.
    }
    
}
