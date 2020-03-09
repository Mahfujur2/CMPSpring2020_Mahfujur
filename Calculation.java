/**
 * 
 * @author Mahfujur Rahman
 * created 3/9/2020
 * description: Calculation Methods
 */ 

public class Calculation {
	/* method sumfrom1ToN
	 * parameters: int n
	 * output: sum from 1 to n
	 */
	public static int sum1toN(int n) {
		int total = 0;
		for (int i = 1; i<=n;i++)
			total += i;
		return total;
		
	}
	/*
	 * Method: Quadratic Formula
	 * Parameters: a, b, c
	 * Returns: double[]
	 */
public static double[] quadraticFormula(double a, double b, double c ) {
	double [] roots = new double [2];
	double result = b*b - 4*a*c;
	result = Math.sqrt(result)/2.0*a;
	roots[0]= -b+result;
	roots[1]= -b-result;
	return roots;
}

/*
 * Method: weatherAlert
 * parameter: Temperature
 * Returns; String 
 */
public static String weatherAlert(int temperature) {
	if(temperature>70)
		return "hot";
		else if (temperature>50)
			return "warm";
		else if (temperature>35)
			return "cool";
		return "cold";
		
	}
	public static void main(String[] args) {
	System.out.println(sum1toN(5));
	System.out.println(quadraticFormula(1, 5, 3)[0]);
	System.out.println(weatherAlert(30));
	}
	}
		
		
		
public class Calculation {

}
