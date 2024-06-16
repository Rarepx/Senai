package principal;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
        String filePath = "output.txt"; // Caminho do arquivo de saída

        System.out.println("Escreva o quanto desejar. Para finalizar, digite -1.");

        try (Scanner scanner = new Scanner(System.in);
             FileWriter fileWriter = new FileWriter(filePath);
             BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {

            String line;
            while (!(line = scanner.nextLine()).equals("-1")) {
                bufferedWriter.write(line);
                bufferedWriter.newLine(); // Insere uma nova linha
            }

            System.out.println("Escrita finalizada. O arquivo foi salvo.");

        } catch (IOException e) {
            System.out.println("Ocorreu um erro ao escrever no arquivo: " + e.getMessage());
        }
    }
}
