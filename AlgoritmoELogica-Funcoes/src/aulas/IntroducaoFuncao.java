package aulas;

public class IntroducaoFuncao {

	public static void main(String[] args) {

		ImprimeNome();
		RecebeNome("Cordeiro");
		System.out.println("A soma dos dois números é: " + Somar());
		System.out.println("A soma dos dois número é: " + SomarParametros(10 , 20));
		System.out.println(DoisParametros("Leandro" , 24));
	}
	
	public static void ImprimeNome() {
		System.out.println("Meu nome é Leandro!");
	}
	
	public static void RecebeNome(String nome) {
		System.out.println("Meu sobrenome é: " + nome);
	}
	
	public static int Somar ( ) {
		return 1 + 1;
	}
	
	public static int SomarParametros(int j, int f) {
		return j + f;
	}
	
	public static String DoisParametros(String nome , int idade) {
		return nome + " tem " + idade + " anos.";
	}

}
