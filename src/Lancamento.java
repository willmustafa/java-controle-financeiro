import java.util.Date;

public abstract class Lancamento {
	
	private int id; 					//id do lançamento
	private String descricao; 			//descricao do lançamento
	private String tipoLancamento; //tipo de despesa?
	private Conta conta; 				//qual conta de origem está entrando ou saindo o valor
	private Date data;
	private double valor;
	
	public Lancamento (String tipo, String descricao, Conta conta, double valor) {
		this.tipoLancamento = tipo;
		this.descricao = descricao;
		this.conta = conta;
		//this.data = data;
		this.valor = valor;
	}
	
	
	public String getTipoLancamento() {
		return this.tipoLancamento;
	}
	
	public String getDescricao() {
		return this.descricao;
	}
	
	public double getValor() {
		return this.valor;
	}
	
	public String getConta() {
		return conta.getBanco();
	}

}
