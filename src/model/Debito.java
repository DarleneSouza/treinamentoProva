package model;

import java.sql.Time;

public class Debito extends Pagamento{
	private double desconto;

	public Debito(Time hora, double valor, double desconto) {
		super(hora, valor);
		this.desconto = desconto;
	}

	public double getDesconto() {
		return desconto;
	}

	public void setDesconto(double desconto) {
		this.desconto = desconto;
	}
	
	@Override
	public String descricaoPagamento() {
		return "cartao de debito";
	}
	
	@Override
	public double calcularValor() {
		return getValor() - (getValor() * desconto);
		
	}

}
