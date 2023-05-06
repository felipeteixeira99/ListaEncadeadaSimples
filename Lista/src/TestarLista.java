
public class TestarLista {

	public static void main(String[] args) {
		ListaSimples lista = new ListaSimples();
		System.out.println(lista.isempty());
		lista.AdicionarElemento("Primeiro");
		lista.AdicionarElemento("Segundo");
		lista.AdicionarElemento("Terceiro");
		System.out.println(lista.isempty());
		System.out.println("Tamanho da lista: " + lista.Tamanho());
		System.out.println(lista.Elemento(0));
		System.out.println(lista.Elemento(1));
		System.out.println(lista.Elemento(2));
		System.out.println(lista.Elemento(lista.Tamanho()-1));
		System.out.println(lista.isempty());
		System.out.println(lista);
		lista.RemoverElementoPosicao(3);
		System.out.println(lista);
		System.out.println(lista.Posicao("Terceiros"));
		lista.AdicionarElementoPosicao("Novo", 0);
		System.out.println(lista);
		lista.AdicionarElemento("Quarto");
		System.out.println(lista);
		lista.RemoverElemento("Quarto");
		System.out.println(lista);
		lista.RemoverElementoPosicao(2);
		System.out.println(lista);
	}

}
