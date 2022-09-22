package model;

import java.sql.Time;

public class Dinheiro extends Pagamento{
	private double desconto;
	
	public Dinheiro(Time hora, double valor, double desconto) {
		super(hora, valor);
		this.desconto = desconto/100;
	}
	
	public double getDesconto() {
		return desconto;
	}

	public void setDesconto(double desconto) {
		this.desconto = desconto;
	}

	@Override
	public String descricaoPagamento() {
		return "Dinheiro";
	
	}
	
	@Override 
	public double calcularValor() {
		return getValor() - (getValor() * desconto);
		
	}

}
