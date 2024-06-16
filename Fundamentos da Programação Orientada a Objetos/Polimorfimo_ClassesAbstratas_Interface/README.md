1)  Implemente um sistema de gerenciamento de turma, com dois tipos de classificações de pessoas: alunos e professores. Cada pessoa tem suas próprias características, como nome, idade, função, e suas próprias ações.
 Faça uma superclasse Pessoa, que possui atributos e métodos comuns, como nome, idade e  o método de exibição de informações. 
 Em seguida, escreva as subclasses específicas "Aluno" e "Professor" que herdam da classe "Pessoa".

 Aluno possui os seguintes atributos, um array de disciplinas, um número de identificação, o método estudar que retorna a mensagem "Estou estudando!" a classe Aluno também deve sobrescrever o método de exibição de informações.
 Professor possui os seguintes atributos, array de turmas, um número de identificação e método  ensinar que retorna a mensagem "Estou ensinando!" a classe Professor também deve sobrescrever o método de exibição de informações.

 Ao final crie uma classe para testar as classes implementadas.

---

2)  Desenvolva um programa em Java para calcular o preço de diferentes itens de uma loja. Cada item tem atributos como uma identificação, nome, preço e um valor de imposto específico, devemos ter um método exibirInformacoes(); exibe  o conteúdo dos atributos da classe, e um método abstrato para calcular o preço da compra chamado calcularPreco().

 Após codificar a classe "Item" implemente subclasses para cada tipo de item (Livro, Eletrônico e Vestuário) que herdam da classe Item.  
 Cada subclasse possui o seu próprio método "calcularPreco()".
  
  A classe Livro deve possuir atributos como, número de identificação,  título do livro, nome do escritor, tema, editora, número de páginas, ano de publicação um construtor, um método para exibir informações e outro para calcularPreco() este  deve contemplar a soma do preço do livro, o valor do imposto e mais 2% do valor do livro.
  A classe Eletrônicos deve ter os atributos:  nome e identificação,  um construtor,  um método para exibir informações e o método  calcularPreco() que deve contemplar a soma do preço do eletrônico, o valor do imposto e mais 8% do valor eletrônico.
  A classe Vestuário  deve ter os atributos:  nome e identificação, descrição, tamanho, um construtor,  o método  exibir informação e o método calcularPreco() que deve contemplar a soma do preço do vestuário, o valor do imposto e mais 7% do valor vestuário.

 Ao final deve ser implementada uma classe para testar as funcionalidades das classes. 

---

