package equacao;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EquacaoSegundoGrau {
	private double a;
	private double b;
	private double c;
	Scanner in = new Scanner(System.in);
	float delta, // delta
			sqrtdelta, // raiz quadrada de delta
			raiz1, raiz2; // raízes

	public EquacaoSegundoGrau() {

	}

	public EquacaoSegundoGrau(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
	}

	public double getC() {
		return c;
	}

	public void setC(double c) {
		this.c = c;
	}

	public void Equacao(double a, double b, double c) throws InputMismatchException {
		try {
			 
			if (a != 0 && b != 0 && c != 0) {
				// sempre o "A" não pode ser zero
				delta = (float) ((b * b) - (4 * a * c));
				sqrtdelta = (float) Math.sqrt(delta);
				if (delta < 0) {// para poder corrigir o NaN coloquei o delta < 0 para evitar esse problema
					System.out.println("Delta é negativo, logo x não pertence aos numeros reais!");
					System.out.println("delta negativo. Como delta é menor que zero, a equação não terá raízes reais, pois não existe raiz quadrada de número negativo.");
				}
				else {
					System.out.println("O valo de DELTA: "+ delta + "\nA Raiz de delta é: "+ sqrtdelta);
					raiz1 = (float) (((-1) * b + sqrtdelta) / (2 * a));
					raiz2 = (float) (((-1) * b - sqrtdelta) / (2 * a));
					System.out.println("Raízes1:" + raiz1 + " e Raízes2: " + raiz2);
				}

			}else {
				System.out.println("O valor de <A e B e C> não pode ser Zero");
			}
		} catch (Exception e) {
			System.out.println("Por Favor Digite Valores Validos!!!");
		}
	}
	public void dados() {
		try {
			double a, b, c;
			System.out.println("a");
			a = in.nextDouble();
			System.out.println("b");
			b = in.nextDouble();
			System.out.println("c");
			c = in.nextDouble();
			Equacao(a, b, c);
		} catch (InputMismatchException e) {// validacao dde Strinf
			System.out.println("Erro: Não poder ser usado <String> no campo de <Double>");
		}
		in.close();
	}
	
}
