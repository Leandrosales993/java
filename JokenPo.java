package br.com.java;
/** 
*@author Leandro e Bello
* 
*/

import java.util.Scanner;

public class JokenPo {

	public static void main(String[] args) {
		int jogador;
		Scanner teclado = new Scanner(System.in);
		System.out.println("JokenPo");
		System.out.println("_________");
		System.out.println("1. Pedra");
		System.out.println("2. Papel");
		System.out.println("3. Tesoura");
		System.out.println("Digite a opção desejada: ");
		jogador = teclado.nextInt();
		switch (jogador) {
			case 1:
				System.out.println("Jogador escolheu Pedra");
				break;
			case 2:
				System.out.println("Jogador escolheu Papel");
				break;
			case 3:
				System.out.println("Jogador escolheu Tesoura");
				break;	
			default:
				System.out.println("Opção inválida");
				break;
		}
		
		int computador = (int) (Math.random()*3+1);
		switch (computador) {
		case 1:
			System.out.println("Computador escolheu Pedra");
			break;
		case 2:
			System.out.println("Computador escolheu Papel");
			break;
		case 3:
			System.out.println("Computador escolheu Tesoura");
			break;
		}
		
		if (jogador != computador) {
			if ((jogador == 1 && computador == 3) || (jogador == 2 && computador == 1) || (jogador == 3 && computador == 2)) { 
				System.out.println("JOGADOR VENCEU");
			} else {
				System.out.println("COMPUTADOR VENCEU");
			}
		} else {
			System.out.println("EMPATE");
		}
	}

}
	
