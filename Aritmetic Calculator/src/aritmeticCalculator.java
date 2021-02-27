import java.util.Scanner;

public class aritmeticCalculator {

	
	public void add(double a,double b)
    {
         System.out.println("The sum of two numbers are : " + (a + b));
    }
    
	public void subtract(double a, double b) 
    {
         System.out.println("The difference between two numbers are  : "+(a-b));
    }
	
	public void multiply(double a, double b)
	{
		System.out.println("the product of two numbers are: "+ (a*b));
	}
	
	public void divide(double a, double b)
	{
		System.out.println("the quotient of two numbers are:"+ (a/b));
	}
	
	public static void main(String[] args) {
		
		
		double firstNumber;
		double secondNumber;
		char arithmeticOperator;
		
		Scanner first = new Scanner(System.in);
		Scanner second = new Scanner(System.in);
		Scanner operator = new Scanner(System.in);
		
		System.out.println("This program will calculate two numbers!!!"); 
		
		System.out.println("Please enter first number:"); 
		firstNumber = first.nextDouble();
		
		System.out.println("Please enter second number:");
		secondNumber = second.nextDouble();
		
		aritmeticCalculator  ob = new aritmeticCalculator();
		
		System.out.println("Please enter your arithmetic operator +,-,* and /:"); 
	    arithmeticOperator = operator.next().charAt(0);
	    
	    switch (arithmeticOperator) {
	    
	    case '+':
	    	ob.add(firstNumber,secondNumber);
	    	break;
	    case '-':
	    	ob.subtract(firstNumber,secondNumber);
	    	break;
	    case '*':
	    	ob.multiply(firstNumber,secondNumber);
	    	break;
	    case '/':
	    	ob.divide(firstNumber,secondNumber);
	    	break;
	    default:
	    	System.out.println("Error operator not correct"); 
	    	return;
	    }
		
	}

}
