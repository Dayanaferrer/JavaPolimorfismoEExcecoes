
public class ContaPoupanca extends Conta {
	
public ContaPoupanca(int agencia, int numero) {
		
		//Chama o construtor especifico
		super(agencia, numero);
	}

@Override
public void deposita(double valor) {
	super.saldo += valor;
	
}

}

