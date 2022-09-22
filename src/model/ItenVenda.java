package model;

public class ItenVenda {
	private int quantidade;
	private Produto produto;

	public ItenVenda(int quantidade, Produto produto) {
		this.quantidade = quantidade;
		this.produto = produto;
	}
	
	public int getQuantidade() {
		return quantidade;
	}

	public double subtotal() {
		return produto.getPreco() * quantidade;
	}
	
	

}
