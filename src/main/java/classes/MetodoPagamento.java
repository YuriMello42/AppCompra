package classes;
public enum MetodoPagamento {

		CREDITO (2), 
		DEBITO(1), 
		DINHEIRO(3),
		SAIR(4);

		private int pagamento;
	
		MetodoPagamento(int pagamento) {
		
			this.pagamento = pagamento;
			
		}
		
		public int getPagamento() {
			
			return pagamento;
		}
	
		
	
}
