
public class TestarLista {

	public static void main(String[] args) {
		ListaSimples lista = new ListaSimples();
		System.out.println(lista.isempty());
		System.out.println(lista.Tamanho());
		lista.AdicionarElemento("Primeiro");
		lista.AdicionarElemento("Segundo");
		lista.AdicionarElemento("Terceiro");
		lista.AdicionarElementoPosicao("Quarto", 0);
		System.out.println(lista.Tamanho());
		System.out.println(lista);

	}

}
