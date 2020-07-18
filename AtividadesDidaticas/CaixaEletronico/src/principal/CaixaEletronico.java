package principal;

import java.util.Scanner;

public class CaixaEletronico {

	public static void main(String[] args) {
		
		Menu objMenu = new Menu();
		objMenu.listaMenu();
		
		Scanner objScanner = new Scanner(System.in);
		int opc = objScanner.nextInt();
		
		objMenu.verificarTipoConta(opc);
		

	}

}
