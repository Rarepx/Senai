Exercícios de Herança

01) Crie uma classe em java chamada ContaBancaria, com os seguintes atributos,  nomeCliente,  numConta,  saldo, método sacar (o saldo não pode ficar negativo), método depositar. Feito isso acrescente ao projeto duas classes herdadas de ContaBancaria: ContaPoupanca e ContaCorrente, com as seguintes características a mais. 
  A Classe ContaPoupanca, deve ter o seguinte atributo, diaDeRendimento (tipo int), possui o método calcularNovoSaldo, esse método recebe a taxa e o dia rendimento da poupança  e verifica se atualiza o saldo. 

OBS: a remuneração da caderneta de poupança  é creditada mensalmente apenas em sua data de “aniversário”, que é o dia do mês em que o depósito foi feito. Assim, uma aplicação realizada no dia 10 de um determinado mês só fará jus à remuneração exatamente no dia 10 do mês seguinte. Já a classe ContaCorrente deve ter o atributo limite e a redefinição do método sacar, permitindo saldo negativo até o valor do limite.

  Após a implementação das classes acima, você deverá implementar uma classe Contas.Java, contendo o método main. Nesta classe, você deverá implementar:
- Incluir dados relativos a(s) conta(s) de um cliente;
- Sacar um determinado valor da(s) sua(s) conta(s);
- Depositar um determinado valor na(s) sua(s) conta(s);
- Mostrar o novo saldo do cliente, a partir da taxa de rendimento, daqueles que possuem conta poupança;
- Mostrar saldo  da em conta corrente

------
02) Escreva uma classe chamada Pessoa com os seguintes atributos: nome, idade, implemente também um construtor obrigatório (com os parâmetros: nome e idade) e o método mostraDados() que exibe os dados da pessoa no console.

 Escrever uma outra classe chamada Aluno,  ela deve herdar de Pessoa, tal classe possui as seguintes características:  atributos: nome do curso que está cursando,  construtor para inicializar os atributos e sobrescrita do método mostraDados() para exibir também o nome do curso.
 
 O  programa em Java deve:
- Perguntar ao usuário,  se ele deseja instanciar um aluno ou uma pessoa
- Criar o objeto correspondente, e chamar o método mostraDados() para exibir os dados da pessoa ou do aluno. 

------
03) Faça um programa para gerenciar uma biblioteca, será necessário representar diferentes tipos de livros: Livros Didáticos, Livros de Ficção e Livros de Não Ficção. Temos algumas propriedades em comum, como título, nome do autor, número de páginas e o método InformarDetalhes() que exibe informações como título, nome do autor e número de páginas. 
 Dessa forma utilize herança para criar uma super classe chamada Livro, que contém as propriedades comuns a todos os tipos de livros. 
 Em seguida, herde da super classe para criar as subclasses de LivrosDidaticos, LivrosDeFiccao e LivrosDeNaoFiccao, tais entidades contêm suas próprias específicidades..

- Livro Didático possui os atributos disciplina, ano escolar, nível de ensino e os métodos verificarCompatibilidade(): verifica se o livro é compatível com o nível escolar informado e a  sobrescrita do método InformarDetalhes() para informar também os atributos da subclasse LivroDidatico.

 - Livro de Ficção possui os atributos gênero e subgênero (Ex: gênero Guerra subgênero Espacial) e os métodos sinopseDoLivro() informa um pequeno trecho sobre a história do livro, e a sobrescrita do método InformarDetalhes() para informar também os atributos da subclasse LivroDeFiccao. 

 - Livro de Não Ficção possui o atributo tema e tópico (Ex: Tema Matemática, tópico Números Complexo) e os métodos recomendarOutrosTitulos(): recomenda outros Titulos de Livros, e a sobrescrita do método InformarDetalhes() para informar também os atributos da subclasse LivroDeNaoFiccao.

Finalize criando uma classe para testar as funcionalidades desenvolvidas.

------
04)  Uma loja comercial tem 2 tipos de funcionários: vendedores e administrativos. Para todos os  funcionários a empresa precisa ter os registros do Nome, RG, salário e calcular o holerite do funcionário. 
Os vendedores têm um salário base, mas ganham também comissão com base em suas vendas. Os administrativos têm um salário fixo, mas podem ganhar adicionais com base em hora extra. 

 - Defina uma herança entre as classes, de tal modo  que exista  uma superclasse que implemente o que for comum aos dois tipos de funcionários e uma subclasse para cada tipo.

 - Os vendedores devem ter um método que acumule o total de vendas durante o mês e um método que imprima seu salário total considerando que a comissão é de 5% sobre cada venda.
 
 - No caso dos administrativos as horas extras  são acumuladas e pagas com o valor de um centésimo do salário por hora.

Finalize criando uma classe para testar as funcionalidades desenvolvidas.


