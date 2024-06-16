package principal;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class Principal {
	public static void main(String[] args) {
		 try {
			  FileInputStream fileInputStream = new FileInputStream("arquivo.txt");
			  BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream); 
		 
	            int i;
	            String texto = "";
	            while ((i = bufferedInputStream.read()) != -1) {
	                texto = (texto + (char) i);
	            }
	            System.out.println("Conteúdo do arquivo:");
	            System.out.println(texto);
	            bufferedInputStream.close();
	        } catch (IOException e) {
	            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
	        }
	}
}
