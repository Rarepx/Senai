package metodos;

import java.util.Scanner;

public class ConversaoTemperatura {
	
    public static double converterParaKelvin(double temperaturaCelsius) {
    	double temperaturaKelvin;
    	
    	temperaturaKelvin = temperaturaCelsius + 273.15;
        return temperaturaKelvin;
    }
    
    public static double converterParaFahrenheit(double temperaturaCelsius) {
    	double temperaturaFahrenheit;
    	
    	temperaturaFahrenheit = (temperaturaCelsius * 1.8) + 32;
        return temperaturaFahrenheit;
    }

	
    public static void main(String[] args) {
    	double temperaturaCelsius, temperaturaKelvin, temperaturaFahrenheit; 
	Scanner lerDados = new Scanner(System.in);
        
	System.out.print("Digite a temperatura em graus Celsius: ");
       	temperaturaCelsius = lerDados.nextDouble();
        
       	temperaturaKelvin = converterParaKelvin(temperaturaCelsius);
       	temperaturaFahrenheit = converterParaFahrenheit(temperaturaCelsius);
        
       	System.out.println("Temperatura em Kelvin: " + temperaturaKelvin);
        System.out.println("Temperatura em Fahrenheit: " + temperaturaFahrenheit);
        
        lerDados.close();
    }
}
