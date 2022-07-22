package aulas;

import java.util.Scanner;

public class AtividadeIfElseI {

	public static void main(String[] args) {
		/*Peça para o usuário inserir o valor do seu salario bruto e faça o desconto de 5% do IRPF, 
		 *e 11 % do INSS e mostre o salario liquido. Se o salario liquido for menor que 1200,00 o
		 * profissional receberá 5% a mais de bônus, se o salario liquido ultrapassar 3500,00 o 
		 * funcionario recebera 2% a mais de bônus.
		 * */
	Scanner leia = new Scanner(System.in);
	
	double salarioBruto , salarioLiq , ir , inss , acrescimo2 , acrescimo5 = 0.0;
	
	System.out.print("Informe o valor do salário bruto: ");
	salarioBruto = leia.nextDouble();
	ir = salarioBruto * 0.05;
	inss = salarioBruto * 0.11;
	salarioLiq = (salarioBruto - ir - inss);
	acrescimo2 = (salarioLiq + (salarioLiq * 0.02));
	acrescimo5 = (salarioLiq + (salarioLiq * 0.05));
	
	
	System.out.printf("Desconto de IR: %.2f" , ir);
	System.out.println();
	System.out.printf("Desconto de INSS: %.2f" , inss);
	System.out.println();
	System.out.printf("Salário Líquido: %.2f" , salarioLiq);
	System.out.println();
	
	if(salarioLiq < 1200) {
		System.out.printf("Salário com acréscimo de 5 por cento: %.2f" , acrescimo5);
	}
		
	else if(salarioLiq > 3500) {
		System.out.printf("Salário com acréscimo de 2 por cento: %.2f" , acrescimo2);
	}

	leia.close();

	}

}
