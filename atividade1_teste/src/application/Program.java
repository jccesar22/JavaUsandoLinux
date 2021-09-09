package application;

import java.util.InputMismatchException;
import java.util.Scanner;

import equacao.EquacaoSegundoGrau;

public class Program {

	public static void main(String[] args) throws Exception {
		EquacaoSegundoGrau equacao = new EquacaoSegundoGrau();
		double a, b, c;
		Scanner in = new Scanner(System.in);
		try {
			
			System.out.println("a");
			a = in.nextDouble();
			System.out.println("b");
			b = in.nextDouble();
			System.out.println("c");
			c = in.nextDouble();
			equacao.Equacao(a, b, c);
		} catch (InputMismatchException e) {// validacao dde Strinf
			System.out.println("Erro: Não poder ser usado <String> no campo de <Double>");
			try {
			equacao.dados();
			}
			catch (InputMismatchException ev)
			{
				equacao.dados();

			}
		}
		in.close();

	}
}
