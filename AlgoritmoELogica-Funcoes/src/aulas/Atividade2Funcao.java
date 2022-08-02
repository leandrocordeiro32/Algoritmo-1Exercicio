package aulas;

import java.util.Scanner;

public class Atividade2Funcao {

	public static void main(String[] args) {
		/* 2. Crie um programa que receba o valor da gasolina e do álcool, e retorno para o usuário qual
		 *  está compensando mais utilizar;*/
		
		Scanner sc = new Scanner(System.in);
			
		double alcool , gasol , calc = 0.0;
	
		System.out.print("Insira o valor do litro do álcool: ");
		alcool = sc.nextDouble();
		
		System.out.print("Insira o valor do litro da gasolina: ");
		gasol = sc.nextDouble();
		
		System.out.println(" ");
		
		calcComb(alcool , gasol);
		
		sc.close();
	

	}
	
	public static void calcComb (double alcool , double gasol) {
		if (alcool / gasol >= 0.70) {
			System.out.println("É mais vantajoso abastecer com GASOLINA!");
		}
		else {
			System.out.println("É mais vantajoso abastecer com ÁLCOOL!");
		}

	}

}
