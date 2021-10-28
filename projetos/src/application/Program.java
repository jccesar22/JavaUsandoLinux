package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello world");
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o sexo");
		int nome = sc.nextInt();
		
		for(int i = 1; i < 11; i++) {
			int soma = i * nome;
			System.out.println(i+ " x " + nome +"=" + soma );
		}
		
		
	}

}
