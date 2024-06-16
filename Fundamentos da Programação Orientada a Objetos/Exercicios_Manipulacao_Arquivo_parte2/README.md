# exerrcicios_manipulacao_arq_p2

1) Escreva um código Java capaz de salvar um texto inserido pelo usuário em um arquivo chamado arquivo.txt, para isso utilize a classe BufferedOutputStream em conjunto com a classe FileOutputStream.

----

2) Escreva um código Java capaz de ler o arquivo.txt gerado no exercício anterior, para isso utilize a classe BufferedInputStream em conjunto com a classe FileInputStream.

----

3) Escreva um código Java capaz de ler o arquivo.txt, utilize a classe BufferedInputStream em conjunto com a classe FileInputStream para esse fim.
 O conteúdo do arquivo deve ser colocado em um ArrayList do tipo Produto O conteúdo do arquivo segue o padrão (codigo (int),quantidade(int), nome do produto(String), tamanho(String) e valor(double))
 
Segue exemplo de conteúdo.      
123, 1, camiseta, G, 30.90<br/>
321, 2, camisa, 4, 50.25<br/>
456, 1, calça, 42, 120.00<br/>
654, 5, blusa, M, 100.00<br/>

Ao final, exiba o conteúdo do ArryList em tela.

----

4) Com base no arquivo do exercício anterior, efetue as seguintes ações, leia o arquivo.txt, utilize a classe BufferedInputStream em conjunto com a classe FileInputStream para esse fim. O conteúdo do arquivo deve ser colocado em um ArrayList do tipo Produto. O conteúdo do arquivo segue o padrão (codigo (int),quantidade(int), nome do produto(String), tamanho(String) e valor(double))
 Deve ser criada uma classe chamada ManipularProdutos, nela devem ser criados os seguintes métodos 
 - carregarProduto (carrega as informações do arquivo em um ArryList)
 - removerProduto (remove um produto do arquivo com base eu seu Id).
 - listarProduto (lista os produtos do arquivo)
 - atualizarArquivo (atualiza dados do arquivo)

----

5)  Implemente um programa em Java capaz de gravar uma lista de tarefas diárias em um arquivo, para isso utilize a classe BufferedInputStream  e FileInputStream para realizar a escrita e registro das informações. 
 Inicialmente, crie uma classe chamada Tarefa, a qual deve ter um id, um nome e uma descrição e um tempo estimado, construtor, método gets, sets e toString.  
  Em outra classe escreva uma classe, capaz de manipular os itens da lista de atividades, essa lista deve ser um ArrayList. 
  Implemente os seguintes métodos
  - adicionarTarefa - recebe uma tarefa verifica por meio de um método adicional se já existe uma mesma tarefa com aquele ID, caso não exista então adiciona a tarefa, na lista e escreva a tarefa em um arquivo .csv.
  - removerTarefa - remove a tarefa com base no ID e chama o método atualizarTarefa.
  - carregarTarefas - adiciona as tarefas existentes no arquivo na lista de tarefas (lista do tipo ArrayList).
  - atualizarTarefa - é capaz de investigar a lista de tarefas e com base em suas alterações (item adicionado ou removido) atualizar o arquivo
 
Ao fim faça uma classe Principal para testar o programa.
Lembre de tratar possíveis exceções que possam ocorrer durante o processo de escrita no arquivo.

