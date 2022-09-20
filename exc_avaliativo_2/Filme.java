package exc_avaliativo_2;
import java.util.ArrayList;

public class Filme{
	ArrayList<String> atoresArr = new ArrayList();
	private String nome;
	private GeneroEnum genero; //Descobrir depois como transformar em ENUM
	private int nota;
	private String ano;
	private String[] atores;
	
	public Filme(String nome, String genero, String nota, String ano, String atores){
		String generoUper = genero.toUpperCase();
		
		this.nome = nome;
		this.genero = GeneroEnum.valueOf(generoUper);
		
		int notaConvertido = Integer.parseInt(nota); 
		
		if( notaConvertido > 0 && notaConvertido < 10) {
			this.nota = notaConvertido;
		}
		
		this.ano = ano;
		
		String[] arrSeparado = atores.split(",");
		
		this.atores = arrSeparado;
	}
	
	public String getNome() { 
		return this.nome;
	}
	
	public int getAno() {
		return Integer.parseInt(this.ano);
	}
	
	public String[] getAtores() {
		
		return this.atores;
	}
	
	public GeneroEnum getGenero() {
		return this.genero;
	}
	
	public int getNota() {
		return this.nota;
	}
	

	public static Filme fromString(String linhaArq) {
		String[] arrLinha = linhaArq.split(";");
		return new Filme(arrLinha[0], arrLinha[1], arrLinha[2], arrLinha[3], arrLinha[4]);
	}
	
	public String toString() {
		for(int i = 0; i < this.atores.length; i++) {
			this.atoresArr.add(this.atores[i]);
		}
		
		return "Nome: " + this.nome + "\nGenero: " + this.genero + "\nNota: " + this.nota + "\nAno: " + this.ano + "\nAtores: " + this.atoresArr + "\n ==============//=========== \n" ;
	}
	
}