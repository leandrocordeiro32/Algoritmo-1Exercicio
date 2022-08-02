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
		
		calc = calcComb(alcool , gasol);
		
		System.out.println(" ");
		
		if (calc < 0.7) {
			System.out.println("É mais vantajoso abastecer com ÁLCOOL!");
		}
		else if (calc > 0.71) {
			System.out.println("É mais vantajoso abastecer com GASOLINA!");
		}
		sc.close();
	

	}
	
	public static double calcComb (double alcool , double gasol) {
		return alcool / gasol;

	}

}
