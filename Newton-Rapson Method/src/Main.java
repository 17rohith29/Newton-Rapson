/**Creator:Rohith Prabakar, student at University of Maryland College Park.
 * Newton rapson technique is a technique to calculate root of a function f(x)
 * if we take an arbitrary c1 we use it to get a c2=c1-f(c1)/f'(c1)
 * we repeat it till cn-1=cn=cn+1=.... which is the root of the function f(x)
 * In this program enter the function to which the root is to be calculated and the derivative of the function.
 */
import java.util.Scanner;

public class Main {
	
	public static double function(double x)
	{		
		return x*x;
	}
	/**
	 * This function is the function to which the root is to be calculated.
	 * @param x is the input value for the function.
	 * @return value of the function.
	 */
	
	public static double derivative(double x)
	{
		return 2*x;
	}
	/**
	 * his function is the derivative of the function to which the root is to be calculated.
	 * @param x is the input value to calculate the derivative value.
	 * @return value of the derivative of the function.
	 */
	
	public static double rapson(double x)
	{
		return (x-function(x)/derivative(x));
	}
	/**
	 * @param x is the c1 for which c2 is to be calculated.(can be viewed as cn-1 for which cn is to be calculated
	 * @return value of the next constant c2.
	 */
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the c1 value:");
		double x=sc.nextDouble();// We get input of the initial value c1 which we use to find derivative.
		
		System.out.print("Till what c should it be done?:");
		int y=sc.nextInt();//We get input which states how many times should we do the operation.
		
		sc.close();
		
		int count=1;//variable to find out at what c the value became a root.
		int z=0;//variable to check if f'(cn)=0 has .
		
		for(int i=1;i<=y;i++)
		{
			if(derivative(x)!=0) {
				x=rapson(x);
				count++;
			}
			else z++;
		}
		
		System.out.println(x);
		if(z>0) System.out.println("The value became a zero at c"+count);
	}	
}
