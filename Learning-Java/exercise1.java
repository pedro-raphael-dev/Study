/* Faça um programa que resulte em um saída como:
 * 
 * Saída:
 * Products:
 * Computer, which price is $ 2.100,00
 * Office desk, which price is $ 650,50
 * 
 * Record: 30 years old, code 5290 and gender: F
 * 
 *Measue with eight decimal places: 53,23456700
 *Rouded (three decimal places): 53,235 
 *US decimal point: 53.235
 *
 *Variaveis:
 *
 *product1 : Computer
 *product2: Officer desk
 *age: 30;
 *code : 5290;
 *gender : f
 *price1 : 2100,0
 *price2 : 650.50
 *measure: 53.234567
 */


import java.util.Locale;

// Declaração da classe program_exercise
public class exercise1 {
	
	
	// Método main | 
	public static void main (String [] args) {
		
		// Declaração de variáveis.
		
		// Products
		
		String product1 = "Computer";
		String product2 = "Officer Desk";
		
		double pricep1 = 2100;
		double pricep2 = 650.50;
		
		double measure = 53.234567;
		
		//Client
		
		int age = 30;
		char gender = 'F';
		int code = 5290;
		
		// Saidas
		
		// Saidas Products
		
		System.out.println("Products:");
		System.out.printf("%s, wich price is $ %.2f%n", product1, pricep1);
		System.out.printf("%s, wich price is $ %.2f%n", product2, pricep2);
		
		 // Saidas Client
		
		System.out.printf("%nRecord: %d years old, code %d and gender %c.%n", age, code, gender);
		
		// Saidas Measue, Rouded US Decimal point
		
		System.out.printf("%nMeasue with eight decimal places: %f.%n", measure);
		System.out.printf("Rouded (three decimal places): %.3f.%n", measure);
		
		//Configuração US Locale
		Locale.setDefault(Locale.US);
		
		//Saida US Locale
		
		System.out.printf("US decimal point: %.3f.%n", measure);
		
		/*Measue with eight decimal places: 53,23456700
		 *Rouded (three decimal places): 53,235 
		 *US decimal point: 53.235 */
	
	}
	
}
