package equacao;

import java.io.IOException;
import java.util.InputMismatchException;

public class EquacaoSegundoGrau {
	private double a;
	private double b;
	private double c;
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

	public void Equacao(double a, double b, double c) {
		try {
			if (a != 0) {
				// sempre o "A" não pode ser zero
				delta = (float) ((b * b) - (4 * a * c));
				sqrtdelta = (float) Math.sqrt(delta);
				if (delta < 0) {// para poder corrigir o NaN coloquei o delta < 0 para evitar esse problema
					System.out.println("Delta é negativo, logo x não pertence aos numeros reais!");
				}
				// se a raiz de delta for maior que 0, as raízes são reais
				else {
					raiz1 = (float) (((-1) * b + sqrtdelta) / (2 * a));
					raiz2 = (float) (((-1) * b - sqrtdelta) / (2 * a));
					System.out.println("Raízes1:" + raiz1 + " e Raízes2: " + raiz2);
				}

			}
		} catch (Exception e) {
			System.out.println("Por Favor Digite Valores Validos!!!");
		}
	}
}
