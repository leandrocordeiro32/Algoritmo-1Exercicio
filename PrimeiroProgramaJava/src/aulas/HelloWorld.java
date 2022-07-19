package aulas;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int minhaVariavel = 10; //camelCase
		int MinhaVariavel = 10; //PascalCase
		String minhaString = "Leandro Cordeiro";
		double minhaDouble = 10.25; //usar ponto para separar casas decimais
		char minhaChar = 'M'; //char usa ' ao invés de "
		boolean verdadeiro = true;
		boolean falso = false;		
		
		System.out.println("Hello World");
		System.out.println(minhaVariavel);
		System.out.println(minhaString);
		System.out.println(minhaDouble);
		System.out.println(minhaChar);
		System.out.println(verdadeiro);
		System.out.println(falso);
		System.out.println(minhaVariavel + " " + minhaString + " " + minhaDouble);
		System.out.println(minhaString + "\n" + verdadeiro);
		
		
		System.out.print("Aqui");
		System.out.print(" vai uma ");
		System.out.print("mensagem!");

		
	}

}
