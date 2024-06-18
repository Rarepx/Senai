public abstract class Veiculo {
    protected AcaoDeMover acaoDeMover;

    protected Veiculo(AcaoDeMover acaoDeMover) {
        this.acaoDeMover = acaoDeMover;
    }

    public abstract void mover();
}
