package exc_avaliativo_2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AcessaFilme {
	Path arq = Paths.get("C:\\Users\\lucas\\eclipse-workspace\\exc_avaliativo_e\\src\\exc_avaliativo_e\\dados\\filmes.txt"); //Mudar para o caminho utilizado no seu computador.

	public List<Filme> buscaTop(int num) throws IOException {
		List<Filme> filme = Files.lines(arq)
			.limit(num)
			.map(linha -> Filme.fromString(linha))
			.collect(Collectors.toList());
		return filme;
	}

	public List<Filme> buscaFilmesAtor(String nome) throws IOException {
		List<Filme> filmes = Files.lines(arq)
				.map(linha -> Filme
				.fromString(linha))
				.filter(fil -> Arrays.toString(fil.getAtores()).contains(nome))
				.collect(Collectors.toList());
		return filmes;
	}

	public double mediaNotaGenero(GeneroEnum genero) throws IOException {
		double media = Files.lines(arq)
			.map(linha -> Filme.fromString(linha))
			.filter(resp -> genero.equals(resp.getGenero()))
			.collect(Collectors.averagingDouble(map -> map.getNota()));
		return media;
	}

	public List<Filme> buscaFilme(String buscaNome, GeneroEnum genero) throws IOException {
		List<Filme> filme = Files.lines(arq).map(linha -> Filme.fromString(linha))
				.filter(resp -> genero.equals(resp.getGenero()))
				.filter(resp -> buscaNome.equals(resp.getNome()))
				.collect(Collectors.toList());
		return filme;
	}

	public List<Filme> buscaFilmeAno(int ano) throws IOException {
		List<Filme> filme = Files.lines(arq).map(linha -> Filme.fromString(linha)).filter(resp -> resp.getAno() > ano)
				.collect(Collectors.toList());
		return filme;
	}
}
