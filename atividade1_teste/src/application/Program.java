package application;

import java.util.InputMismatchException;
import java.util.Scanner;

import equacao.EquacaoSegundoGrau;

public class Program {

	public static void main(String[] args) {
		EquacaoSegundoGrau equacao = new EquacaoSegundoGrau();
		double a, b, c;
		Scanner teclado = new Scanner(System.in);
		try {
			System.out.println("*********************** Equacao Segundo Grau ***********************");
			System.out.println("a");
			a = teclado.nextDouble();
			System.out.println("b");
			b = teclado.nextDouble();
			System.out.println("c");
			c = teclado.nextDouble();
			equacao.Equacao(a, b, c);
			System.out.println("*********************** Equacao Segundo Grau ***********************");
		} catch (InputMismatchException e) {// validacao de Double para não deixar digitar String no campo double
			System.out.println("Erro: Não poder ser usado <String> no campo de <Double>");
			equacao.Dados();
		}
		teclado.close();
	}
}
