// Cria uma instância Vue
let app = Vue.createApp({
  // Define a seção 'data' para armazenar os dados da aplicação
  data() {
    // Retorna um objeto com a propriedade 'corDeFundo' inicializada como 'verde'
    return {
      corDeFundo: 'verde'
    };
  },
  
  // Define a seção 'methods' para armazenar os métodos da aplicação
  methods: {
    // Método 'alterarEntreCoresDeFundo' altera a cor de fundo com base na cor atual
    alterarEntreCoresDeFundo() {
      // Verifica se a cor de fundo atual é 'verde'
      if (this.corDeFundo === 'verde') {
        // Se for 'verde', altera para 'vermelho'
        this.corDeFundo = 'vermelho';
      } else {
        // Se não for 'verde', altera para 'verde'
        this.corDeFundo = 'verde';
      }
    }
  }
});

// Monta a instância Vue no elemento HTML com o id 'app'
app.mount('#app');
