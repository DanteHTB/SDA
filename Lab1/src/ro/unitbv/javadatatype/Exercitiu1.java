package ro.unitbv.javadatatype;

import java.util.Scanner;

public class Exercitiu1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Hello World");
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Introdu nr 1: ");
		int nr1 = scanner.nextInt();		
		System.out.println("Numarul citit este: "+nr1);
		
		System.out.println("Introdu nr 2: ");
		int nr2 = scanner.nextInt();		
		System.out.println("Numarul citit este: "+nr2);
		
		double impartire = (double)nr1 / nr2;
		
		System.out.println("Suma: " + (nr1+nr2));
		System.out.println("Scaderea: " + (nr1-nr2));
		System.out.println("Produsul: " + (nr1*nr2));
		System.out.println("Impartire: " + impartire);
		System.out.println("Media lor este: " + ((nr1+nr2)/2));
		System.out.println("Maxim: " + Math.max(nr1, nr2));
	}

}
