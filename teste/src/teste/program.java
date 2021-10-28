package teste;


import java.util.Scanner;


public class program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.out.println("hello world");
Scanner sc = new Scanner(System.in);
			
			int num = sc.nextInt();
			sc.close();
		}
		catch (IOException e) {
			System.out.println(e.getMessage());
		}
		
	}

}
