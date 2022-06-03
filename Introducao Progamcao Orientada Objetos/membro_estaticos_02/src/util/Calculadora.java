package util;

public class Calculadora {
	
	public static double IOF = 1.06;
	
	public static double cotacao(double precoDollar, double cotacaoDollar) {
		return precoDollar * cotacaoDollar * IOF;
	}
}
