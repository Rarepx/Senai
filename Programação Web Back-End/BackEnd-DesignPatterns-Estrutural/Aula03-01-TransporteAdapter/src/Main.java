public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.acelerar();

        Bicicleta bicicleta = new Bicicleta();
        Veiculo bicicletaAdapter = new BicicletaAdapter(bicicleta);
        bicicletaAdapter.acelerar();
    }
}
