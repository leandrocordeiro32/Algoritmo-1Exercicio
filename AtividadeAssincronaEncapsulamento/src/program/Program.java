package program;

import java.util.Scanner;

import entities.Herois;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Herois herois = new Herois();
		
		System.out.println(herois.getDrManhattan());
		
		sc.close();
	}

}
