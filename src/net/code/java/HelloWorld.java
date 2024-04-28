package net.code.java;

import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {

		int totalpoint = 0;
		totalpoint = totalpoint + traitement();
		totalpoint = totalpoint + traitement();
		if (totalpoint == 0) {
			System.out.println("such a looser");
		} else if (totalpoint == 1) {
			System.out.println("peut mieux faire");
		} else {
			System.out.println("champion");
		}
		// in.nextLine();
		// System.out.println(x+y);
	}

	public static int traitement() {

		int result = 0;

		Scanner in = new Scanner(System.in);

		System.out.println("Entrez un entier");
		int x = in.nextInt();
		System.out.println("Valeur de la variable x : " + x);

		System.out.println("Entrez un autre entier");
		int y = in.nextInt();
		System.out.println("Valeur de la variable y : " + y);

		System.out.println("quelle est le résultat de " + x + "+" + y + "?");
		int somme = in.nextInt();
		System.out.println(" Vous avez sasie " + somme);

		int sommeCalculee = x + y;
		if (somme == sommeCalculee) {
			result = 1;
			System.out.println("Bravo bg");
		} else {
			System.out.println("Tempi");
		}
		return result;

	}

	public static void lireValeur(String message) {
		
//		System.out.println(message);
//		int saisie = in.nextInt();
		
	}
	
	public int addition(int a) {

//

//
//		// TODO: Ecrire le résultat de la somme des deux.
//
//		System.out.println("La somme est");
//		int reponse = result = in.nextInt();
//
//		if (reponse == z) {
//			System.out.println("niveau cp mais bravgo bg");
//		} else {
//			System.out.println("tu sais pas compter mais t'es gentil");
//		}

		return 0;
	}
}
