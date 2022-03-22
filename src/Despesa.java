
public class Despesa extends Lancamento {
	
	public Despesa(String tipo, String descricao, Conta conta, double valor) {
		super(tipo, descricao, conta, valor);
	}

	public String getTipoLancamento() {
		return super.getTipoLancamento();
	}
	
	public String getDescricao() {
		return super.getDescricao();
	}
	
	public double getValor() {
		return super.getValor();
	}
	
	public String getConta() {
		return super.getConta();
	}

}
