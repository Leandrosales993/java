package br.com.java;

import java.util.Scanner;

public class CalculoImc {

	public static void main(String[] args) {
		// a linha abaixo cria vari�veis num�ricas de precis�o
		// float e double s�o tipos primitivos num�ricos reais (casas decimais)
		double peso,altura,imc;
		System.out.println("==== Calculo do IMC ====");
		System.out.print("Digite o seu Peso em kg:");
		//a linha abaixo cria um objeto de nome teclado usando a scanner
		Scanner teclado = new Scanner(System.in);
		// alinha abaixo captura usa o objeto teclado para capturar o que foi	
		//digitado no console e armazenar na vari�vel peso
		peso = teclado.nextDouble();
		System.out.print("Digite a sua altura em metros: ");
		altura = teclado.nextDouble();
		// processamento
		imc = peso/ (altura * altura) ;
		// saida
		// + concatena(junta) um texto com o conte�do da vari�vel imc
		System.out.println("IMC:" + imc);
	}

	}


