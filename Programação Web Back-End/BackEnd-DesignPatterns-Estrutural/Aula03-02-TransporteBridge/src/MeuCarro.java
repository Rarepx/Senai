public class MeuCarro extends Veiculo {
    public MeuCarro(AcaoDeMover acaoDeMover) {
        super(acaoDeMover);
    }

    public void mover() {
        acaoDeMover.mover();
    }
}