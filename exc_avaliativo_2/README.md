# Descrição do exercício 

Exercício sobre Streams

Considerando um arquivo texto separado por ";" com os dados de Filmes no seguinte modelo:
nome; gênero; nota(0 a 10); ano; lista de atores separados por ",'
Exemplo:
Matrix; ação; 9; 1999; Keanu Reeves, Laurence Fishburne, Carrie-Anne Moss

Faça a classe Filme com os atributos e getter e setters, bem como construtor, considere os atores como um List<String>. Considere a implementação de um método fromString que recebe uma String no formato de uma linha do arquivo e monta um objeto. Para o atributo genero considere a criação de um Enum com os tipos: "Suspense", "Ação", "Drama", "Comédia", "Terror" e "Aventura".

Faça uma outra classe, com métodos que acessam o arquivo utilizando streams. Considere os seguintes métodos:
i. buscaTopK(int): busca e retorna o K primeiros filmes na base.
ii. buscaFilmesAtor(String): retorna todos filmes (List<Filme>) de um determinado ator(atriz) recebido por parâmetro.
iii. mediaNotaGenero(Genero): recebe um gênero por parâmetro e retorna a nota média de todos filmes daquele gênero.
iv. buscaFilme(String buscaNome, Genero genero): busca e retorna todos os filmes de um determinado gênero e que contenham no nome a string buscaNome (desconsidere maiúsculas e minúsculas.
v. outro método: faça outro método que envolva um filtro de filmes, ou processamento dos filmes, diferente dos feitos nos métodos acima.