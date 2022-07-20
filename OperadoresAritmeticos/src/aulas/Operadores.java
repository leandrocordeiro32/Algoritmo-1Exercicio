package aulas;

public class Operadores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double a = 10.0;
		double b = 5.0;
		double c = 2.0;
		
		/*System.out.println("A soma de a e b é: " + (a + b));
		System.out.println("A subtração de a e b é: " + (a - b));
		System.out.println("A multiplicação de a e c é: " + (a * c));
		System.out.println("A divisão de a e b é: " + (a / b));
		System.out.println("O resto da divisão entre a e c é: " + (a % c));*/
		
		double resultado = a * b + c;
		System.out.println(resultado);
		
		resultado = a * (b + c);
		System.out.println(resultado);
		
		resultado = a * c / b + a;
		System.out.println(resultado);
		
		
	}

}
