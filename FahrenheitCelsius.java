package br.com.java;

import java.util.Scanner;

public class FahrenheitCelsius {

	public static void main(String[] args) {
		double fahrenheit, celsius, graus;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Conversão de Fahrenheit para Celsius");
		System.out.println("");
		graus = 32;
		//Entrada
		System.out.print("Fahrenheit: ");
		fahrenheit = teclado.nextDouble();
		//Processamento
		celsius = (fahrenheit - graus) / 1.8;
		System.out.println("Celsius : " + celsius);
	}

}
