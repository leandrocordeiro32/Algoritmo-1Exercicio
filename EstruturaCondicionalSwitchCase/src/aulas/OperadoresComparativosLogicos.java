package aulas;

import java.util.Scanner;

public class OperadoresComparativosLogicos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*  Operadores comparativos
		 *  >	Maior que
		 *  < 	Menor que
		 *  >= 	Maior ou igual a
		 *  <= 	Menor ou igual a
		 *  != 	Diferente
		 *  == 	igual
		 *  
		 *  Operadores Lógicos
		 *  &&	E
		 *  ||	ou
		 *  !	Não/Negação
		 *  
		 *  Operadores de incremento, decremento e mais
		 *  =	o mesmo que		 x = x + numero
		 * -=	o mesmo que		 x = x – numero
		 * *=	o mesmo que		 x = x * numero
		 * /=	o mesmo que 		 x = x / numero
	     * ++    incrementa mais 1   num++ ou ++num
	     * --     decrementa em   1	 num-- ou --num
			*/

		int a = 11;
		int b = 20;
		int c = 10;
		double d = 0.0;
		
		/*boolean v = true;
		boolean f = false;
		
		if (a == c || b != a) {
			System.out.println("Sim");
		}
		else {
			System.out.println("Não!");
		}*/
		
		/*System.out.println(++a);
		System.out.println(b++);
		System.out.println(b);
		System.out.println(a += b);*/
		
		/*int ano = 2024;
		
		if (ano %4 == 0) {
			System.out.println("O ano é bisexto!");
		}else {
			System.out.println("O ano não é bisexto!");
		}*/
		
		System.out.print("Entre com a nota: ");
		d = sc.nextDouble();
		
		if(d >= 0.0 && d <= 10.0) {
			System.out.println("Ok. Nota válida");
		}else {
			System.out.println("Entre com um valor entre 0 e 10.");
			System.out.print("Entre com a nota: ");
			d = sc.nextDouble();
			if(d >= 0.0 && d <= 10.0) {
				System.out.println("Nota válida");
			}else {
				System.out.println("Sabe ler não? Entre com um valor entre 0 e 10!");
			}
		}
		
		
		sc.close();
	}

}
