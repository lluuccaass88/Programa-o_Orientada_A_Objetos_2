package exc_avaliativo_1;

public class TesteLista {
	public static void main(String[] args) {

		System.out.println("==========//==========\n\n");
		System.out.println("========Teste da lista encadeada=========");
		
		ListaEncadeada lista = new ListaEncadeada();
		
		lista.add(2);
		lista.add(3);
		lista.add(6);
		lista.add(8);
		for(int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i));
		}
		
		System.out.println("==========Adicionando o numero 7 na posicao 2 (entre o 3 e o 6)==========");
		
		//Adicionando o numero 7 na posição 2 (entre o 3 e o 6)
		lista.add(7, 2);
		for(int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i));
		}
		
		System.out.println("==========Removendo numero na posicao 0 (o numeor 2)==========");
		
		//Removendo numero na posição 0 (o numeor 2) 
		lista.remove(0);
		for(int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i));
		}
		
		System.out.println("==========Removendo um valor especifico (numero 6)==========");
		//Removendo um valor especifico
		lista.remove(Integer.valueOf(6));
		for(int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i));
		}
		
		
	}
}
