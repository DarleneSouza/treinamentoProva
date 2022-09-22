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
	
	public double total() {
		double total = 0;
		for(ItenVenda iv : lista) {
			total = total + iv.subtotal();			
		}
		return total;
	}
	
	
	

}
