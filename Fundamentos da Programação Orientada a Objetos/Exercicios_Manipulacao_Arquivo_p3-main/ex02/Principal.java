package principal;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Principal {
	public static void main(String[] args) {
        String caminhoArquivoLeitura = "arquivo.txt"; 

        try {
            FileReader fileReader = new FileReader(caminhoArquivoLeitura);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String linha;
            while ((linha = bufferedReader.readLine()) != null) {
                System.out.println(linha); // Exibe cada linha do arquivo
            }

            bufferedReader.close(); 
            fileReader.close(); 
        } catch (IOException e) {
            System.out.println("Ocorreu um erro ao ler o arquivo: " + e.getMessage());
        }
    }
}
