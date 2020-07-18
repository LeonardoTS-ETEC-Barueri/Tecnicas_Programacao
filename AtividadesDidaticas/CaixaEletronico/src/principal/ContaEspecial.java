package principal;

public class ContaEspecial extends Conta{
	
	private double limite = 1200;
	
	public String verificarSaldoEspecial() {
						//parse - conversão de tipo double > String
		String saldo = String.valueOf(super.verificarSaldo());
		
		return "Seu saldo atual é " + saldo + " Seu limite atual é " + limite;
		
	}

	public void realizarDepositoEspecial(double valor){

		super.realizarDeposito(valor);

	}
		
	public void realizarSaqueEspecial(double valor){
		
		if(valor < super.verificarSaldo()){

			super.realizarDeposito(valor);

		}else{
			
			double valorControle = valor - super.verificarSaldo();

			if(valorControle < limite){

				super.saldo = 0;
				limite -= valorControle;

			}else{

				System.out.println("Não é possível sacar esse valor");

			}

		}

	}

}
