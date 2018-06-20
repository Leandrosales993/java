package br.com.java;

import java.util.Scanner;

public class PDV {

	public static void main(String[] args) {
		double total, desconto, totalDesconto, valorPago, troco;
		Scanner teclado = new Scanner(System.in);
		System.out.println("==========");
		System.out.println("=== PDV ===");
		System.out.println("============");
		System.out.println("Total: ");
		total = teclado.nextDouble();
		System.out.println("% desconto: ");
		desconto = teclado.nextDouble();
		totalDesconto = total - ((total * desconto) / 100);
		System.out.println("Total com desconto " + totalDesconto);
		System.out.println("===========");
		System.out.println("Valor Pago");
		valorPago = teclado.nextDouble();
		troco = valorPago - totalDesconto;
		System.out.println("Troco: " + troco);
		
		
		
	

	}

}
