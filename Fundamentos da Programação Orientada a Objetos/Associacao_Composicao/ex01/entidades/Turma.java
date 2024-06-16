package entidades;

public class Turma {
    private String disciplina;
    private String professor;
    private Aluno aluno;
    
    public Turma(String disciplina, String professor, Aluno aluno) {
        this.disciplina = disciplina;
        this.professor = professor;
        this.aluno = aluno;
    }
    
    @Override
    public String toString() {
        return "[Turma: " + disciplina + ", professor: " + professor + ", [Aluno " + aluno.toString() + " ]";
    }
}
