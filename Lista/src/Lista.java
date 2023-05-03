
public interface Lista {
	
	public void getTamanho(int tamanho); //retorna o tamanho da lista
	
	public void AdicionarElemento(String valor); 
	
	public void AdicionarElementoPosicao(String valor, int posicao);
	
	public void RemoverElemento(String valor);
	
	public void RemoverElmentoPosicao(int posicao);
	
	public int getPosicao(int posicao); //retorna a posicao de um elemento da lista 
	
	public void getElemento(String valor); //retorna um elemento da lista de acordo com a sua posicao 
	
	public boolean isempty(); //verifica se esta vazia 
	
	public void LimparLista();
	
}
