import java.io.IOException;
import java.util.Scanner;


public class JavaExample {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int number1, number2, c = 5;

		System.out.println("Welcome to Calculator!");
		System.out.println("Please enter two numbers");

		number1 = sc.nextInt();
		number2 = sc.nextInt();

		while(c != 0){
			menu();

			c = sc.nextInt();
			
			if(c == 0) break;
			
			if(c < 0 || c > 4){
				System.out.println("Please enter the number from 0 to 4");
				continue;
			}
			
			float res = 0;
			
			switch(c){
			case 1:
				res = (int)sum(number1, number2);
				break;
			case 2:
				res = (int)sub(number1, number2);
				break;
			case 3:
				res = (int)mul(number1, number2);
				break;
			case 4:
				res = div(number1, number2);
				break;
			default:
				break;
			}
			
			System.out.println("Result is " + res);
		}

	}

	public static void menu(){
		System.out.println("\n\n\tCalculator");
		System.out.println("Enter 1 for addition");
		System.out.println("Enter 2 for subtraction");
		System.out.println("Enter 3 for multiplication");
		System.out.println("Enter 4 for division");
		System.out.println("Enter 0 to exit");
	}

	public static int sum(int x, int y){
		return x + y;
	}

	public static int sub(int x, int y){
		return x - y;
	}

	public static float div(int x, int y){
		return (float) x / y;
	}

	public static int mul(int x, int y){
		return x * y;
	}

}
