package model;

public class ItenVenda {
	private int quantidade;
	private Produto produto;

	public ItenVenda(int quantidade, Produto produto) {
		this.quantidade = quantidade;
		this.produto = produto;
	}
	
	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public double subtotal() {
		return produto.getPreco() * quantidade;
	}
	
	

}
