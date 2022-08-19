package exc_avaliativo_1;

public class ListaEncadeada<T> implements Lista<T>{
	private int tamanho;
	private No inicio;
	private No fim;
	
	public ListaEncadeada(){
		this.tamanho =0;
		this.inicio=null;
		this.fim=null;
	}
	
	//adiciona valor em uma posição especifica
	@Override
	public void add(T info, int pos) {
		if(pos<0 || pos> this.tamanho-1)
			throw new IllegalArgumentException("Por favor digite uma posicao valida");
		
		No nodoAux = new No(info);
		No auxLista = this.inicio;
		int cont = 0;
		
		if(pos == 0) {
			nodoAux.prox = auxLista;
			this.inicio = nodoAux;
			this.tamanho++;
		}else {
			while(auxLista != null && cont!=pos-1) {
				cont++;
				auxLista = auxLista.prox;
			}
			nodoAux.prox = auxLista.prox;
			auxLista.prox = nodoAux;
			this.tamanho++;
		}
	}

	
	//adiciona no final
	@Override
	public void add(T info) {
		No nodoAux = new No(info);
		//lista vazia
		if(this.inicio==null) this.inicio = nodoAux;
		else this.fim.prox = nodoAux;
		
		this.fim = nodoAux;
		this.tamanho++;
	}	
	
	//Remove uma posição 
	@Override
	public T remove(int pos) {
		if(pos<0 || pos> this.tamanho-1)
			throw new IllegalArgumentException("Por favor digite uma posicao valida!");
		
		No auxLista = this.inicio;
		No noApagado;
		int cont = 0; 

		if(pos == 0) {
			this.inicio = auxLista.prox;
			this.tamanho--;
			return auxLista.info;
		}else {
			while(auxLista != null && cont!=pos-1) {
				cont++;
				auxLista = auxLista.prox;
			}
			noApagado = auxLista.prox;
			auxLista.prox = auxLista.prox.prox;
			this.tamanho--;
			return noApagado.info;
		}
	}

//Remove um valor especifico. 
		@Override
	public boolean remove(T info) {
		No auxLista = this.inicio;
		No auxAnt;
		
		if(auxLista.info.equals(info)) {
			this.inicio = auxLista.prox;
			this.tamanho--;
			return true;
		}
		
		while(auxLista != null) {
			auxAnt = auxLista;
			auxLista = auxLista.prox;
			if(auxLista.info.equals(info)) {
				auxAnt.prox = auxLista.prox;
				this.tamanho--;
				return true;
			}
		}
		
		return false;
	}
	
	//retorna elemento na Posição
	@Override
	public T get(int pos) {
		if(pos<0 || pos> this.tamanho-1)
			throw new IllegalArgumentException("Posição da lista inválida!");
		No aux = this.inicio;
		int cont=0;
		while(aux != null && cont!=pos) {
			cont++;
			aux= aux.prox;
		}
		return aux.info;
	}
	
	@Override
	public int size() {
		return this.tamanho;
	}
	//classe interna
	private class No {
		T info;
		No prox;
		No(T informacao){
			this.info = informacao;
			this.prox = null;
		}
	}
}
