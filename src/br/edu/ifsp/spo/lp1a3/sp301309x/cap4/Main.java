package br.edu.ifsp.spo.lp1a3.sp301309x.cap4;

import java.util.Scanner;

public class Main {

	public static void main (String[] args) {
		
		Scanner scanf = new Scanner(System.in);
		
		int numero;

		System.out.println("Digite um número de 4 dígitos que você deseja criptografar: ");
		numero = scanf.nextInt();
		
		Criptografar cp = new Criptografar(numero);
		cp.Pdigito();
		cp.Qdigito();
		cp.Tdigito();
		cp.Sdigito();
		cp.Troca1();
		
		System.out.printf("Número criptografado: %d%d%d%d\n", cp.getD1(), cp.getD2(), cp.getD3(), cp.getD4());
		
		Descriptografar dcp = new Descriptografar(cp.getD1(), cp.getD2(), cp.getD3(), cp.getD4());
		dcp.Troca1();
		dcp.Sdigito();
		dcp.Tdigito();
		dcp.Qdigito();
		dcp.Pdigito();
		cp.Troca1();
		
		System.out.printf("Número criptografado: %d%d%d%d", dcp.getD1(), dcp.getD2(), dcp.getD3(), dcp.getD4());
		
	}
}