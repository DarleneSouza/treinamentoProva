package model;

public class ItenVenda {
	private int quantidade;
	private Produto produto;

	public ItenVenda(int quantidade) {
		this.quantidade = quantidade;
	}
	
	public void criarProduto(String descricao, double preco) {
		produto = new Produto(descricao, preco);
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
