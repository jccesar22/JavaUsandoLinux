package application;

import java.util.InputMismatchException;
import java.util.Scanner;

import equacao.EquacaoSegundoGrau;

public class Program {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		 Scanner in = new Scanner(System.in);
		 	try {
	        double a, b, c;
	        System.out.println("a");
	            a = in.nextDouble();
	            System.out.println("b");
	            b = in.nextDouble();
	            System.out.println("c");
	            c = in.nextDouble();
	       EquacaoSegundoGrau equacao = new EquacaoSegundoGrau();
	       equacao.Equacao(a, b, c);
		 	}catch(InputMismatchException e) {
		 		System.out.println("Erro: Não poder ser usado <String> no campo de <Double>");
		 	}
		 	in.close();
}
	}
