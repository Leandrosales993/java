package br.com.java;

import java.util.Scanner;

public class Regra3 {

	public static void main(String[] args) {
		double x,y,valor;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Regra de 3");
		System.out.println("X % de Y = valor");
		System.out.println("");
		//entrada
		System.out.println("Digite o valor de X:");
		x = teclado.nextDouble();
		System.out.println("Digite o valor de Y:");
		y = teclado.nextDouble();
		//processamento
		valor = (x * y) / 100;
		//sa�da
		//concatenando(unindo) vari�veis com textos
		System.out.println(x + " % de " + y + " = " + valor);

	}

}
