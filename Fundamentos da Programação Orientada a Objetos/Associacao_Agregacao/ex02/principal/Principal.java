package principal;

import entidades.Endereco;
import entidades.Pessoa;

public class Principal {
    public static void main(String[] args) {
        Endereco endereco = new Endereco("São Carlos", "Centro", "Av: São Carlos ", 123, 12345678, "São Paulo", "Brasil");
        Pessoa pessoa = new Pessoa("Carlos", 23, 123456, endereco);
        System.out.println(pessoa);
    }
}
