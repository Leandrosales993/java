package br.com.java;

import java.util.Scanner;

public class CalculoCirculo {

	public static void main(String[] args) {
		double area, pi, raio ;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Calculo do Circulo");
		System.out.println("");
		pi = 3.14;
		//Entrada
		System.out.print("Raio: ");
		raio = teclado.nextDouble();
		//Processamento
		area = 2 * pi * raio;
		System.out.println("Área : " + area);
	}

}
