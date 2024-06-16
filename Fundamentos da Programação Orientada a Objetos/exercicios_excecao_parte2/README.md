# exercicios_excecao
1) Faça um programa para preencher valores de um vetor de inteiros com 5 posições. O usuário deve informar os valores que serão inseridos e suas respectivas posições no vetor. O programa deve tratar as exceções:
  - ArrayIndexOutOfBoundsException (quando for informada uma posição inexistente). 
  - InputMismatchException (quando o valor informado não for um número).

Você também pode criar uma exceção personalizada para tratar casos com entradas de números negativos. NumeroNegativoException (quando o valor informado não for um número positivo).

---

2) Faça um programa em Java para realizar o cadastro de alunos em uma escola, o programa deve utilizar tipos primitivos para armazenar informações como nome, idade e nota dos alunos. Faça um método para que tais informações sejam exibidas. Além disso, é necessário implementar tratamento de exceção utilizando try-catch para lidar com possíveis erros durante o cadastro.
 Ao fim crie uma classe para testar a sua implementação.

---

3) Escreva uma classe chamada Funcionario com os atributos nome(string), idade(int), cpf(string), carga horária(double) descrição da atividade(string). Os métodos gets,sets, toString e um método para exibir informações. Crie uma outra classe chamada GerenciarFuncionarios a qual possui uma lista de funcionários do tipo ArrayList, implemente os métodos adicionar, remover, listar e editar informações. Efetue os tratamentos de exceções com try-catch para lidar com possíveis erros.
 Em particular para o arraylist faça o tratamento para da seguinte exceção:
- NullPointerException (ocorre quando tentamos executar operações em um ArrayList que é nulo (não foi inicializado) ou quando tentamos adicionar um elemento nulo a um ArrayList que não permite valores nulos.

 Ao final crie uma classe para testar a aplicação, em tal classe realize o tratamento durante o cadastro de informações garantindo que os tipos corretos sejam inseridos pelo usuário. Trate por exemplo a exceção
InputMismatchException (tal exceção ocorre  quando o usuário informar um valor que não é numérico).

---

4)  Escreva uma classe em java chamada Produto com os atributos, nome(String), quantidade(int), codigo(int), preco(double)  métodos gets, sets, toString. Feito isso escreva a classe GerenciarProdutos a qual terá uma LinkedList com o tipo Produto. Esta classe deve ter os métodos; adicionar (método com base no objeto produto), remover (método com base no atributo código, ou seja verifica se existe um produto com esse código e só depois faz a remoção), um método para listar todos os itens da lista,  um método para realizar a edição de um produto existente, para isso primeiro é verificado se existe o produto na lista com base no seu código e os métodos  getFirst(), getLast(), removeFirst(), removeLast(). 

Efetue o tratamento de exceções para lidar com erros relacionados ao controle de estoque. Em particular para a LinkedList faça o tratamento para as seguintes exceções:
  - NullPointerException: Essa exceção ocorre quando você tenta executar operações em uma LinkedList que é nula (não foi inicializada) ou quando você tenta adicionar um elemento nulo a uma LinkedList que não permite valores nulos. 
-  NoSuchElementException: Essa exceção ocorre quando você tenta acessar ou remover elementos de uma LinkedList vazia usando métodos como getFirst(), getLast(), removeFirst(), removeLast().
  Ao fim crie uma classe para testar a implementação, nesta classe trate exceções como InputMismatchException por exemplo.
 
---

5) Crie um programa em Java para gerenciar o acervo de uma biblioteca. Deve ser implementada uma classe livro com informações como id, título, autor, editora e ano de publicação. Uma classe biblioteca a qual terá uma lista de livros. Além disso, é necessário implementar tratamento de exceções com try-catch para lidar com possíveis erros durante o gerenciamento do acervo.

O programa deve permitir as seguintes funcionalidades:

Cadastrar um novo livro: O usuário deve informar o, id, titulo, autor, editora e ano de publicação do livro. Essas informações devem ser adicionadas à lista de livros da biblioteca.
Remover um livro: O usuário deve informar o id a ser removido. Caso o livro exista na biblioteca, ele deve ser removido da lista de livros.
Pesquisar um livro: O usuário deve informar o id ou o título do livro a ser pesquisado. Caso o livro exista na biblioteca, suas informações (autor, editora e ano de publicação) devem ser exibidas na tela.
Listar todos os livros: O programa deve exibir a lista completa de livros presentes na biblioteca, mostrando o título, autor, editora e ano de publicação de cada um.
Lembre-se de utilizar tratamento de exceções com try-catch para lidar com erros como livros com cadastro inválido, entradas de dados erradas e demais exceções que considerar pertinente.
