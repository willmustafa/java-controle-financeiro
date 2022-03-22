
public abstract class Conta {
	private double saldo;
	private String banco;

	
	public Conta(String banco, double saldo) {
		this.banco = banco;
		this.saldo = saldo;
	}

	public String getBanco() {
		return this.banco;
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	@Override
	public String toString() {
		return "Banco: " + this.banco + ", Saldo: " + this.saldo;
	}
}