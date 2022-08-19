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
	public void add(T info) {
		if(!this.verfEspaco())
			throw new IllegalArgumentException(this.msgErro());
		
		this.vetValores[this.vetTamanho] = info;
		this.vetTamanho++;	
	}

	@Override
	public void add(T info, int pos) {		
		if(!this.verfEspaco())
			throw new IllegalArgumentException(this.msgErro());
		
		for(int i = this.vetTamanho; i > 0; i--) {
			this.vetValores[i + 1] = this.vetValores[i];
			if(i == pos) {
				this.vetValores[i] = info;
			}
		}
		
		this.vetValores[pos] = info;
		this.vetTamanho++;	
	}

	@Override
	public T get(int pos) {
		if(!this.verfEspaco())
			throw new IllegalArgumentException(this.msgErro());
			
			return this.vetValores[pos];
	}

	@Override
	public T remove(int pos) {
		if(this.vetTamanho < 1) 
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
		
		int cont = 0;
		
		for (T item : this.vetValores) {
			if (item.equals(info)) {
				for(int i = cont; i < this.vetTamanho; i++) {
					this.vetValores[i] = this.vetValores[i+1];
				}
				this.vetTamanho--;
				return true;
			}
			cont++;
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
		return "Esta posição é invalida, por favor digite uma posição de 0 até " + (this.vetTamanho - 1);
	}
	
	private boolean verfEspaco() {
		if(this.vetTamanho >= this.tamDefVetor) {
			return false;
		}else {
			return true;
		}
	}
}
