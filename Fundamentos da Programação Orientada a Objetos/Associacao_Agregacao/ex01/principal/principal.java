package principal;

import entidades.Colaborador;
import entidades.Departamento;

public class principal {
    public static void main(String[] args) {
        Colaborador colaborador = new Colaborador(1, "Carlos", 25, "Analista de Sistemas");
        Departamento departamento = new Departamento("TI", "TID", 20, colaborador);
        departamento.exibirInformacoes();
    }
}
