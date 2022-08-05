package entities;

public class FormulaHeron {

	/*static double lado1 = 0.0;
	static double lado2 = 0.0;
	static double lado3 = 0.0;*/
	
	public static double CalcularAreaTriangulo(double lado1 , double lado2, double lado3 ) {
		double p = (lado1 + lado2 + lado3) / 2;
		double area = Math.sqrt(p * (p - lado1) * (p - lado2) * (p - lado3));
		return area;
	}
}
