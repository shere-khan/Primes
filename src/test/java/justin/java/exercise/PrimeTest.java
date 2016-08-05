package justin.java.exercise;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

import java.util.ArrayList;
import java.util.List;

import org.hamcrest.collection.IsIterableContainingInOrder;
import org.junit.Assert;
import org.junit.Test;

public class PrimeTest {
	@Test
	public void isPrimeTest() {
		assertTrue(Primes.isPrime(7));
	}
	
	@Test
	public void isNotPrimeTest() {
		assertFalse(Primes.isPrime(4));
	}

	@Test
	public void primeListTest() {
		List<Integer> testPrimeList = new ArrayList<Integer>();
		testPrimeList.add(1);
		testPrimeList.add(2);
		testPrimeList.add(3);
		testPrimeList.add(5);
		testPrimeList.add(7);
		Assert.assertThat(Primes.primes(10), IsIterableContainingInOrder.contains(testPrimeList.toArray()));
	}
}
