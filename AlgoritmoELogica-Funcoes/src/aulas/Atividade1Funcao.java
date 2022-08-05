package aulas;

import java.util.Scanner;

public class Atividade1Funcao {

	public static void main(String[] args) {
		/* Crie um programa para receber os dados de uma pessoa (altura, peso, idade e sexo),
		 * imprima na tela seu imc e se está dentro do peso ideal, sobrepeso ou abaixo do peso;*/
		
		indiceCorporal();		
		
		}
	public static void indiceCorporal() {
		
		Scanner sc = new Scanner(System.in);

		String nome;
		char genero;
		int idade;
		double peso , altura;
		
		System.out.print("Informe seu nome: ");
		nome = sc.nextLine();
			while (nome.length() < 3) {
				System.out.print("\nNome inválido! Informe o nome válido: ");
				nome = sc.nextLine();
			}
		
		System.out.print("\nInforme seu gênero: ");
		genero = sc.next().charAt(0);
			while(Character.toUpperCase(genero) != 'H' && Character.toUpperCase(genero) != 'M' && Character.toUpperCase(genero) != 'O') {
				System.out.print("\nGênero inválido! Informe (H) Homem, (M) Mulher ou (O) Outros: ");
				genero = sc.next().charAt(0);
			}
		
		System.out.print("\nInforme sua idade: ");
		idade = sc.nextInt();	
			while (idade < 18) {
				System.out.print("\nEsta calculadora mede o IMC de pessoas acima de 18 anos\r\n"
						+ "Crianças e adolescentes devem consultar um profissional de saúde especializado \n");
				System.out.print("\nInforme uma idade acima de 18 anos: ");
				idade = sc.nextInt();
			}
			
		System.out.print("\nInforme o peso (kg): ");
		peso = sc.nextDouble();
			while (peso < 30) {
				System.out.print("\nValor abaixo do peso ideal! Informe um peso válido: ");
				peso = sc.nextDouble();
			}
			
		System.out.print("\nInforme sua altura (m): ");
		altura = sc.nextDouble();
			while(altura <= 0 || altura > 3) {
				System.out.print("\nInforme altura entre 1 e 3 metros: ");
				altura = sc.nextDouble();
			}
		
		System.out.println("\n" + nome + " é do gênero " + genero + " tem " + idade + " anos. Pesa " + peso +
					" kg e tem " + altura + " m de altura.");	
			
		if (genero == 'H') {
			
			imcH(peso , altura);
			
		}
		else if (genero == 'M') {
			
			imcM(peso , altura);
			
		}
		else  {
			imcO(peso , altura);
		}
		sc.close();

		
	}

	public static void imcH(double peso , double altura) {
		double imch = peso / (altura * altura);
		if (imch < 20.7) {
			System.out.println("\nSeu IMC está abaixo do peso normal: " + imch +
					".\nBusque orientação médica!");
		}
		else if (imch > 20.7 && imch < 26.4) {

			System.out.println("\nSeu IMC está normal: " + imch);
		}
		else if (imch > 26.5 && imch < 27.8) {
			System.out.println("\nSeu IMC indica que está com sobrepeso: " + imch +
					".\nBusque orientação médica!");
		}
		else if (imch > 27.9 && imch < 31.1) {
			System.out.println("\nSeu IMC indica que está com obesidade: " + imch +
					".\nBusque orientação médica!");
		}
		else if (imch > 31.2) {
			System.out.println("\nSeu IMC indica que está com obesidade grave: " + imch +
				".\nBusque orientação médica!");
		}
	}
	
	public static void imcM(double peso , double altura) {
		double imcm = peso / (altura * altura);
		if (imcm < 19.1) {
			System.out.println("\nSeu IMC está abaixo do peso normal: " + imcm +
					".\nBusque orientação médica!");
		}
		else if (imcm > 19.1 && imcm < 25.8) {

			System.out.println("\nSeu IMC está normal: " + imcm);
		}
		else if (imcm > 25.9 && imcm < 27.3) {
			System.out.println("\nSeu IMC indica que está com sobrepeso: " + imcm +
					".\nBusque orientação médica!");
		}
		else if (imcm > 27.4 && imcm < 32.3) {
			System.out.println("\nSeu IMC indica que está com obesidade: " + imcm +
					".\nBusque orientação médica!");
		}
		else if (imcm > 32.4) {
			System.out.println("\nSeu IMC indica que está com obesidade grave: " + imcm +
				".\nBusque orientação médica!");
		}


	}
	public static void imcO(double peso , double altura) {
		double imco = peso / (altura * altura);
		if (imco < 18.5) {
			System.out.println("\nSeu IMC está abaixo do peso normal: " + imco +
					".\nBusque orientação médica!");
		}
		else if (imco > 18.5 && imco < 24.9) {

			System.out.println("\nSeu IMC está normal: " + imco);
		}
		else if (imco > 25 && imco < 29.9) {
			System.out.println("\nSeu IMC indica que está com sobrepeso: " + imco +
					".\nBusque orientação médica!");
		}
		else if (imco > 30 && imco < 39.9) {
			System.out.println("\nSeu IMC indica que está com obesidade: " + imco +
					".\nBusque orientação médica!");
		}
		else if (imco > 40) {
			System.out.println("\nSeu IMC indica que está com obesidade grave: " + imco +
				".\nBusque orientação médica!");
		}

	}
	
}
