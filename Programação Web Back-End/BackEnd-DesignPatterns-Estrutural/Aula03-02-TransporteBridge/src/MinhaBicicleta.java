public class MinhaBicicleta extends Veiculo {
    public MinhaBicicleta(AcaoDeMover acaoDeMover) {
        super(acaoDeMover);
    }

    public void mover() {
        acaoDeMover.mover();
    }
}