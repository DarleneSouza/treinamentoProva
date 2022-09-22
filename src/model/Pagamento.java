package model;

import java.sql.Time;

public abstract class Pagamento {
	private Time hora;
	private double valor;
	
	public Pagamento(Time hora, double valor) {
		this.hora = hora;
		this.valor = valor;
	}

	public Time getHora() {
		return hora;
	}

	public void setHora(Time hora) {
		this.hora = hora;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
	
	public abstract String descricaoPagamento();
	
	public abstract double calcularValor();
	
	
	

}
