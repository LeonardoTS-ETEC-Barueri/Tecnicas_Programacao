package principal;

public class Conta {
	
	//Coment�rio de linha.
	/*
	 * comet�rio
	 * de
	 * bloco
	 * */
	
	/*
	 VISIBILIDADE
	 public - Pode ser acessada sem restri��o alguma.
	 
	 protected - Pode ser acessada pela pr�pria classe
	 e suas herdeiras.
	 
	 private - S� pode ser acessada por sua pr�pria classe e
	 atrav�s de m�todos de visibilidade public ou protected.
	 
	 */
	
	/*DECLARAÇÃO DOS ATRIBUTOS*/
	public String nro_conta;
	public String nro_agencia;
	protected double saldo = 5000;

	
	/*M�TODO DE EXIBI��O DE SALDO*/
	/*
	1 - VISIBILIDADE
	2 - TIPO DE RETORNO (QUANDO HOUVER)
	3 - NOME
	4 - PARAMETROS (OPCIONAL)
	*/
	public double verificarSaldo() {
		
		//System.out.println("SALDO R$ " + this.saldo);
		return saldo;
		
	}
	
	/*M�TODO DE REALIZAR DEP�SITOS*/
	public void realizarDeposito(double valor){
		

		//      500  +  5000
		//saldo = valor + saldo; 
		saldo += valor;
		
	}
	
	/*M�TODO DE REALIZAR SAQUE*/
	public void realizarSaque(double valor) {
		
		//saldo = saldo - valor;
		saldo -= valor;
		
	}
	
}
