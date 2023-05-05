
public class ListaSimples implements Lista  {
	
	Celula primeira = null;
	
	private Celula getInicio() { //retorna a primeira celula 
		return primeira;
	}
	
	private Celula getUltimo() { //Se a celula nao estiver vazia esse metodo vai percorrer a lista buscando pela a ultima celula, que será aquela que nao esta apontando para nenhuma outra
			Celula atual = primeira;
			while(atual.getProximo() != null) {
				atual = atual.getProximo();
			}
			return atual;
		}

	@Override
	public int Tamanho() {
		if(isempty()) {
			return 0;
		}
		else {
			Celula atual = primeira;
			int i = 1;
			while(atual.getProximo() != null) {
				atual = atual.getProximo();
				i++;
			}
			return i;
		}
	}

	@Override
	public void AdicionarElemento(String valor) {
		Celula novaCelula = new Celula();
		novaCelula.setValor(valor);
		if(isempty()) {
			primeira = novaCelula;
		}
		else {
			getUltimo().setProximo(novaCelula);
		}
	}

	@Override
	public void AdicionarElementoPosicao(String valor, int posicao) {
		// TODO Adicionar um elemento em uma posicao especifica 
		if(posicao > Tamanho()) return; //serve para verificar se nao esta tentando colocar em uma posicao que ja existe um valor dentro 
		Celula novaCelula = new Celula();
		novaCelula.setValor(valor);
		
		if(posicao == 0) {
			Celula proxima = primeira;
			//Celula anterior =;
			primeira = novaCelula;
			primeira.setProximo(proxima);
		}
	}

	@Override
	public void RemoverElemento(String valor) {
		// TODO remover elemento 
		
	}

	@Override
	public void RemoverElementoPosicao(int posicao) {
		// TODO remover elemento por posicao 
		
	}

	@Override
	public String Elemento(int posicao) {
		// TODO retornar o elemento da lista 
		Celula elemento = getCelula(posicao);
		if(elemento != null) {
			return elemento.getValor();
		}
		else {
			return null;
		}
		
	}

	@Override
	public int Posicao(String valor) {
		// TODO retornar a posicao do elemento 
		return 0;
	}

	@Override
	public boolean isempty() {
		return primeira == null; //primeira aponta para null ? 
	}

	@Override
	public void esvaziaLista() {
		primeira = null;
		
	}
	
	private Celula getCelula(int posicao) {
		if(isempty()) {
			return null;
		}
		else {
			if(posicao > Tamanho() -1) {
				return null;
			}
			else {
				Celula atual = primeira;
				for(int i = 0; i < posicao; i++) {
					atual = atual.getProximo();
				}
				return atual;
			}
		}
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < Tamanho(); i++) {
			sb.append("[");
			sb.append(Elemento(i));
			sb.append("] ");
		}
		return sb.toString();
	}
}
