
public interface Lista {
	int Tamanho(); 
	
	void AdicionarElemento(String valor);
	
	void AdicionarElementoPosicao(String valor, int posicao);
	
	void RemoverElemento(String valor);
	
	void RemoverElementoPosicao(int posicao);
	
	String Elemento(int posicao); //retorna o elemento de acordo com a sua posicao 
	
	int Posicao(String valor); //retorna a posicao do elemento 
	
	public boolean isempty();
	
	void esvaziaLista(); //esvazia a lista 	
	
}
