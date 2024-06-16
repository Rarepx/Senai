Associação - Agregação

1)  Implemente a classe chamada Colaborador ela deve ter os seguintes atributos: identificacao(int), nome(String), idade(int), cargo(String), um construtor com todos os atributos, os métodos getters e setters para os atributos que considerar necessário e um método para exibir informações do Colaborador. 
 Implemente também um classe chamada Departamento com os seguintes atributos: nome(String), sigla de identificacao(String), número de colaboradores(int), colaborador(Colaborador), um construtor para a classe Departamento com todos os atributos da classe, os métodos getters e setters para os atributos que considerar necessário e um método para exibir informações do Departamento.
 
Ao final faça uma classe de teste para validar a relação entre as entidades desenvolvidas.
 
----

2) Implemente uma classe chamada Endereco com os seguintes atributos, cidade(String), bairro(String) nome da rua(String), numero da casa(int), CEP(int), estado(String) e pais(String), um construtor que utilize todos os parâmetros das classe, crie também os métodos gets e sets, assim como o método toString() para a classe Endereco.  
   Implemente também a classe Pessoa com os seguintes atributos, nome(String), idade(int), identificacao(int), endereco(Endereco), crie um construtor que utilize todos os parâmetros da classe, crie também os métodos gets e sets, assim como o método toString() para a classe Pessoa.

 Feito isso crie uma classe para validar a relação entre as entidades codificadas anteriormente.

----

3) Implemente uma classe chamada Autor com os seguintes atributos: nome(String), idade(int), lugar(String), um construtor com todos os atributos dessa classe, um método toString() para exibir as informações da classe, crie os métodos gets e sets que considerar necessários. Implemente também uma classe chamada Editora com os seguintes atributos: nome(String), identificação(int), cidade(String) um construtor com todos os atributos dessa classe, e um método toString() para exibir as informações da classe, crie os métodos gets e sets que considerar necessários.
  Feito isso implemente a classe Livro com os seguintes atributos: nome(String), preço(float), autor(Autor), editora(Editora) um construtor com todos os atributos dessa classe,  um método toString() para exibir as informações da classe, os métodos gets e sets que considerar necessários.

  Perceba que a classe Livro tem uma relação com a classe Autor e Editora por ter sua referência. Implemente uma classe para testar a relação entre as entidades.

----

4) Implemente uma classe chamada Produto com os seguintes atributos: identificacao(int), nome(String), descricao(String), um construtor com todos os atributos dessa classe, um método toString() para exibir as informações da classe, implemente também os métodos gets e sets que considerar necessários.
  Implemente também uma classe chamada ItemDeLinha com os seguintes atributos, identificacao(int), quantidade(int), produto(Produto) um construtor com todos os atributos dessa classe e um método toString() para exibir as informações da classe, implemente também os métodos gets e sets que considerar necessários.

  Ao final, implemente uma classe para testar a relação entre as entidades.
