// Estudo de declarações de variáveis e formatação

// Importando  o Locale para que a maquina reconheça um idioma divergente do padrão.
// Útil para formatar a , pelo .! 

import java.util.Locale;

// Declaração da classe variaveis_numbers
public class variaveis_numbers {
	
	
// Declaração do método main	
	public static void main (String[] args) {
		
		
// Declarações de variaveis int e char
		
		/* As variaveis x e y foram utilizadas para serem formatadas
		 * através do método %.2f e pela quebra de linhas %n
		 *  
		 *  Foi utilizado a saída System.out.printf para formatar.
		 *  
		 *  */
		
		
		//Declarações,
		
		double x = 3.494785696;
		char y = 'a';
		
		
		// Utilizando o locale para formatação da , pelo . ! 
		
		Locale.setDefault(Locale.US);
		
		// Saídas
		
		System.out.printf("%.2f%n", x);
		
		System.out.print(y);
		
// Concatenação 
		
/* Para realizar uma concatenação, utilizamos dois métodos
* 
* O operador + 
* 
* juntamos todos os elementos na saída com o +
* 
* System.out.println("Total = " + x + " m/s² " 
* 
* Método printf e marcadores.
* 
* System.out.printf(" %s tem %d anos e ganha %.2f reais ", Name, Year, Salario)
* 
* as variaveis precisam estar declaradas anteriormente.
* */
		
		String Name = "Pedro";
		int Year = 21;
		double Salario = 2582;
		
		System.out.printf(" %n %s tem %d anos e ganha %.2f reais%n", Name, Year, Salario);
		
		

		
	}
//Final método.	
	
}
// Final classe