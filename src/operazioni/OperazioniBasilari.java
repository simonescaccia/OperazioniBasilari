package operazioni;

import java.util.Scanner;


public class OperazioniBasilari {

	public static  double calcola(char c, double op1, double op2) {
		
		double ris = 0;
		
		switch(c) {
		case '+':
			ris = op1 + op2;
			break;
		case '*':
			ris = op1*op2;
			break;
		case '-':
			ris = op1 - op2;
			break;
		case '/':
			ris = op1 / op2;
			break;
		default:
			System.out.println("default");
			break;
		}
		
		return ris;
	}
	
	public static void main(String[] args) {
		
		System.out.println("inserisci +,-,/,*");
		
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		
		System.out.println("inserisci primo operando");
		
		Scanner s1 = new Scanner(System.in);
		String op1 = s1.nextLine();
		
		System.out.println("inserisci secondo operando");
		
		Scanner s2 = new Scanner(System.in);
		String op2 = s2.nextLine();
		
		double ris = calcola(str.charAt(0), Double.valueOf(op1), Double.valueOf(op2));
		
		System.out.println(ris);

	}

}
