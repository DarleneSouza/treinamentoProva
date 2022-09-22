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
	
	public ItenVenda criarItenVenda(int quantidade,String descricao,double preco) {
		ItenVenda itenVenda = new ItenVenda(quantidade);
		itenVenda.criarProduto(descricao,preco);
		return itenVenda;
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

	public ArrayList<String> getLista() {
		ArrayList<String> listaString = new ArrayList<>();
		for(ItenVenda iten : lista) {
			listaString.add("produto: " + iten.getProduto().getDescricao() + " qtd: " + iten.getQuantidade()+ " + " + "preco R$: " + iten.getProduto().getPreco() + "\n"+ "subtotal: " + iten.subtotal());
		}
		return listaString;
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
	
	public void adicona(int quantidade, String descricao, double preco) {
		
		lista.add(criarItenVenda(quantidade,descricao,preco));
		
	}
	
	
	

}
