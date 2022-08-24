package util;

public class CurrencyConverter {

//class	
	public static double dolar;
	public static double percentage = 6;
	public static double quantity;
	
//methods	
	public static double converter(double real){
		real = quantity * dolar;
		return  real + real * (percentage / 100); 
	}

}


