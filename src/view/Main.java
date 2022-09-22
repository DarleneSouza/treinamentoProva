package view;

import model.Venda;

public class Main {

	public static void main(String[] args) {
		Venda v = new Venda(null, null);
		
		v.adicona(3, "chocololate", 8);
		v.adicona(1, "leite", 10);
		
		for(String iten : v.getLista()) {
			System.out.println(iten);
		}
		
		System.out.println("total: " + v.total());
		

	}

}
