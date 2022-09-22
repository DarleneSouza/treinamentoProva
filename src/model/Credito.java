package model;

import java.sql.Time;

public class Credito extends Pagamento {
	
	private double juros;

	public Credito(Time hora, double valor, double juros) {
		super(hora, valor);
		this.juros = juros/100;
	}

	public double getJuros() {
		return juros;
	}

	public void setJuros(double juros) {
		this.juros = juros;
	}
	
	@Override
	public String descricaoPagamento() {
		return "cartao de credito";
	}
	
	@Override
	public double calcularValor() {
		return getValor() + (getValor() * juros);
		
	}
	

}
