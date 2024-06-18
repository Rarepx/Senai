# revisao-mvc-dao-jbdb-mysql

Gerenciador de Tarefas

Crie um projeto em Java para fazer o gerenciamento de tarefas onde o usuário pode adicionar, listar, atualizar e excluir tarefas. A aplicação deve usar um banco de dados MySQL para armazenar os dados.
Funcionalidades: adicionar tarefas, atualizar tarefas, finalizar tarefas, listar tarefas e excluir tarefas
Banco de dados: projeto_revisao - Tabela: tarefa (id_tarefa, titulo, descricao, status (A, P, C)

Revisão dos conceitos MVC, DAO e JDBC.

Desafio

Crie uma tabela log para salvar todas as operações realizadas na tabela tarefa
Ao adicionar uma tarefa, insira na tabela log um registro informando que uma nova tarefa foi adicionada
Ao atualizar uma tarefa, insira um registro em log informando que houve atualização na tarefa
Ao finalizar uma tarefa, insira um registro em log informando que a tarefa foi finalizada
Ao listar as tarefas, insira um registro em log para cada tarefa listada
Ao excluir uma tarefa, insira um registro informando que a tarefa foi excluída

Tabela: log_tarefa (id_log, id_tarefa, operacao, mensagem, data_hora_log)
