package Exercicio2e3;

import java.util.Scanner;

public class SistemaDeRestaurante {
	
	public static Cardapio cardapio = new Cardapio(5);
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		while (true) {
			exibirOpcoesDoSistema();
		}	
	}
	
	
	
	
	public static void exibirOpcoesDoSistema() {
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("-- SISTEMA DE RESTAURANTE --");
		System.out.println();
		System.out.println("Digite a opção desejada");
		System.out.println();
		System.out.println("1. Cadastrar novo produto");
		System.out.println("2. Exibir cardápio");
		System.out.println("3. Buscar preço do produto dado");
		System.out.println("4. Sair do sistema");
		int opcao = ler.nextInt();
		
		if(opcao == 1) {
			
			cadastrarNovoProduto();
			
		}else if(opcao == 2) {
			
			exibirCardapio();
			
		}else if(opcao == 3) {
			
			buscarPrecoDeProduto();
			
		}else if(opcao == 4) {
			
			System.out.println("Saindo do sistema...");
			System.exit(0);
		
		}else {
			
			System.out.println("Opcao invalida!");
			System.out.println();
		}
			
	}			
		
			
	
	
	public static void cadastrarNovoProduto() {
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite o nome do produto: ");
		String nome = ler.nextLine();
		
		System.out.println("Digite o preco do produto: ");
		Double valor = ler.nextDouble();
		
		Produto novoProduto = new Produto();
		cardapio.adicionarProduto(novoProduto);
		
		novoProduto.setNome(nome);
		novoProduto.setPreco(valor);
		
		System.out.println("Produto cadastrado com sucesso!");
		System.out.println();
		exibirOpcoesDoSistema();		
	}
	
	
	
	
	public static void exibirCardapio() {
		cardapio.listarProdutos();
		System.out.println();
		exibirOpcoesDoSistema();
	}
	
	public static void buscarPrecoDeProduto() {
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite o código do produto: ");
		int codigo = ler.nextInt();
		
	    Produto produto = cardapio.getProduto(codigo);
	    
	    if(produto != null) {
	    	System.out.println("PRODUTO ENCONTRADO");
	    	System.out.println();
	    	System.out.println("Id: "+ produto.getId()+ " | Produto: "+ produto.getNome()+ " | Preco: "+ produto.getPreco());
	    	System.out.println();
	    	exibirOpcoesDoSistema();
	    }else {
	    	System.out.println("Nenhum produto encontrado.");
	    	System.out.println();
	    }
	}

}
