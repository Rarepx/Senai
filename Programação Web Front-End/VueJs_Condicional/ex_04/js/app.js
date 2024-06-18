// Cria uma instância Vue
let app = Vue.createApp({
  // Declaração dos dados da instância Vue
  data() {
    return {
      // Estado para armazenar a pontuação e o resultado
      pontuacao: '',
      resultado: ''
    };
  },
  // Declaração dos métodos da instância Vue
  methods: {
    // Método para validar a nota com base na pontuação
    validarNota() {
      // Obtém a pontuação e converte para um número inteiro
      let pontos = parseInt(this.pontuacao);

      // Lógica condicional para determinar o resultado com base na pontuação
      if (pontos >= 50) {
        this.resultado = 'Aprovado';
      } else if (pontos >= 30) {
        this.resultado = 'Recuperação';
      } else if ((pontos < 30) && (pontos >= 0)) {
        this.resultado = 'Reprovado';
      } else{
        this.resultado = '';
      }
    }
  },
});

// Monta a instância Vue no elemento com o id 'app'
app.mount('#app');
