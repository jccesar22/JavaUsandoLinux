package application;

import java.util.InputMismatchException;
import java.util.Scanner;

import equacao.EquacaoSegundoGrau;

public class Program {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		 Scanner in = new Scanner(System.in);
		 EquacaoSegundoGrau equacao = new EquacaoSegundoGrau();
		 	try {
	        double a, b, c;
	        System.out.println("a");
	            a = in.nextDouble();
	            equacao.setA(a);
	            System.out.println("b");
	            b = in.nextDouble();
	            System.out.println("c");
	            c = in.nextDouble();
	       
	       equacao.Equacao(a, b, c);
		 	}catch(InputMismatchException e) {
		 		System.out.println("Erro: Não poder ser usado <String> no campo de <Double>");
		 	}
		 	in.close();
}
	}
