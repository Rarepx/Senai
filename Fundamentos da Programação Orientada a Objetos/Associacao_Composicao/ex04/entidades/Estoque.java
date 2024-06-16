package entidades;

public class Estoque {
    private Produto[] produtos;
    private int numProdutos;

    public Estoque(Produto[] produtos) {
        this.produtos = produtos;
        this.numProdutos = produtos.length;
    }

    public void adicionarProduto(Produto produto) {
        Produto[] novoArray = new Produto[numProdutos + 1];
        
        for (int i = 0; i < numProdutos; i++) {
            novoArray[i] = produtos[i];
        }
        novoArray[numProdutos] = produto;
        produtos = novoArray;
        numProdutos++;
    }

    public void removerProduto(int id) {
        for (int i = 0; i < numProdutos; i++) {
            if (produtos[i].getIdentificacao() == id) {
                for (int j = i; j < numProdutos - 1; j++) {
                    produtos[j] = produtos[j+1];
                }
                produtos[numProdutos - 1] = null;
                numProdutos--;
                break;
            }
        }
    }

    public void listarProdutos() {
        System.out.println("Lista de produtos:");
        for (int i = 0; i < numProdutos; i++) {
            System.out.println(produtos[i]);
        }
    }

    public Produto buscarProduto(int id) {
        for (int i = 0; i < numProdutos; i++) {
            if (produtos[i].getIdentificacao() == id) {
                return produtos[i];
            }
        }
        return null;
    }
}
