package programa;

import java.util.Scanner;

public class ExemploPrograma {	
	
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite a opera��o que deseja ? [1 - Teste]");
		int opc = scan.nextInt(); // le a entrada do terminal
		
//		Exemplo das chamadas que dever�o ser feitas
//		ICalculadora calculadora = new Soma();
//		ICalculadora calculadora = new Subtracao();
//		ICalculadora calculadora = new Divisao();
//		ICalculadora calculadora = new Multiplicacao();
//		
//		calculadora.calcular(null);
		
		scan.close();
		
	}
}