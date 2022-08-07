package program;

import java.util.ArrayList;
import java.util.Scanner;

import entities.Herois;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Herois herois = new Herois();
		ArrayList<String> superPoderes = new ArrayList<>();

		System.out.println("Você está no Cadastro Universal de Heróis e Vilões - CUHV\n");
		System.out.print("Informe (H) para cadastrar Heroína/Herói ou (V) para cadastrar Vilã/Vilão: ");
		char selecao = sc.next().charAt(0);
		
		switch (Character.toUpperCase(selecao)) {
		case 'H':
			herois.herois();;
		}
		sc.close();

	}

}
