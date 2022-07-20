package exercicio;

import java.util.Scanner;

public class InsercaoDados {

	public static void main(String[] args) {
		// Faça um programa que peça o nome do usuario, a idade,  o sexo e um saldo bancario.
        // Mostre os dados na tela concatenados com uma frase que faça sentido. 
	    // ex.: Fulano tem 100 anos, seu sexo é M e possui a fortuna de R$ 10.00 reais no banco.

        Scanner leia = new Scanner(System.in);
        
        String nome;
        int idade = 0;
        char sexo;
        double saldo;
        
        System.out.println("Informe o nome: ");
        nome = leia.nextLine();
        
        System.out.println("Informe a idade: ");
        idade = leia.nextInt();
        
        System.out.println("Informe o sexo: ");
        sexo = leia.next().charAt(0);
        
        System.out.println("Informe seu saldo bancário: ");
        saldo = leia.nextDouble();
        
        System.out.println(nome + " tem " + idade + " anos, seu sexo é " + sexo + " e possui a fortuna de R$ " + saldo + "reais no banco.");
        
        leia.close();
	}

}
