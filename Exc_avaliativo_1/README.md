# Descrição do exercício 

Classe ListaEncadeada:

i. Crie o método add(valor, int pos): adiciona um valor (tipo genérico) na posição,
considere as posições de 0 a tamanho-1. Caso se passe um valor fora do intervalo
lance uma IllegalArgumentException com uma mensagem. Bônus: faça com que o
método add(valor) que adiciona no final, chame esse método para evitar lógicas
duplicadas.
ii. Crie o método remove(int pos): remove e retorna um elemento na posição passada por
parâmetro (não esqueça de decrementar o tamanho). Caso o parâmetro seja fora do
intervalo de posições lance uma IllegalArgumentException.
iii. Crie o método remove(valor): que remove o valor (tipo genérico) passado por
parâmetro. Retorne um boolean que informa se removeu algum elemento ou não da
lista.

Classe ListaVetor: 

Lista implementada com um vetor internamente. Na definição do vetor você pode escolher uma tamanho grande o suficiente para os seus testes, 
ou implementála variando o tamanho do vetor na medida que a lista cresca (opção mais difícil, elaborada e próxima do que é implementado no ArrayList do Java). 
Para a criação do vetor, você vai se deparar com uma limitação dos genéricos, a criação de Objetos genéricos (não se pode instanciar um tipo genérico, por exemplo: “ T varGen = new T(); ”).
Para isso você vai precisar criar um vetor de Object e usar o casting, por exemplo: T[] this.itens = (T[]) new Object[10]; Esse tipo de instrução, necessária no mínimo no seu construtor vai gerar um
Alert: “Type safety: Unchecked cast“, isso significa que o o compilador não pode garantir o “Type Safety” pois ele não sabe dizer se o Cast irá lançar um exception ou não. Porém você, 
o programador pode dizer… Se o elemento (this.itens) estiver encapsulado, e o programador puder garantir que aquele casting sempre funcionará (o que é o caso), podemos informar isso com uma
annotation: @SuppressWarnings("unchecked"), na linha de cima do casting.

Crie os seguintes métodos, equivalentes aos implementados na ListaEncadeada:

i. add(valor, int pos): adiciona elemento na posição
ii. add(valor): adiciona no final da lista
iii. get(int pos): retorna elemento na posição
iv. remove(int): remove e retorna elemento na posição passada por parâmetro
v. remove(valor): remove o elemento passado por parâmetro
vi. size() retorna o tamanho da lista