package br.com.java;

import java.util.Scanner;

public class CalculadoraDesconto {

	public static void main(String[] args) {
		double total, desconto, totalDesconto;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Calculadora do Desconto");
		System.out.println(" ");
		// Entrada do Calculo
		System.out.println("Valor Total:");
		total = teclado.nextDouble();
		System.out.println("Desconto:");
		desconto = teclado.nextDouble();
		// Processamento do Calculo
		totalDesconto = total - ((total * desconto) / 100);
		System.out.println("Total com Desconto:" + totalDesconto);

	}

}
