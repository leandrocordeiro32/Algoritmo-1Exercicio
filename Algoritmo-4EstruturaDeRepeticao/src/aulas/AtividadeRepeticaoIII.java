package aulas;

import java.util.Scanner;

public class AtividadeRepeticaoIII {

	public static void main(String[] args) {
		/*Faça um programa que leia e valide as seguintes informações:
		 *A.Nome:maior que 3 caracteres;
		 *B.Idade: entre 0 e 150;
		 *C.Salário: maior que zero;
		 *D.Sexo:'f' ou 'm';
		 *E.Estado Civil: 's', 'c', 'v', ‘d’;*/
		
	Scanner sc = new Scanner(System.in);
	
	String nome;
	int idade = 0;
	double salario = 0.0;
	char sexo , estadoCivil;

	System.out.print("Informe o nome completo: ");
	nome = sc.nextLine();
	
	while (nome.length() <= 3) {
		System.out.print("Nome Inválido! Digite novamente: ");
		nome = sc.nextLine();
	}
	
	System.out.print("Informe a idade: ");
	idade = sc.nextInt();
	
	while (idade <= 0 || idade > 150) {
		System.out.print("Idade Inválida! Digite novamente: ");
		idade = sc.nextInt();
	}
	
	System.out.print("Informe o salário: ");
	salario = sc.nextDouble();
	
	while (salario < 0) {
		System.out.print("Salário inválido! Digite novamente: ");
		salario = sc.nextDouble();
	}
	
	System.out.print("Informe o sexo > (F) Femininno > (M) Masculino: ");
	sexo = sc.next().charAt(0);
	
	while (Character.toUpperCase(sexo) != 'M' &&
			Character.toUpperCase(sexo) != 'F') {
		System.out.println("Sexo Inválido! Digite novamente: ");
		sexo = sc.next().charAt(0);
	}
	
	System.out.print("Informe o estado civil > (S) Solteira/o > (C) Casada/o > (V) viúva/o > (D) divorciada/o: ");
	estadoCivil = sc.next().charAt(0);
	
	while (Character.toUpperCase(estadoCivil) != 'S' && Character.toUpperCase(estadoCivil) != 'C' 
			&& Character.toUpperCase(estadoCivil) != 'V' && Character.toUpperCase(estadoCivil) != 'D') {
		System.out.println("Estado Civil Inválido! Digite novamente: ");
		estadoCivil = sc.next().charAt(0);
	}
	
	System.out.println("Nome: " + nome);
	System.out.println("Idade: " + idade);
	System.out.printf("Salário: %.2f" , salario);
	System.out.println(" ");
	System.out.println("Sexo: " + sexo);
	System.out.println("Estado Civil: " + estadoCivil);
		
	sc.close();

	}

}
