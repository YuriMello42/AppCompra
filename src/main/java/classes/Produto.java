package classes;

public class Produto {

	int idProduto;
	String nomeProduto;
	double valorUniProduto;
	Categoria categoriaProduto;
	
	
	public Produto(int idProduto, String nomeProduto, double valorUniProduto, Categoria categoriaProduto) {
		super();
		this.idProduto = idProduto;
		this.nomeProduto = nomeProduto;
		this.valorUniProduto = valorUniProduto;
		this.categoriaProduto = categoriaProduto;
	}
	
	
	
	public Produto(String nomeProduto, double valorUniProduto, Categoria categoriaProduto) {
		super();
		this.nomeProduto = nomeProduto;
		this.valorUniProduto = valorUniProduto;
		this.categoriaProduto = categoriaProduto;
	}



	//id
	public int getIdProduto() {
		return idProduto;
	}
	
	public void setIdProduto(int idProduto) {
		this.idProduto = idProduto;
	}
	
	//Nome
	public String getNomeProduto() {
		return nomeProduto;
	}
	
	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}
	
	//valorUnitario
	public double getValorUniProduto() {
		return valorUniProduto;
	}
	
	public void setValorUniProduto(double valorUniProduto) {
		this.valorUniProduto = valorUniProduto;
	}
	
	//Categoria
	public Categoria getCategoriaProduto() {
		return categoriaProduto;
	}
	
	public void setCategoriaProduto(Categoria categoriaProduto) {
		this.categoriaProduto = categoriaProduto;
	}
}
