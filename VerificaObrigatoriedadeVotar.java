package br.com.java;

import java.util.Scanner;

public class VerificaObrigatoriedadeVotar {

	public static void main(String[] args) {
		int idade;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Verificar obrigatoriedade de votar");
		System.out.println("Digite a sua idade: ");
		idade = teclado.nextInt();
		/*crit�rios
		*Menor que 16 anos - Proibido votar
		*Entre 18 e 70 - Obrigat�rio votar
		*16, 17 ou acima de 70 - Voto facultativo
		*/ 
		if (idade < 16) {
			System.out.println("Proibido votar");
		} else if (idade == 16 || idade == 17 || idade > 70) {
			System.out.println("Voto facultativo");
		}
	 else {
		System.out.println("Voto obrigat�rio");
	 }
		
	}
}	
