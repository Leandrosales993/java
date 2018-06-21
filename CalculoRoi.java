package br.com.java;

import java.util.Scanner;

public class CalculoRoi {

	public static void main(String[] args) {
		double receita, custo, lucro;
		System.out.println("Calculo de ROI");
		System.out.println(" ");
		//Entrada
		System.out.print("Retorno do Investimento: ");
		Scanner teclado = new Scanner(System.in);
		receita = teclado.nextDouble();
		System.out.print("Investimento Inicial: ");
		custo = teclado.nextDouble();
		//Processamento
		lucro = (receita - custo) / 100 ;
		System.out.println("Retorno sobre o Investimento:" + lucro);
	}

}
