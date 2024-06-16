package entidades;

public class Professor extends Pessoa {
    private String[] turmas;
    private int id;

    public Professor(String nome, int idade, String[] turmas, int id) {
        super(nome, idade);
        this.turmas = turmas;
        this.id = id;
    }

    public void ensinar() {
        System.out.println("Estou ensinando!");
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        
        System.out.printf("Numero de identificação: %d \n ",id);
        
        System.out.print("Turmas: ");
        for (String turma : turmas) {
            System.out.print(turma + " ");
        }
        
        System.out.println();
    }
}