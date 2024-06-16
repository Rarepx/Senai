# Exercicios_Enum
1) Desenvolva um programa para definir diferentes tipos de disciplinas que são oferecidos para uma turma, garanta que somente tipos definidos sejam utilizados no cadastro de disciplinas. Para tanto, crie uma enumeração chamada "TipoDisciplina" e adicione a ela as constantes que representam os diferentes tipos de disciplinas oferecidas pela escola, como "FPOO", "REDES", "SO", "LM", bem como suas respectivas descrições.

 Escreva uma classe chamada Disciplina a qual possui os atributos periodo, e tipo, implemente os gets e sets necessários bem como um construtor para os atributos das classe. Crie também a classe CadastroDisciplinas a qual possui um ArrayList de Disciplinas. Faça os métdos CadastrarDisciplina, RemoverDisciplina, ListarDisciplina. Por fim faça uma classe para testar as implementações feitas acima. 
 
------

2) Desenvolva um programa em Java para definir diferentes tipos de livros que são oferecidos em uma biblioteca, garantindo que somente tipos definidos sejam utilizados no cadastro de livros. Assim, escreva uma enumeração (Enum) chamada "TipoLivro" e adicione a ela as constantes que representam os diferentes tipos de livros oferecidos pela biblioteca, como "ROMANCE", "FICCAO_CIENTÍFICA", "AVENTURA", "TUTORIAL", etc.

 Em seguida, utilize tal enumeração para garantir que apenas os tipos de livros definidos sejam utilizados no cadastro de livros. Por exemplo, você pode criar um método na classe de cadastro de livros que recebe como parâmetro um TipoLivro e verificar se ele está entre os tipos de livros oferecidos pela biblioteca antes de realizar o cadastro.

  Além disso, utilize um o ArrayList para armazenar os livros cadastrados na biblioteca. Crie uma classe Livro que tenha atributos como título, autor, editora, ano de publicação, tipo (do tipo TipoLivro) e quantidade de exemplares disponíveis. Em seguida, crie uma classe para gerenciar o acervo da biblioteca, adicionando métodos para cadastrar novos livros, verificar se um livro está disponível, emprestar um livro e devolver um livro.

  Ao utilizar a enumeração e o ArrayList, você torna mais fácil a busca e filtragem das informações no sistema, permitindo, por exemplo, que o usuário busque todos os livros de um determinado tipo ou que verifique quais livros estão disponíveis para empréstimo. Ao fim faça uma classe para testar a implementação desenvolvida.
 
------

3) Escreva um programa em Java para gerenciar uma empresa e seus funcionários. Para isso, você deve utilizar Enum e LinkedList. Crie uma enumeração chamada "Departamento" com as seguintes constantes: VENDAS, FINANCEIRO, RH, TECNOLOGIA. Cada departamento deve ter um nome e um código.
Em seguida, escreva uma classe Funcionario que tenha os seguintes atributos: nome, salário, departamento (do tipo Departamento). Faça também uma classe Empresa que tenha uma LinkedList de Funcionarios, além de métodos para adicionar e remover funcionários da empresa.
Utilize a enumeração Departamento para facilitar a organização dos funcionários por departamento. Por exemplo, na classe Empresa, você pode criar métodos para retornar a lista de funcionários de um determinado departamento.

  Por fim, crie uma classe Principal para testar as implementações realizadas acima. Essa classe deve permitir adicionar e remover funcionários da empresa e exibir a lista de funcionários por departamento.
 
------

4) Desenvolva um programa para uma lanchonete para definir diferentes tipos de bebidas que são vendidas na lanchonete, bem como seus preços. Associe o nome da bebida ao seu respectivo preço. Para tanto, utilize a enumeração em Java e adicione valores numéricos associados a cada item do enum. 
  
  Crie uma enumeração chamada "TipoBebida" e adicione a ela as constantes que representam os diferentes tipos de bebidas vendidos na lanchonete, como "REFRIGERANTE", "SUCO", "CHA", etc. Associe a cada constante um valor numérico que representa o preço da bebida, por exemplo: REFRIGERANTE  4.50, SUCO  5.50 e CHA  3.00. Escreva uma classe chamada Bebida com os atributos tipo de bebida, e quantidade, um construtor para iniciar os atributos, assim como os gets e sets necessários 
 A classe Lanchonete deve conter um ArryList de Bebidas, os métodos adicionar, remover, exibirListaDeBebidas, e calculoDoPrecoFinal.
 Além disso, implemente uma classe (a qual utiliza o método main) para testar o código desenvolvido.
  
------

 5)  Crie um programa em Java para definir os tipos de produtos vendidos por uma loja de informática e garantir que somente esses tipos sejam utilizados nas transações de venda. Para tanto, crie uma enumeração chamada "TipoProduto" e adicione a ela as constantes que representam os tipos de produtos vendidos pela loja, como "FONES", "NOTEBOOK", "IMPRESSORA", "MONITOR", "PERIFÉRICOS", bem como seus valores.

 Implemente a classe Produto com os atributos código, descrição, tipo do produto e quantidade. Desenvolva também o construtor que utiliza todos os atributos, métodos gets e sets necessários e método toString. Implemente também a classe Venda com tipo, quantidade de vendas, construtor para os atributos, métodos gets e sets necessários e o método finalizar venda, que calcula o valor da venda.

 Para armazenar os produtos disponíveis na loja, utilize uma LinkedList de objetos do tipo Produto na classe Loja.
 A classe Loja deve ter os métodos cadastrar, listar, exibir produtos por tipo e o método venderProduto. Por fim, crie uma classe Principal para testar as implementações realizadas acima, permitindo que o usuário cadastre novos produtos e realize vendas informando o tipo do produto e a quantidade desejada.  O programa deve exibir o valor total da venda e atualizar a quantidade de produtos disponíveis na loja após cada venda.
 
------

6)  Faça um programa em Java para gerenciar um supermercado e seus produtos. Para isso, você deve utilizar Enum e ArrayList. Crie uma enumeração chamada "Categoria" com as seguintes constantes: BEBIDAS, CARNES, HORTIFRUTI, LIMPEZA, PADARIA. Cada categoria deve ter um nome e um código. Em seguida, escreva a classe Produto com os seguintes atributos: nome, preço, categoria (do tipo Categoria) e quantidade em estoque.
  Implemente uma classe Supermercado que tenha um ArrayList de Produtos, além de métodos para adicionar e remover e listar produtos do estoque. Utilize a enumeração Categoria para facilitar a organização dos produtos por categoria, para isso crie um método para retornar a lista de produtos de uma determinada categoria.
  Para permitir a venda de produtos, crie um método na classe Supermercado que receba como parâmetro o nome do produto e a quantidade desejada pelo cliente. Tal método deve verificar se a quantidade desejada está disponível em estoque e, se estiver, atualizar a quantidade em estoque do produto e retornar o valor total da compra. Caso contrário, o método deve retornar uma mensagem informando que o produto não está disponível em quantidade suficiente. Por fim, crie uma classe Principal para testar as implementações realizadas acima. Essa classe deve permitir adicionar e remover produtos do estoque, exibir a lista de produtos, exibir a lista de produtos por categoria e realizar vendas informando o nome do produto e a quantidade desejada. O programa deve exibir o valor total da venda e atualizar a quantidade de produtos em estoque após cada venda.





