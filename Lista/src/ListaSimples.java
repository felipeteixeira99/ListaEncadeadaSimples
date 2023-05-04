
public class ListaSimples implements Lista {
	
	private Celula primeira; //primeira celula da lista 
	
	public Celula getInicio() { //Retorna o primeiro elemento da lista
		return primeira;
	}
	
	public Celula getFim() { //Retornar o ultimo elemento da lista
		return primeira;
	}
	
	

	@Override
	public void getTamanho(int tamanho) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void AdicionarElemento(String valor) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void AdicionarElementoPosicao(String valor, int posicao) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void RemoverElemento(String valor) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void RemoverElmentoPosicao(int posicao) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getPosicao(int posicao) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void getElemento(String valor) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isempty() {
		// TODO Auto-generated method stub
		return primeira == null;	//Primeira é = a null ? se sim true, se nao, false 
	}

	@Override
	public void LimparLista() {
		// TODO Auto-generated method stub
		primeira = null; //primeira celula nao aponta para nenhuma outra = lista nao existe  
		
	}

}
