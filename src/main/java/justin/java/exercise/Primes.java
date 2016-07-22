package justin.java.exercise;

import java.util.ArrayList;
import java.util.List;

public class Primes {
	public static void main(String[] args) {
		System.out.println(primes(10).toString());
	}
	
	public static List<Integer> primes(int n) {
		if (n <= 0)
			return new ArrayList<Integer>();
		List<Integer> primeList = new ArrayList<Integer>();
		for (int i = 1; i < n; i++) {
			if (isPrime(i))
				primeList.add(i);
		}
		return primeList;
	}
	
	public static boolean isPrime(int n) {
		if (n == 1 || n == 2 || n == 3)
			return true;
		for (int i = 2; i < n; i++)
			if (n % i == 0)
				return false;
		return true;
	}
}
