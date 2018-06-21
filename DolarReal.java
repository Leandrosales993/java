package br.com.java;

import java.util.Scanner;

public class DolarReal {

	public static void main(String[] args) {
		double dolar, real, cotacao;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Conversão de Dóla para Real");
		System.out.println("");
		cotacao = 3.92;
		//Entrada
		System.out.print("Dolar: ");
		dolar = teclado.nextDouble();
		//Processamento
		real = dolar * cotacao;
		System.out.println("Real : " + real);
	}

}
