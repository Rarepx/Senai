package principal;

import entidades.Automovel;
import entidades.Motor;
import entidades.Pneu;

public class Principal {
    public static void main(String[] args) {
        Pneu[] pneus = {new Pneu("Bridgestone", 28), new Pneu("Bridgestone", 28), new Pneu("Bridgestone", 28), new Pneu("Bridgestone", 28)};
        Motor motor = new Motor(42, 90);
        Automovel automovel = new Automovel("Fiat", 1000, motor, pneus);
        System.out.println(automovel.toString());
    }
}
