package equacao;

public class EquacaoSegundoGrau {
	double a;
	private double b;
	private double c;
	double delta, // delta
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
		if (a == 0 || b == 0 || c == 0) {
			System.out.println("A, B e C precisam ser diferentes de zero ");
		}

		double delta = (b * b) - (4 * a * c);
		sqrtdelta = Math.sqrt(delta);
		if (delta <= 0) {
			System.out.println("Não há solução real para Delta Negativo");
			System.out.println("Não há solução real");
		} else if (delta > 0) {
			System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");
			System.out.println("-------------------As duas sao solucao real-----------------");
			raiz1 = ((-b + sqrtdelta) / (2 * a));
			raiz2 = ((-b - sqrtdelta) / (2 * a));
			System.out.println("Raízes1: " + raiz1 + " e Raízes2: " + raiz2);
			System.out.println("-----------------------Resultado---------------------------");
		} else {
			System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");
			System.out.println("--------------------Raizes diferentes----------------------");
			System.out.println("Raizes diferentes podem dar o >>NaN<<  que e nunber a nunber");
			double divisor = 2 * a;
			raiz1 = (-b + sqrtdelta);
			raiz2 = (-b - sqrtdelta);
			System.out.println("Raízes1: " + raiz1 + " > dividido por " + divisor + "\nRaízes2: " + raiz2
					+ " > dividido por " + divisor);
			System.out.println("-----------------------Resultado---------------------------");
			System.out.println("INFORMACAO: " + "Normalmente NaN acontecem como resultado de:\n" + "\n"
					+ "-Qualquer operação com NaN como operando\n" + "-Divisões 0/0, infinito / infinito\n"
					+ "-Multiplicação 0 x infinito\n" + "-Adições com infinitos\n"
					+ "-Operações fora de um domínio, como raiz quadrada de negativos.");
		}
	}
}
