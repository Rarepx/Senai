// Cria uma instância Vue
let app = Vue.createApp({
  // Declaração dos dados da instância Vue
  data() {
    return {
      // Define um dado chamado 'mostrarImagem' com o valor inicial 'false'
      mostrarImagem: false
    };
  },
  // Declaração dos métodos da instância Vue
  methods: {
    // Método chamado 'alterarVisibilidade' que inverte o valor de 'mostrarImagem'
    alterarVisibilidade() {
      this.mostrarImagem = !this.mostrarImagem;
    }
  }
});

// Monta a instância Vue no elemento com o id 'app'
app.mount('#app');
