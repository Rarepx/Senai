export default class Produtos {
    #listaProdutos;
    
    constructor() {
        this.#listaProdutos = [];
    }

    adicionarProduto(produto) {
        //O método some é usado para verificar se pelo menos um elemento no vetor atende a uma determinada condição. Ele recebe uma função de retorno de chamada que é executada para cada elemento na lista.
        //(function (item) { ... }): Esta é uma função anônima que atua como função de retorno de chamada para o método some. Ela recebe um parâmetro chamado item, que representa cada elemento da lista
        let codigoExistente = this.#listaProdutos.some(function (item) {
             return item.getCodigo === produto.getCodigo;
        });
        //se não existe adiciona na lista
        if (!codigoExistente) {
            this.#listaProdutos.push(produto);
            console.log(`Produto "${produto.getNome}" adicionado.`);
        } else {
            console.log(`Erro: Produto com código "${produto.getCodigo}" já existe.`);
        }
    }

    removerProdutoPorIndice(indice) {
        if ((indice >= 0) && (indice < this.#listaProdutos.length)) {
            //listaProdutos.splice(indice, 1)[0]
            //indice elemento que desejamos remover 
            //1 indica que vamos remover apenas 1 elemento
            //[0] estamos interessados no primeiro elemento do array 
            let produtoRemovido = this.#listaProdutos.splice(indice, 1)[0];
            console.log(`Produto "${produtoRemovido.getNome}" removido.`);
        } else {
            console.log(`Erro: Índice inválido.`);
        }
    }

    removerProdutoPorNome(nome) {
        // Encontra o índice do produto com o nome especificado na lista de produtos.
        //Se nenhum elemento na lista atender à condição, o método findIndex retornará -1 para indicar que o elemento não foi encontrado.
        let indice = this.#listaProdutos.findIndex(function (item) {
            return item.getNome === nome;
        });
        
        if (indice === -1) {
            console.log(`Erro: Produto com nome "${nome}" não encontrado.`);
        } else {
            let produtoRemovido = this.#listaProdutos.splice(indice, 1)[0];
            console.log(`Produto "${produtoRemovido.getNome}" removido.`);
        }
    }

    consultarQuantidadePorNome(nome) {
        //encontrar todos os elementos que atendam à condição, pode usar o método filter
        let quantidade = this.#listaProdutos.filter(function (item) {
            return item.getNome === nome;
        }).length;
        console.log(`Produto "${nome}" - Quantidade em estoque: ${quantidade}`);
    }

    consultarQuantidadePorCodigo(codigo) {
        let quantidade = this.#listaProdutos.filter(function (item) {
            return item.getCodigo === codigo;
        }).length;
        console.log(`Produto com código "${codigo}" - Quantidade em estoque: ${quantidade}`);
    }

    listarProdutos() {
        console.log("Lista de Produtos:");
        //.forEach():  é usada para iterar todos os elementos do array. 
        this.#listaProdutos.forEach(function (produto, indice) {
            console.log(`Índice ${indice}: ${produto.getNome} (Código: ${produto.getCodigo})`);
        });
    }
}
