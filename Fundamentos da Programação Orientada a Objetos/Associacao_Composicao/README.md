# Associação - Composição

1) Digamos que a classe Aluno representa um aluno de uma escola e tenha os seguintes atributos: nome, idade e matrícula e o método exibirDados(). Já a classe Turma representa uma turma da escola e possui os atributos: disciplina e professor e o método toString(). Para representar o relacionamento entre um aluno e uma turma, podemos utilizar a composição. Ou seja, a classe Turma terá um atributo que é um objeto da classe Aluno. Isso significa que a classe Turma é composta por um objeto da classe Aluno.

 Faça essa implementação em código Java e crie um cenário de teste para validar a sua solução.

----

2) Imagine que um automóvel possui 4 pneus e um motor. Crie classes para representar esses objetos, considerando que: O automóvel também possui uma marca e uma quilometragem atual; Cada pneu tem uma marca e a pressão do ar presente no mesmo; O motor apresenta uma certa quantidade de combustível e uma potência expressa em cavalos (hp).
Imagine e escreva os métodos essenciais para essas classes (construtor, sets e gets)

  Crie também o método toString() em cada classe, para que seja possível facilmente visualizar o conteúdo armazenado. Ao final, crie um programa principal para instanciar o objeto automóvel, contendo um motor e 4 pneus, feito isso exiba essas informações na tela.

----

3) Digamos que a classe Pedido represente um pedido feito por um cliente em uma loja e tenha o método toString() e os seguintes atributos: data, valor total e um objeto da classe Produto. Já a classe Produto representa um produto disponível na loja e possui os atributos: nome, preço e quantidade em estoque.
  Para representar o relacionamento entre um pedido e os produtos que foram comprados, utilize uma composição. Ou seja, a classe Pedido terá um atributo que é um objeto da classe Produto. Isso significa que a classe Pedido é composta também por um objeto da classe Produto.

 Faça essa implementação em código Java e crie um cenário de teste para validar a sua solução.

----

4) Implemente uma classe chamada Produto para armazenar informações como nome(String), preço(float), quantidade em estoque(int), numero de identificação(int).
Além disso, implemente a classe "Estoque" que utilize um array de objetos "Produto". Tal classe deve possuir os seguintes métodos:
- Adicionar um produto ao estoque;
- Remover um produto do estoque;
- Imprimir uma lista de todos os produtos do estoque;
- Buscar um produto pelo número de identificação.

Faça essa implementação em código Java e crie um cenário de teste para validar a sua solução.

