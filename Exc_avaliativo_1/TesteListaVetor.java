package exc_avaliativo_1;

public class TesteListaVetor {

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
		
		System.out.println("==========Adicionand0o na posicao 4 (Ultimo da lista)==========");
		
		//Adicionand0o na posição 2 (Ultimo da lista)
		list.add("Qualy", 4);
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

		System.out.println("==========Removendo da posicao 1==========");
		
		//Removendo da posição 1
		System.out.println("Retorno da funcao remove: " + list.remove(1));
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println("==========Removendo o valor \"Dalsin\")==========");
		
		//Removendo o valor "Dalsin")
		System.out.println("Retorno da funcao remove: " + list.remove("Dalsin"));
		list.remove("Matue");
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		

	}

}
