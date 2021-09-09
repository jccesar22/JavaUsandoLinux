package equacao;

import java.io.IOException;

public class EquacaoSegundoGrau {
	private double a;
	private double b;
	private double c;
	float  delta,        //delta
           sqrtdelta,    //raiz quadrada de delta
           raiz1,raiz2;  //raízes
	
	public EquacaoSegundoGrau() {
		
	}
	public EquacaoSegundoGrau(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}



	public void Equacao(double a, double b, double c) {
		
		if(a != 0){ 
	        //sempre o "A" não pode ser zero
	            delta = (float) ((b*b) - (4*a*c));
	            sqrtdelta = (float)Math.sqrt(delta);
	        //se a raiz de delta for maior que 0, as raízes são reais    
	            if(delta >=0){
	                raiz1 = (float) (((-1)*b + sqrtdelta)/(2*a));
	                raiz2 = (float) (((-1)*b - sqrtdelta)/(2*a));
	                System.out.println("Raízes1:"+ raiz1 + " e Raízes2: "+ raiz2);
	               System.out.println("A raiz de DELTA: " + sqrtdelta);
	               System.out.printf("a raiz de delta for maior que 0, as raízes são reais ");
	            }
	            else{
	                delta = -delta;
	                sqrtdelta = (float)Math.sqrt(delta);
	                delta = -delta;
	                sqrtdelta = (float)Math.sqrt(delta);
	                System.out.printf("Raíz 1: %.2f + i.%.2f\n", (-b)/(2*a), (sqrtdelta)/(2*a));
	                System.out.printf("Raíz 2: %.2f - i.%.2f\n", (-b)/(2*a), (sqrtdelta)/(2*a));
	            }
	            
	        }
	        else{
	            System.out.println("Coeficiente 'a' inválido. Não é uma equação do Segundo grau o Coeficiente zero");
	        }
	    }
	
	}
