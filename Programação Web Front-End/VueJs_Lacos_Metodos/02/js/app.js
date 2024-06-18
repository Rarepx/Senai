// Cria uma instância da aplicação Vue
let app = Vue.createApp({
    // Declaração dos dados da instância Vue
    data() {
      return {
        // Números fornecidos pelo usuário
        numeroInicio: '',
        numeroFim: '',
        // Lista para armazenar os números primos
        numerosPrimos: []
      };
    },
    // Declaração dos métodos da instância Vue
    methods: {
      // Método para verificar se um número é primo
      ehPrimo(num) {
        if (num <= 1) 
          return false;
          for (let i = 2; i <= Math.sqrt(num); i++) {
            if ((num % i) === 0) 
              return false;
          }
        return true;
      },
      // Método para obter a lista de números primos entre dois números
      obterPrimosEntre(inicio, fim) {
        const primos = [];
        for (let i = inicio; i <= fim; i++) {
          if (this.ehPrimo(i)) {
            primos.push(i);
          }
        }
        return primos;
      },
      // Método acionado pelo botão para gerar os números primos e atualizar a lista
      gerarPrimos() {
        // Converte os números fornecidos para valores inteiros
        let inicio = parseInt(this.numeroInicio);
        let fim = parseInt(this.numeroFim);
        // Atualiza a lista de números primos chamando o método apropriado
        this.numerosPrimos = this.obterPrimosEntre(inicio, fim);
      }
    }
  });
  
  // Monta a instância Vue no elemento com o ID 'app'
  app.mount('#app');
  