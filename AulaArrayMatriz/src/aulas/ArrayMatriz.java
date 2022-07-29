package aulas;

import java.util.Scanner;

public class ArrayMatriz {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	
	/*int[] numero = new int[5]; //Declara a quantidade de posições do array
	int[] numero2 = {1 , 25 , 10 , 67}; //Inicializa o array
	
	System.out.println(numero2[3]); //Obtem o valor do array no índice indicado
	System.out.println(numero.length); //Obtem o tamanho do array
	
	System.out.println("Entre com a quantidade: ");
	int qtd = sc.nextInt();
	
	int[] passadoTeclado = new int[qtd];
	
	System.out.println("Quantidade de posições: " + passadoTeclado.length);*/
	
	//int[] numeros = {1 , 10 , 25 , 9 , 50};
	
	/*for (int i = 0; i < numeros.length; i++) {
		System.out.println("Posição: " + i + ", valor no array: " + numeros[i]);
	}*/
	
	//for each = para ate;
	/*for(int i : numeros) {
		System.out.println(i);
	}
	
	System.out.println("Entre com a quantidade de nomes: ");
	int qtd = sc.nextInt();
	
	String[] nomes = new String[qtd];
	sc.nextLine();
	
	for(int i = 0; i < nomes.length; i++) {
		System.out.println("Entre com o nome: ");
		nomes[i] = sc.nextLine();
	}
	for(int i = 0; i < nomes.length; i++) {
		System.out.println("Nome: " + nomes[i]);
	}
	for(String nome : nomes) {
		System.out.println("Nome: " + nome);
	}*/
	
	//Array Multidimensional
	
	int[][] numerosArray = new int[3][3];
	int[][] num = {{1 , 2 , 3} , {3 , 2 , 1} , {2 , 1 , 3}};
	int contador = 10;
	
	for (int i = 0 ; i < num.length ; i++) {
		for(int j = 0 ; j < num.length ; j++) {
			System.out.print(num[i][j]+ "\t");
		}
		
		System.out.println("\n");
	}
	

	for (int i = 0; i < numerosArray.length; i++) {

		for (int j = 0; j < numerosArray.length; j++) {

			numerosArray[i][j] = contador;
			System.out.print(numerosArray[i][j] + "\t");
			contador++;
		}

		System.out.println("\n");
	}
	
	System.out.print(numerosArray[0][0] + "\n \t" + numerosArray[1][1] + "\n \t \t" + numerosArray[2][2]);

	sc.close();
	
	}


}
