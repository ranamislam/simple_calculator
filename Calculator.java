/******************************************************************************************
 * Author: Rana Islam
 * Date: 06/19/2019
 ******************************************************************************************/
import java.util.*;
public class Calculator 
{
	public static void main(String[] args)
	{
		System.out.println("Please enter first number of your calculation: ");
		Scanner keyboard = new Scanner(System.in);
		int input1 = keyboard.nextInt();
		
		System.out.println("Enter a for addition, s for substraction, m for multiply, d for division:");
		char input2 = keyboard.next().charAt(0);
		
		System.out.println("Please enter second number of your calculation: ");
		int input3 = keyboard.nextInt();
		
		if(input2 == 'a')
		{
			System.out.println("Result: " + addition(input1, input3));
			System.exit(0);
		}
		else if(input2 == 's')
		{
			System.out.println("Result: " + subtraction(input1, input3));
			System.exit(0);
		}
		else if(input2 == 'm')
		{
			System.out.println("Result: " + multiplication(input1, input3));
			System.exit(0);
		}
		else if(input2 == 'd')
		{
			System.out.println("Result: " + division(input1, input3));
			System.exit(0);
		}
		
	}
	
	public static int addition(int x, int y)
	{
		return x + y;
	}
	
	public static int subtraction(int x, int y)
	{
		return x - y;
	}
	
	public static int multiplication(int x, int y)
	{
		return x * y;
	}
	
	public static int division(int x, int y)
	{
		return x / y;
	}
}
