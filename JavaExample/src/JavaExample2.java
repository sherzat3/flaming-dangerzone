import java.util.Arrays;


public class JavaExample2 {


	public int fibonacci(int q){
		if(q == 1 || q == 2) return 1;
		
		else
			return fibonacci(q - 2) + fibonacci(q - 1);
	}
	
	public int factorial(int q){
		if(q == 1)
			return 1;
		
		else
			return q * factorial(q - 1);
	}
	
	public int[] primes(int q){
		int[] a = new int[1000];
		int n = 0;
		
		for(int i = 2; i <= q; ++i)
			if(isPrime(i))
				a[n++] = i;
		
		return a;
	}
	
	public boolean isPrime(int q){
		if(q == 1) return false;
		
		for(int i = 2; i * i <= q; ++i)
			if(q % i == 0)
				return false;
		
		return true;
	}
	
	public int[] sort(int[] a){
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
	
	public boolean compareTwoStrings(char[] a, char[] b){
		
		if(a.length != b.length) return false;
		
		int[] letters = new int[30];
		Arrays.fill(letters, 0);
		
		for(int i = 0; i < a.length; ++i){
			letters[(int)(a[i] - 'a')]++;
			letters[(int)(b[i] - 'a')]--;
		}
		
		for(int i = 0; i < 30; ++i){
			if(letters[i] != 0)
				return false;
		}
		
		return true;
		
	}
}