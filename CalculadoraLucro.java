package br.com.java;

import java.util.Scanner;

public class CalculadoraLucro {

	public static void main(String[] args) {
		double custo, lucro, venda;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Calculadora do Lucro");
		System.out.println("");
		// entrada
		System.out.println("Pre�o de custo: ");
		custo = teclado.nextDouble();
		System.out.print("% de lucro: ");
		lucro = teclado.nextDouble();
		// processameto
		venda = custo + ((custo * lucro) / 100);
		// sa�da
		System.out.println("Pre�o de venda: " + venda);
		
		

	}

}
