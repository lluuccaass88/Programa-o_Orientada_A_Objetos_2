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
		
		System.out.println("==========Adicionand0o na posicao 2 (entre o \"Matue\" e o \"Froid\")==========");
		
		//Adicionand0o na posição 2 (entre o "Bruna" e o "Juan")
		list.add("Qualy", 2);
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

		System.out.println("==========Removendo da posicao 1==========");
		
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
		
		

	}

}
