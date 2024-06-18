public class Main {
	public static void main(String[] args) {
        Veiculo carro = new MeuCarro(new Carro());
        carro.mover();

        Veiculo bicicleta = new MinhaBicicleta(new Bicicleta());
        bicicleta.mover();
    }
}
