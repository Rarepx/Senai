package principal;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Principal {
	public static void main(String[] args) { 
		String caminhoArquivoSaida = "arquivo.txt"; 

	        try {
	            FileWriter fileWriter = new FileWriter(caminhoArquivoSaida);
	            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
	            Scanner lerDados = new Scanner(System.in);
	            
	            System.out.println("Insira o texto: ");
	            String texto;
	            texto = lerDados.nextLine();
	       
	            bufferedWriter.write(texto); 

	            bufferedWriter.close();
	            fileWriter.close();
	            lerDados.close();
	            System.out.println("Arquivo gerado com sucesso.");
	        } catch (IOException e) {
	            System.out.println("Ocorreu um erro ao escrever no arquivo: " + e.getMessage());
	        }
	}
}
