package classes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class CarrinhoDeCompras {

	List<Produto> CarrinhoCompra = new ArrayList<Produto>();

	double SomaDesconto = 0;
	double TotalApagar = 0;

	public Produto adicionarProduto(Produto produto) {
		double valor = 0;
		CarrinhoCompra.add(produto);

		for (Produto p : CarrinhoCompra) {
			if (p.getNomeProduto().equals(produto))
				valor = p.getValorUniProduto();

			return p;

		}
		System.out.println(produto);
		System.out.println(valor);
		return null;
	}

	public void lista() {
		int serial = 1;

		for (int i = 0; i < CarrinhoCompra.size(); i++) {

			System.out.println(serial + " - " + CarrinhoCompra.get(i).getNomeProduto());
			serial++;
		}

	}

	public void removerProduto(int id) {
		
		String removedStr = CarrinhoCompra.remove(id).getNomeProduto();
		//CarrinhoCompra.get(id).getNomeProduto()
		System.out.println(removedStr + " foi removido da lista!");

	}

	public void statusCarrinho() {

		System.out.println(" ");
		for (int i = 0; i < CarrinhoCompra.size(); i++) {

			System.out.println(
					CarrinhoCompra.get(i).getNomeProduto() + " - R$ " + CarrinhoCompra.get(i).getValorUniProduto());
		}

	}

	public void totalCarrinho() {

		double ValorTotal = 0;
		double Valorunitario = 0;
		double TotalComDesconto = 0;

		for (int i = 0; i < CarrinhoCompra.size(); i++) {
			Valorunitario = CarrinhoCompra.get(i).getValorUniProduto();
			ValorTotal = ValorTotal + Valorunitario;
		}

		TotalComDesconto = ValorTotal - SomaDesconto;
		TotalApagar = TotalComDesconto;

		System.out.println(" ");
		System.out.println("Produtos " + CarrinhoCompra.size() + " itens.");
		System.out.println("Total:              R$ " + ValorTotal);
		System.out.println("Total com Desconto: R$ " + TotalComDesconto);
		System.out.println(" ");

	}

	public void totalDesconto() {

		Map<String, List<Produto>> map = new HashMap<String, List<Produto>>();

		for (int i = 0; i < CarrinhoCompra.size(); i++) {

			String nomeCategoria = CarrinhoCompra.get(i).getCategoriaProduto().getNomeCategoria();
			Produto produtoAadicionar = CarrinhoCompra.get(i);

			if (map.containsKey(nomeCategoria)) {
				map.get(nomeCategoria).add(produtoAadicionar);
			} else {
				ArrayList<Produto> listaProduto = new ArrayList<Produto>();
				listaProduto.add(produtoAadicionar);
				map.put(nomeCategoria, listaProduto);
			}

		}

		double totalDesconto = 0;
		double somaDesconto = 0;

		for (String nomeCategoria : map.keySet()) {
			List<Produto> list = map.get(nomeCategoria);

			int quantItensCategoria = list.size();

			if (quantItensCategoria >= 2) {
				double valortotalProduto = 0;

				for (Produto p : list) {
					valortotalProduto += p.getValorUniProduto();
				}
				totalDesconto = valortotalProduto * list.get(0).getCategoriaProduto().getDescontoCategoria();
				somaDesconto += totalDesconto;
				SomaDesconto = somaDesconto;

				System.out.println("Desconto de " + nomeCategoria + ": " + totalDesconto);
			}
		}

	}
	
	public void realizarPagamento() {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int tipo;
		System.out.println("Selecione a forma de pagamento: ");
		System.out.println("1 - Crédito");
		System.out.println("2 - Débito");
		System.out.println("3 - Dinheiro");
		System.out.println("4 - Sair");
		tipo = sc.nextInt();

		switch (MetodoPagamento.values()[tipo]) {

		case CREDITO:
			System.out.println("Selecionado Crédito!");
			TotalApagar += (TotalApagar * 0.02);
			System.out.println("Total a pagar: " + TotalApagar);
			System.out.println("Descontos : " + SomaDesconto);
			break;
		case DEBITO:
			System.out.println("Selecionado Débito!");
			TotalApagar += TotalApagar * 0.03;
			System.out.println("Total a pagar: " + TotalApagar);
			System.out.println("Descontos : " + SomaDesconto);
			break;
		case DINHEIRO:
			System.out.println("Selecionado Dinheiro!");
			System.out.println("Total a pagar: " + TotalApagar);
			System.out.println("Descontos : " + SomaDesconto);
			break;

		case SAIR:
			System.out.println("Volte Sempre!!!");
			break;
		}

	}

}
