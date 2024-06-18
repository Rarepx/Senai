// Cria uma instância Vue
let app = Vue.createApp({
  // Define a seção 'data' para armazenar os dados da aplicação
  data() {
    // Retorna um objeto com a propriedade 'texto' inicializada como uma string vazia
    return {
      texto: ''
    };
  },
  
  // Define a seção 'computed' para propriedades de computed
  computed: {
    // A propriedade 'textoValido' retorna true se o comprimento do texto for maior que 5, senão retorna false
    textoValido() {
      return this.texto.length > 5;
    }
  }
});

// Monta a instância Vue no elemento HTML com o id 'app'
app.mount('#app');

