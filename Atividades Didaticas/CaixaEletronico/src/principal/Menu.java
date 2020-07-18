
package principal;

import java.util.Scanner;

public class Menu {
	
	Conta objConta = null;
	ContaEspecial objContaEspecial = null;
	Scanner objScanner = null;
    
    public void listaMenu(){
        
        System.out.println("DIGITE 1 PARA CONTA COMUM");
        System.out.println("DIGITE 2 PARA CONTA ESPECIAL");
    }
    
    public void verificarTipoConta(int tipo){
    	
        if(tipo == 1){
        	
        	System.out.println("VOCÊ ACESSOU A CONTA COMUN");
        	objConta = new Conta();
        	opcoesConta();
            
        } else if (tipo == 2){
        	
        	System.out.println("VOCÊ ACESSOU A CONTA ESPECIAL");
        	objContaEspecial = new ContaEspecial();
        	opcoesContaEspecial();
            
        } else {
        	
        	System.out.println("OPÇÃO INVÁLIDA!");
            
        }
    }
    
    public void opcoesConta() {
    	
        int opc = 0;
        double valor = 0;
        
        // INICIO 
        while ( opc != 4 ){
            System.out.println("ESCOLHA O NUMERO DA OPERAÇÃO QUE DESEJA EXECUTAR:");
            System.out.println("1 - SALDO");
            System.out.println("2  -DEPÓSITO");
            System.out.println("3 - SAQUE");
            System.out.println("4 - SAIR");

            objScanner = new Scanner(System.in);

            opc = objScanner.nextInt();

            switch (opc) {

                            case 1:
                                    System.out.println("OPÇÃO 1  -SALDO");
                                    System.out.println("Seu saldo atual é de " + objConta.verificarSaldo());
                                    break;

                            case 2:
                                    System.out.println("OPÇÃO 2  -DEPÓSITO");
                                    System.out.println("DIGITE UM VALOR DE DEPÓSITO");
                                    valor = objScanner.nextDouble();
                                    objConta.realizarDeposito(valor);
                                    System.out.println("Seu saldo atual é de " + objConta.verificarSaldo());
                                    break;

                            case 3:
                                    System.out.println("OPÇÃO 3  -SAQUE");
                                    System.out.println("DIGITE UM VALOR DE SAQUE");
                                    valor = objScanner.nextDouble();
                                    objConta.realizarSaque(valor);
                                    System.out.println("Seu saldo atual é de " + objConta.verificarSaldo());
                                    break;

                            case 4:
                                    System.out.println("OPÇÃO 4  -SAIR");
                                    System.out.println("OBRIGADO!");
                                    System.exit(0);
                                    break;

                            default:
                                    System.out.println("OPÇÃO INVÁLIDA!");
                                    break;
                    }
        }
        // FIM        
    	
    }
    
    public void opcoesContaEspecial() {
    	
    	System.out.println("ESCOLHA O NUMERO DA OPERAÇÃO QUE DESEJA EXECUTAR:");
    	System.out.println("1 - SALDO");
    	System.out.println("2  -DEPÓSITO");
    	System.out.println("3 - SAQUE");
    	System.out.println("4 - SAIR");
    	
    	objScanner = new Scanner(System.in);
    	
    	int opc = objScanner.nextInt();
    	
    	switch (opc) {
    	
		case 1:
			System.out.println("OPÇÃO 1  -SALDO");
			System.out.println(objContaEspecial.verificarSaldoEspecial());
			break;
	
		case 2:
			System.out.println("OPÇÃO 2  -DEPÓSITO");	
			break;
	
		case 3:
			System.out.println("OPÇÃO 3  -SAQUE");
			break;
	
		case 4:
			System.out.println("OPÇÃO 4  -SAIR");
			System.out.println("OBRIGADO!");
			System.exit(0);
			break;

		default:
			System.out.println("OPÇÃO INVÁLIDA!");
			break;
	}
    	
    }
    
}
