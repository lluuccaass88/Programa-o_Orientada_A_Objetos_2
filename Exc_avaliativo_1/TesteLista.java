package exc_avaliativo_1;

public class TesteLista {
	public static void main(String[] args) {
		ListaVetor<String> list = new ListaVetor<>();
		
		//Adicionando no final
		list.add("Dalsin");
		list.add("Matue");
		list.add("Froid");
		list.add("Sidoka");
		
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println("==========Adicionand0o na posição 2 (entre o \"Matue\" e o \"Froid\")==========");
		
		//Adicionand0o na posição 2 (entre o "Bruna" e o "Juan")
		list.add("Qualy", 2);
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

		System.out.println("==========Removendo da posição 1==========");
		
		//Removendo da posição 1
		list.remove(1);
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println("==========Removendo o valor \"Dalsin\")==========");
		
		//Removendo o valor "Dalsin")
		list.remove("Dalsin");
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		
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
