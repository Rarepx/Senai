# exercicios_manipulacao_arq_p3

1)  Implemente um programa em Java que efetue a escrita em um arquivo, para tanto o programa deve utilizar a classe FileWriter em conjunto com a classe BufferedWriter. O arquivo gerado deve estar na extensão .txt.

---

2) Escreva um código Java capaz de ler o arquivo.txt gerado no exercício anterior, para isso utilize a classe BufferedReader em conjunto com a classe FileReader.

---

3) Escreva um código Java capaz de ler o arquivo.csv, utilize a classe BufferedReader em conjunto com a classe FileReader para esse fim.
 O conteúdo do arquivo deve ser colocado em um ArrayList do tipo Produto O conteúdo do arquivo segue o padrão (codigo (int),quantidade(int), nome do produto(String), tamanho(String) e valor(double))
 
Segue exemplo de conteúdo.      
  123, 1, camiseta, G, 30.90 <br/>
  321, 2, camisa, 4, 50.25 <br/>
  456, 1, calça, 42, 120.00 <br/>
  654, 5, blusa, M, 100.00 <br/>

  Ao final, exiba o conteúdo do ArryList em tela.

---

4) Implemente um programa em Java que realiza a escrita em um arquivo.txt.
   Ao inicializar deve ser exibido uma mensagem para o usuário "Escreva o quanto desejar, para finalizar digite enter e depois -1".
 
 Nesse contexto tudo o que o usuário escrever deve ser armazenado em um arquivo, para essa finalidade utilize BufferedWriter em conjunto com a classe FileWriter. Você deve  “tratar” a tecla "Enter" para que quando o usuário pressioná-la seja efetuado de fato uma quebra de linha e não parar com a captura do teclado. 
  Para finalizar a captura do que for digitado analise se o usuário digitou  enter e depois -1 se sim então encerre a escrita e salve tudo que foi digitado.
  
 ---
 
5) Implemente em Java um sistema de gerenciamento de funcionários de uma empresa. O sistema deve permitir cadastrar diferentes tipos de funcionários, como efetivos, temporários e terceirizados. Para isso, você deve implementar a seguinte hierarquia de classes: A classe Funcionario é a classe base abstrata que possui os seguintes atributos protegidos: nome (String) e salario (double). Ela também possui os seguintes métodos:

- getNome(): retorna o nome do funcionário.
- getSalario(): retorna o salário do funcionário.
- calcularSalario(): um método abstrato que deve ser implementado nas subclasses para calcular o salário de cada tipo de funcionário.

 Durante o cadastro de um funcionário o sistema deve solicitar ao usuário que informe o tipo de funcionário (efetivo, temporário ou terceirizado) e os dados específicos de cada tipo de funcionário. (Tal cadastro pode ser feito em uma lista de funcionários por exemplo)

 Além disso, o sistema deve permitir a escrita dos dados dos funcionários cadastrados em um arquivo de texto chamado "funcionarios.txt". Para isso, utilize as classes BufferedWriter e FileWriter. Após o cadastro e escrita dos funcionários, o sistema deve ser capaz de editar se necessário o arquivo "funcionarios.txt" e exibir as informações dos funcionários cadastrados na tela. Para isso, utilize as classes BufferedReader e FileReader. Implemente o sistema considerando as classes mencionadas, a escrita dos dados dos funcionários no arquivo e a leitura desses dados para exibição.

