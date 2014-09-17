package Example2;
import java.util.Arrays;


public class JavaExample2 {

	public static void main(String[] args) {
		System.out.println("Fibonacci 7th element: " + fibonacci(7));
		System.out.println("Factorial of 6       : " + factorial(6));
		System.out.println("All primes until 100 : ");
		primes(100);
		System.out.println("Sort given array: 5 4 10 -3 3 2 1 0 20");
		int a[] = {5, 4, -10, 3, 2, 1, 0, 20};
		a = sort(a);
		for(int i = 0; i < 8; ++i)
			System.out.print(a[i] + " ");
		System.out.println();
		
		System.out.println("Compare strings \"abc\" and \"abc\"");
		char[] stringA = {'a', 'b', 'c'}, stringB = {'a', 'b', 'c'};
		System.out.println(compareTwoStrings(stringA, stringB));
		
		System.out.println("Compare string \"aaa\" and \"bbb\"");
		stringA = new char[] {'a', 'a', 'a'};
		stringB = new char[] {'b', 'b', 'b'};
		System.out.println(compareTwoStrings(stringA, stringB));
	}

	public static int fibonacci(int q){
		if(q == 1 || q == 2) return 1;
		
		else
			return fibonacci(q - 2) + fibonacci(q - 1);
	}
	
	public static int factorial(int q){
		if(q == 1)
			return 1;
		
		else
			return q * factorial(q - 1);
	}
	
	public static void primes(int q){
		int[] a = new int[1000];
		int n = 0;
		
		for(int i = 2; i <= q; ++i)
			if(isPrime(i))
				System.out.print(i + " ");
		
		System.out.println();
	}
	
	public static boolean isPrime(int q){
		if(q == 1) return false;
		
		for(int i = 2; i * i <= q; ++i)
			if(q % i == 0)
				return false;
		
		return true;
	}
	
	public static int[] sort(int[] a){
		for(int i = 0; i < a.length - 1; ++i){
			for(int j = i + 1; j < a.length; ++j)
				if(a[i] > a[j]){
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
		}
		
		return a;
	}
	
	public static boolean compareTwoStrings(char[] a, char[] b){
		
		if(a.length != b.length) return false;
		
		for(int i = 0; i < a.length; ++i)
			if(a[i] != b[i])
				return false;
		
		return true;
		
	}
}