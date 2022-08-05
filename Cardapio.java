package Exercicio2e3;

public class Cardapio {
	
	private Produto[] listaDeProdutos;
	
	

	public Cardapio(int tamanho) {
		
		listaDeProdutos = new Produto[tamanho];
	}
	
	
	
	
	public void adicionarProduto(Produto produto) {
		
		for (int i=0; i<listaDeProdutos.length; i++) {
			if(listaDeProdutos[i] == null) {
				
				listaDeProdutos[i] = produto;
				produto.setId(i);
				break;
			}
		}
	}
	
	
	public Produto getProduto(int idProduto) {
		return listaDeProdutos[idProduto];	
	}
	
	
	
	public void listarProdutos() {
		
		for(Produto produto:listaDeProdutos) {
			if(produto != null) {
				System.out.println("Id: "+ produto.getId()+" | Produto: "+ produto.getNome()+ " | Preco: "+ produto.getPreco());
			}
		}
	}

}
