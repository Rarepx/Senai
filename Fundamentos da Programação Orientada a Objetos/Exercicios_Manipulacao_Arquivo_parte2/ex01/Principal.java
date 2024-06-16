package principal;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		try {
			Scanner lerDados = new Scanner(System.in);
			System.out.print("Digite o texto a ser salvo: ");
			String texto = lerDados.nextLine();

			FileOutputStream fileOutputStream = new FileOutputStream("arquivo.txt");
			BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);

			bufferedOutputStream.write(texto.getBytes());
			
			bufferedOutputStream.close();
			lerDados.close();
			System.out.println("Texto salvo no arquivo com sucesso!");
		} catch (IOException e) {
			System.out.println("Erro ao salvar o texto no arquivo: " + e.getMessage());
		}

	}

}
