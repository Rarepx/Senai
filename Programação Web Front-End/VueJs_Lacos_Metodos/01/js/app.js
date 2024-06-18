// Cria uma instância Vue
let app = Vue.createApp({
  // Define a seção 'data' para armazenar os dados da aplicação
  data() {
    // Retorna um objeto com a propriedade 'nomeUsuário' inicializada como uma string vazia
    return {
      nomeUsuário: ''
    };
  },
  
  // Define a seção 'methods' para armazenar os métodos da aplicação
  methods: {
    // Método 'saudação' é acionado quando o evento keyup.enter ocorre
    exibirSaudacao() {
      // Exibe um alerta personalizado com a mensagem "Olá, {nome do usuário}!"
      alert(`Olá, ${this.nomeUsuário}!`);
    }
  }
});

// Monta a instância Vue no elemento HTML com o id 'app'
app.mount('#app');
