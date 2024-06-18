// Cria uma instância Vue
let app = Vue.createApp({
  // Declaração dos dados da instância Vue
  data() {
    return {
      // Lista de disciplinas com id, nome e descrição
      disciplinas: [
        { id: 1, nome: 'PWBE', descricao: 'Programação Web Back-End.' },
        { id: 2, nome: 'PWFE', descricao: 'Programação Web Front-End.' },
        { id: 3, nome: 'BD', descricao: 'Banco de dados.' },
      ],
      // Propriedade para armazenar a disciplina selecionada
      disciplinaSelecionada: null,
    };
  },
  // Declaração dos métodos da instância Vue
  methods: {
    // Método para exibir a descrição da disciplina selecionada
    exibirDisciplina(descricao) {
      this.disciplinaSelecionada = descricao;
    },
  },
});

// Monta a instância Vue no elemento com o id 'app'
app.mount('#app');
