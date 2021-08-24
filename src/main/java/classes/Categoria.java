package classes;

public class Categoria {

	int idCategoria;
	String nomeCategoria;
	double descontoCategoria;
		
	public Categoria(int idCategoria, String nomeCategoria, double descontoCategoria) {
		super();
		this.idCategoria = idCategoria;
		this.nomeCategoria = nomeCategoria;
		this.descontoCategoria = descontoCategoria;
	}
	
	
	
	public Categoria(String nomeCategoria, double descontoCategoria) {
		super();
		this.nomeCategoria = nomeCategoria;
		this.descontoCategoria = descontoCategoria;
	}



	//id
	public int getIdCategoria() {
		return idCategoria;
	}
	
	public void setIdCategoria(int idCategoria) {
		this.idCategoria = idCategoria;
	}
	
	//Nome
	public String getNomeCategoria() {
		return nomeCategoria;
	}
	
	public void setNomeCategoria(String nomeCategoria) {
		this.nomeCategoria = nomeCategoria;
	}
	
	//Desconto
	public double getDescontoCategoria() {
		return descontoCategoria;
	}
	
	public void setDescontoCategoria(double descontoCategoria) {
		this.descontoCategoria = descontoCategoria;
	}
}
