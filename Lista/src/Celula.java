
public class Celula {
	private Celula proximo; //espaco na lista onde sera armazenado um valor do tipo str e apontará para a proxima celula
	private String valor; //valor str que sera armazenado
	
	
	public Celula getProximo() {
		return this.proximo;
	}
	public void setProximo(Celula proximo) {
		this.proximo = proximo;
	}
	public String getValor() {
		return this.valor;
	}
	public void setValor(String valor) {
		this.valor = valor;
	}
}
