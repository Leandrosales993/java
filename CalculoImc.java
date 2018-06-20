package br.com.java;

import java.util.Scanner;

public class CalculoImc {

	public static void main(String[] args) {
		// a linha abaixo cria variáveis numéricas de precisão
		// float e double são tipos primitivos numéricos reais (casas decimais)
		double peso,altura,imc;
		System.out.println("==== Calculo do IMC ====");
		System.out.print("Digite o seu Peso em kg:");
		//a linha abaixo cria um objeto de nome teclado usando a scanner
		Scanner teclado = new Scanner(System.in);
		// alinha abaixo captura usa o objeto teclado para capturar o que foi	
		//digitado no console e armazenar na variável peso
		peso = teclado.nextDouble();
		System.out.print("Digite a sua altura em metros: ");
		altura = teclado.nextDouble();
		// processamento
		imc = peso/ (altura * altura) ;
		// saida
		// + concatena(junta) um texto com o conteúdo da variável imc
		System.out.println("IMC:" + imc);
	}

	}


