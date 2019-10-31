/**
 * 
 */
package br.com.main;

import java.util.Scanner;

/**
 * @author AJS
 *
 */
public class Principal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		double peso;
		double altura;
		
		
		
		System.out.println("Qual o seu peso: ");
		peso  = scanner.nextDouble();
		
		System.out.println("Qual é a sua altura? ");
		altura = scanner.nextDouble();
		
		Calcular calcular = new Calcular();
		System.out.println("Resultado: " + calcular.calcularImc(peso, altura));
		
		double resultado;
		resultado = peso / (altura * altura);
						
		if (resultado < 20) {
			System.out.println("Magro.");
		}else if (resultado >= 20 && resultado <= 24) {
			System.out.println("Normal.");
		}else if (resultado > 24 && resultado <= 29) {
			System.out.println("Acima do peso.");
		}else if (resultado > 29 && resultado <= 34) {
			System.out.println("Obeso.");
		}else {
			System.out.println("Muito Obeso.");
		}
		
	}

}
