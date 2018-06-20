package br.com.java;

public class ArrayMultidimensional {

	public static void main(String[] args) {
		//A linha abaixo cria um array mutidimensional(matriz)
		double[][] boletim = {{8,7,9,3},{4,5,8,6}};
		//Recuperando a nota de Português do 3° bimestre
		System.out.println("Média de Português do 3° bim: " + boletim[1][2]);
	}

}
