import Produto from './Produto.js';
import Produtos from './Produtos.js';

let produtos = new Produtos();

// Adicionando produtos
let produto1 = new Produto("Arroz", "123", "01/08/2023");
produtos.adicionarProduto(produto1);

let produto2 = new Produto("Leite", "234", "22/05/2024");
produtos.adicionarProduto(produto2);

let produto3 = new Produto("Leite", "345", "22/05/2024");
produtos.adicionarProduto(produto3);

let produto4 = new Produto("Feijão", "234", "22/05/2024");
produtos.adicionarProduto(produto4);



// Removendo produtos por índice
produtos.removerProdutoPorIndice(0);

// Removendo produtos por nome
produtos.removerProdutoPorNome("Arroz");

// Consultando quantidade por nome
produtos.consultarQuantidadePorNome("Leite");

// listar todos os produtos existentes
produtos.listarProdutos();