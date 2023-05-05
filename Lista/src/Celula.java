
public class Celula {
	private Celula proximo; //celula vazia da lista 
	private String valor; //valor armazenado dentro da celula da lista 
	
	public Celula getProximo() {
		return this.proximo;  //retorna a proxima celula
	}
	public void setProximo(Celula proximo) {
		this.proximo = proximo; //cria uma nova celula
	}
	public String getValor() {
		return this.valor; //valor armazenado dentro da celula 
	}
	public void setValor(String valor) {
		this.valor = valor; 
	}
	
	
}
