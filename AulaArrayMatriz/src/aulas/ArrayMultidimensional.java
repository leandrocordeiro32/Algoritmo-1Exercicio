package aulas;

public class ArrayMultidimensional {

	public static void main(String[] args) {

		int[][] numerosArray = new int[3][3];
		int[][] num = {{1 , 2 , 3} , {3 , 2 , 1} , {2 , 1 , 3}};
		int contador = 10;
		
		/*for (int i = 0 ; i < num.length ; i++) {
			for(int j = 0 ; j < num.length ; j++) {
				System.out.print(num[i][j]+ "\t");
			}
			
			System.out.println("\n");

		}*/
		

		for (int i = 0; i < numerosArray.length; i++) {

			for (int j = 0; j < numerosArray.length; j++) {

				numerosArray[i][j] = contador;
				System.out.print(numerosArray[i][j] + "\t");
				contador++;
			}

			System.out.println("\n");
		}
		
		System.out.print(numerosArray[0][0] + "\n \t" + numerosArray[1][1] + "\n \t \t" + numerosArray[2][2]);
 
	}

}
