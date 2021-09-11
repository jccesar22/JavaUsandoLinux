package application;
import java.util.InputMismatchException;
import equacao.EquacaoSegundoGrau;
import equacao.Read;

public class Program {

	public static void main(String[] args) {
		EquacaoSegundoGrau equacao = new EquacaoSegundoGrau();
		double a, b, c;
		try {
			System.out.println("*********************** Equacao Segundo Grau ***********************");
			System.out.println("a");
			a = Read.readDouble();
			while(a == 0) {
				System.out.println("Nao pode ser zero ou colocar letras!\nDigite novamente; ");
				a= Read.readDouble();
			}
			System.out.println("b");
			b = Read.readDouble();
			while(b == 0) {
				System.out.println("Nao pode ser zero ou colocar letras!\nDigite novamente; ");
				b= Read.readDouble();
			}
			System.out.println("c");
			c = Read.readDouble();
			while(c == 0) {
				System.out.println("Nao pode ser zero ou colocar letras!\nDigite novamente; ");
				c = Read.readDouble();
			}
			equacao.Equacao(a, b, c);
			System.out.println("*********************** Equacao Segundo Grau ***********************");
		} catch (InputMismatchException e) {// validacao de Double para não deixar digitar String no campo double
			System.out.println("Erro: Não poder ser usado <String> no campo de <Double>");
		}
	}
}
