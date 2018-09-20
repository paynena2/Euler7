import java.util.ArrayList;

public class Primes {
	public static void main(String[] args) {
		ArrayList<Integer> primes = new ArrayList<Integer>();
		ArrayList<Integer> notPrimes = new ArrayList<Integer>();
		for(int x = 2; x< 500000; x++) {
			primes.add(x);
		}
		for(int z : primes) {
			for(int y = 2; y< Math.floor(Math.sqrt(500000)); y++) {
				if (z % y == 0) {
					notPrimes.add(z);
					int num = z/y;
					notPrimes.add(num);
				}
			}
		}
		primes.removeAll(notPrimes);
		System.out.println(primes.get(10002));
	}
	
}
