package view;

import model.ItenVenda;
import model.Produto;
import model.Venda;

public class Main {

	public static void main(String[] args) {
		Produto p1 = new Produto("macarrao", 7.50);
		Produto p2 = new Produto("arroz", 25);
		ItenVenda iv1 = new ItenVenda(3, p1);
		ItenVenda iv2 = new ItenVenda(1, p2);
		Venda v = new Venda(null, null);
		
		v.adicona(iv1);
		v.adicona(iv2);
		
		for(ItenVenda iten : v.getLista()) {
			System.out.println("produto: " + iten.getProduto().getDescricao() + " qtd: " + iten.getQuantidade()+ " + " + "preco R$: " + iten.getProduto().getPreco() + "\n"+ "subtotal: " + iten.subtotal());
		}
		
		System.out.println("total: " + v.total());
		

	}

}
