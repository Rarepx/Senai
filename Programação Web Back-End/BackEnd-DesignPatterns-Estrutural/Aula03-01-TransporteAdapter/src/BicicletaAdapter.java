public class BicicletaAdapter implements Veiculo {
    private Bicicleta bicicleta;

    public BicicletaAdapter(Bicicleta bicicleta) {
        this.bicicleta = bicicleta;
    }

    public void acelerar() {
        bicicleta.pedalar();
    }
}
