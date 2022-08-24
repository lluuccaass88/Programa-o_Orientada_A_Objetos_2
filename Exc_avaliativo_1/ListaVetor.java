package exc_avaliativo_1;

public class ListaVetor<T> implements Lista<T>{
		private int tamDefVetor;
		private T[] vetValores; 
		private int vetTamanho;

		public ListaVetor() {			
			//@SuppressWarnings("unchecked")
			this.tamDefVetor = 10;
			T[] vet = (T[]) new Object[this.tamDefVetor];
			this.vetValores = vet;
			this.vetTamanho = 0;
	}
		
	@Override
	public void add(T info, int pos) {		
		if(!this.verfEspaco())
			throw new IllegalArgumentException(this.msgErro());
		
		int cont = this.vetTamanho;
		
		while(cont != pos) {
			this.vetValores[cont] = this.vetValores[cont-1];
			cont--;
		}
			
		this.vetValores[pos] = info;
		this.vetTamanho++;	
	}
		
	@Override
	public void add(T info) {
		if(!this.verfEspaco())
			throw new IllegalArgumentException(this.msgErro());
		
	this.add(info, this.vetTamanho);
	}

	@Override
	public T get(int pos) {
		if(!this.verfEspaco())
			throw new IllegalArgumentException(this.msgErro());
			
			return this.vetValores[pos];
	}

	@Override
	public T remove(int pos) {
		if(this.vetTamanho < 1 || pos < 0 || pos > this.vetTamanho-1) 
			throw new IllegalArgumentException(this.msgErro());
		
		T elemento = this.vetValores[pos];
		
		for(int i = pos; i < this.vetTamanho; i++) {
			this.vetValores[i] = this.vetValores[i+1];
		}
		this.vetTamanho--;
		return elemento;
	}

	@Override
	public boolean remove(T info) {
		if(this.vetTamanho < 1) 
			throw new IllegalArgumentException(this.msgErro());
		
		if (info == null)
			return false;
		
		for(int i = this.vetTamanho - 1; i >= 0; i--) {
			if (this.vetValores[i].equals(info)) {
				this.remove(i);
			}
		}
							
		return false;
	}

	@Override
	public int size() {
		return this.vetTamanho;
	}
	
	private String msgErro() {
		if(!this.verfEspaco()) {
			return "Vetor cheio";
		}else if(this.vetTamanho < 1) {
			return "Vetor vazio";
		}
		return "Esta posicao e invalida, por favor digite uma posicao de 0 ate " + (this.vetTamanho - 1);
	}
	
	private boolean verfEspaco() {
		if(this.vetTamanho >= this.tamDefVetor) {
			return false;
		}else {
			return true;
		}
	}
}
