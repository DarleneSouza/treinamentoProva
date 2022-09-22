package model;


import java.sql.Time;
import java.util.ArrayList;
import java.util.Date;

public class Venda {
	private Date data;
	private Time hora;
	private ArrayList<ItenVenda> lista;
	
	public Venda(Date data, Time hora) {
		this.data = data;
		this.hora = hora;
		lista = new ArrayList<ItenVenda>();
	}
	
	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public Time getHora() {
		return hora;
	}

	public void setHora(Time hora) {
		this.hora = hora;
	}

	public ArrayList<ItenVenda> getLista() {
		return lista;
	}

	public void setLista(ArrayList<ItenVenda> lista) {
		this.lista = lista;
	}

	public double total() {
		double total = 0;
		for(ItenVenda iv : lista) {
			total = total + iv.subtotal();			
		}
		return total;
		
	}
	
	public void adicona(ItenVenda itenVenda) {
		lista.add(itenVenda);
		
	}
	
	
	

}
