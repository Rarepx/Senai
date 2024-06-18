// JavaScript (app.js)

// Cria uma instância Vue
const app = Vue.createApp({
  // Declaração dos dados da instância Vue
  data: function() {
    return {
      // Objeto que representa uma nova tarefa
      novaTarefa: {
        nome: '',
        descricao: '',
        concluida: false,
        visivel: true, // Nova propriedade para controlar a visibilidade da tarefa
      },
      // Array para armazenar as tarefas
      tarefas: [],
      // Flag para controlar a exibição de tarefas concluídas
      mostrarConcluidas: false,
    };
  },
  // Declaração dos métodos da instância Vue
  methods: {
    // Método para adicionar uma nova tarefa à lista
    adicionarTarefa: function() {
      //...this.novaTarefa (espalhamento de objeto): 
      //O operador de espalhamento (...) é utilizado para 
      //criar uma cópia superficial do objeto this.novaTarefa. 
      //Ele copia todas as propriedades do objeto 
      //this.novaTarefa para o novo objeto.

     //id: Date.now() (atribuição de um ID único): A propriedade id está sendo adicionada ao objeto. Date.now() retorna o número de milissegundos desde o Unix Epoch (1 de janeiro de 1970, 00:00:00 UTC). Isso geralmente é usado para criar identificadores únicos, pois é improvável que dois IDs sejam gerados no mesmo milissegundo.

    //this.tarefas.push(...) (adicionar ao array): O método push é utilizado para adicionar o objeto resultante ao array this.tarefas. Aqui, o operador de espalhamento ... é usado novamente para garantir que o objeto seja adicionado como um item individual no array, e não como um array aninhado.
      if (this.novaTarefa.nome && this.novaTarefa.descricao) {
        this.tarefas.push({ ...this.novaTarefa, id: Date.now() });
        this.novaTarefa = { nome: '', descricao: '', concluida: false, visivel: true };
      }
    },
    // Método para concluir uma tarefa (oculta a tarefa)
    concluirTarefa: function(tarefa) {
      tarefa.visivel = false;
    },
    // Método para remover uma tarefa definitivamente
    removerTarefa: function(tarefa) {
      // Encontra o índice da tarefa no array
      const indice = this.tarefas.findIndex(function(t) {
        return t.id === tarefa.id;
      });
      // Remove a tarefa se encontrada
      if (indice !== -1) {
        this.tarefas.splice(indice, 1);
      }
    },
    // Método para alternar a visibilidade de tarefas concluídas
    toggleVisibilidadeConcluidas: function() {
      // Inverte o valor da flag
      this.mostrarConcluidas = !this.mostrarConcluidas;
      // Atualiza a visibilidade de cada tarefa com base na flag
      this.tarefas.forEach(function(tarefa) {
        // Tarefas concluídas só são visíveis se a flag estiver ativada
        if (!tarefa.concluida) {
          tarefa.visivel = !this.mostrarConcluidas;
        }
      });
    },
  },
});

// Monta a instância Vue no elemento com o id 'app'
app.mount('#app');
