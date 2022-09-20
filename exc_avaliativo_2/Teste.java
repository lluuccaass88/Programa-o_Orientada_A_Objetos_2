 package exc_avaliativo_2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Teste {

	public static void main(String[] args)throws IOException {
		
		
		AcessaFilme filmes = new AcessaFilme();
		//Testes
		//System.out.println("Retorna X primeiros filmes: \n\n" + filmes.buscaTop(2));
		//System.out.println("Retorna filmes de um ator:\n\n " + filmes.buscaFilmesAtor("Lucas Alves"));
		//System.out.println("A media eh: \n \n" + filmes.mediaNotaGenero(GeneroEnum.valueOf("DRAMA")));
		//System.out.println("Busca nome de de acordo com o genero e titulo: \n\n" + filmes.buscaFilme("Gente Grande", GeneroEnum.valueOf("COMEDIA")));
		//System.out.println("Busca filmes lancados a partir de 2000: \n\n" + filmes.buscaFilmeAno(2000));
	}
	
}
