package aulas;

import java.util.Scanner;

public class Atividade1Funcao {

	public static void main(String[] args) {
		/* Crie um programa para receber os dados de uma pessoa (altura, peso, idade e sexo),
		 * imprima na tela seu imc e se está dentro do peso ideal, sobrepeso ou abaixo do peso;*/

		Scanner sc = new Scanner(System.in);
		
		String nome;
		char genero;
		int idade = 0;
		double peso = 0.0 , altura = 0.0 , imc = 0.0;
		
		System.out.print("Informe seu nome: ");
		nome = sc.nextLine();
			while (nome.length() < 3) {
				System.out.print("Nome inválido! Informe o nome válido: ");
				nome = sc.nextLine();
			}
		
		System.out.print("Informe seu gênero: ");
		genero = sc.next().charAt(0);
			while(Character.toUpperCase(genero) != 'H' && Character.toUpperCase(genero) != 'M' && Character.toUpperCase(genero) != 'O') {
			System.out.print("Gênero inválido! Informe (H) Homem, (M) Mulher ou (O) Outros: ");
			genero = sc.next().charAt(0);
			}
		
		System.out.print("Informe sua idade: ");
		idade = sc.nextInt();
		
		while (idade < 18) {
			System.out.print("Esta calculadora mede o IMC de pessoas acima de 18 anos\r\n"
					+ "Crianças e adolescentes devem consultar um profissional de saúde especializado \n");
			System.out.print("Informe uma idade acima de 18 anos: ");
			idade = sc.nextInt();
		}
		
		System.out.print("Informe o peso (kg): ");
		peso = sc.nextDouble();
		while (peso < 30) {
			System.out.print("Valor abaixo do peso ideal! Informe um peso válido: ");
			peso = sc.nextDouble();
		}
		
		System.out.print("Informe sua altura (m): ");
		altura = sc.nextDouble();
		while(altura < 1 && altura > 3) {
			System.out.print("Informe altura entre 1 e 3 metros: ");
			altura = sc.nextDouble();
		}
		
		imc = indiceCorporal(peso , altura);
		System.out.println(" ");
		
		if (imc < 18.5) {
			System.out.println(nome + " é do gênero " + genero + " tem " + idade + " anos. Pesa " + peso +
					" kg e tem " + altura + " m de altura. Seu IMC está abaixo do peso normal: " + indiceCorporal(peso , altura) +
					".\nBusque orientação médica!");
		}
		else if (imc > 18.5 && imc < 24.9) {

			System.out.println(nome + " é do gênero " + genero + " tem " + idade + " anos. Pesa " + peso +
					" kg e tem " + altura + "m de altura. Seu IMC está normal: " + indiceCorporal(peso , altura));
		}
		else if (imc > 25 && imc < 29.9) {
			System.out.println(nome + " é do gênero " + genero + " tem " + idade + " anos. Pesa " + peso +
					" kg e tem " + altura + " m de altura. Seu IMC indica que está com sobrepeso: " + indiceCorporal(peso , altura) +
					".\nBusque orientação médica!");
		}
		else if (imc > 30 && imc < 39.9) {
			System.out.println(nome + " é do gênero " + genero + " tem " + idade + " anos. Pesa " + peso +
					" kg e tem " + altura + " m de altura. Seu IMC indica que está com obesidade: " + indiceCorporal(peso , altura) +
					".\nBusque orientação médica!");
		}
		else if (imc > 40) {
			System.out.println(nome + " é do gênero " + genero + " tem " + idade + " anos. Pesa " + peso +
				" kg e tem " + altura + " m de altura. Seu IMC indica que está com obesidade grave: " + indiceCorporal(peso , altura) +
				".\nBusque orientação médica!");
		}
		
		sc.close();
	
	}
	public static double indiceCorporal (double peso , double altura) {
		return peso / (altura * altura);
		
		}
		
	}
