package classes;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		CarrinhoDeCompras comprar = new CarrinhoDeCompras();

		Categoria Informatica = new Categoria("Informatica", 0.25);
		Categoria Eletrodomestico = new Categoria("Eletrodomético", 0.20);
		Categoria CasaBanho = new Categoria("Casa e Banho", 0.10);
		Categoria Cozinha = new Categoria("Cozinha", 0.15);

		Produto Notebook = new Produto("Notebook", 2500, Informatica);
		Produto Teclado = new Produto("Teclado", 25, Informatica);
		Produto Mouse = new Produto("Mouse", 30, Informatica);
		Produto WebCam = new Produto("WebCam", 50, Informatica);

		Produto Microondas = new Produto("Microondas", 400, Eletrodomestico);
		Produto Liquidificador = new Produto("Liquidificador", 60, Eletrodomestico);
		Produto Batedeira = new Produto("Batedeira", 70, Eletrodomestico);
		Produto RoboAspirador = new Produto("Robo Aspirador", 800, Eletrodomestico);

		Produto Toalha = new Produto("Toalha", 30, CasaBanho);
		Produto Escova = new Produto("Escova", 6, CasaBanho);
		Produto Edredom = new Produto("Edredom", 70, CasaBanho);
		Produto Travesseiro = new Produto("Travesseiro", 20, CasaBanho);

		Produto Mesa = new Produto("Mesa", 300, Cozinha);
		Produto Panela = new Produto("Panela", 80, Cozinha);
		Produto Garfo = new Produto("Garfo", 2, Cozinha);
		Produto PanoDePrato = new Produto("Pano de Prato", 5, Cozinha);

		
		String RespostaItem = "s";
		
		System.out.println("##### MENU #####");
		System.out.println("Selecione o produto na lista de acordo com o seu numero: ");
		System.out.println("1 - Notebook      9 - Toalha");
		System.out.println("2 - Teclado      10 - Escova");
		System.out.println("3 - Mouse        11 - Edredom");
		System.out.println("4 - WebCam       12 - Travesseiro");
		System.out.println("5 - Microondas   13 - Mesa");
		System.out.println("6 - Liquid.      14 - Panela");
		System.out.println("7 - Batedeira    15 - Garfo");
		System.out.println("8 - Robô Aspir.  16 - Pano de Prato");

		
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		while (RespostaItem.equals("s")) {

			System.out.println("R=");

			String NumeroProduto = scanner.next();

			if (NumeroProduto.equals("1")) {
				comprar.adicionarProduto(Notebook);
				System.out.println("Notebook adicionado ao carrinho");
			} else if (NumeroProduto.equals("2")) {
				comprar.adicionarProduto(Teclado);
				System.out.println("Teclado adicionado ao carrinho");
			} else if (NumeroProduto.equals("3")) {
				comprar.adicionarProduto(Mouse);
				System.out.println("Mouse adicionado ao carrinho");
			} else if (NumeroProduto.equals("4")) {
				comprar.adicionarProduto(WebCam);
				System.out.println("Webcam adicionado ao carrinho");
			} else if (NumeroProduto.equals("5")) {
				comprar.adicionarProduto(Microondas);
				System.out.println("Microondas adicionado ao carrinho");
			} else if (NumeroProduto.equals("6")) {
				comprar.adicionarProduto(Liquidificador);
				System.out.println("Liquidificador adicionado ao carrinho");
			} else if (NumeroProduto.equals("7")) {
				comprar.adicionarProduto(Batedeira);
				System.out.println("Batedeira adicionado ao carrinho");
			} else if (NumeroProduto.equals("8")) {
				comprar.adicionarProduto(RoboAspirador);
				System.out.println("Robo Aspirador adicionado ao carrinho");
			} else if (NumeroProduto.equals("9")) {
				comprar.adicionarProduto(Toalha);
				System.out.println("Toalha adicionado ao carrinho");
			} else if (NumeroProduto.equals("10")) {
				comprar.adicionarProduto(Escova);
				System.out.println("Escova adicionado ao carrinho");
			} else if (NumeroProduto.equals("11")) {
				comprar.adicionarProduto(Edredom);
				System.out.println("Edredom adicionado ao carrinho");
			} else if (NumeroProduto.equals("12")) {
				comprar.adicionarProduto(Travesseiro);
				System.out.println("Toalha adicionado ao carrinho");
			} else if (NumeroProduto.equals("13")) {
				comprar.adicionarProduto(Mesa);
				System.out.println("Mesa adicionado ao carrinho");
			} else if (NumeroProduto.equals("14")) {
				comprar.adicionarProduto(Panela);
				System.out.println("Panela adicionado ao carrinho");
			} else if (NumeroProduto.equals("15")) {
				comprar.adicionarProduto(Garfo);
				System.out.println("Garfo adicionado ao carrinho");
			} else if (NumeroProduto.equals("16")) {
				comprar.adicionarProduto(PanoDePrato);
				System.out.println("Pano de Prato adicionado ao carrinho");
			} else {
				System.out.println("Produto não cadastrado!");
			}

			System.out.println("Deseja inserir mais itens? s/n");
			RespostaItem = scanner.next();

		}

		String Resposta = "";
		while (!Resposta.equalsIgnoreCase("2")) {
			comprar.statusCarrinho();
			System.out.println("");
			System.out.println("Selecione o procedimento que pretende realizar: ");
			System.out.println("1 - Remover item.");
			System.out.println("2 - Finalizar Pedido.");
			Resposta = scanner.next().toString();

			if (Resposta.equalsIgnoreCase("1")) {
				System.out.println("Qual item deseja remover?");

				comprar.lista();

				String idProduto = scanner.next();

				int id = Integer.parseInt(idProduto) ;
				
				id = id - 1;
				
				if (id <= -1) {
					id = 0;
				}
				comprar.removerProduto(id);

				comprar.lista();

			} else if (Resposta.equalsIgnoreCase("2")) {
				comprar.totalDesconto();
				comprar.totalCarrinho();
				System.out.println("informe a forma de pagamento: ");
				comprar.realizarPagamento();
			}else {
				System.out.println("X X X Procedimento Inválido! X X X");
			}

		}

	}
}
