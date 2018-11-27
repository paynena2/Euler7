
public class Primes2 {
	public static void main(String[] args) {
		int counter = 1; //starts at 1 to count 1 as a prime
		int x = 2; //starts at 2 so 1 is counted as a prime
		while(true) {
			System.out.println(x);
			boolean prime = true;
			for(int z = 2; z<=x/2; z++) {
				if(x % z == 0) {
					prime = false;
					break;
				}
			}
			if(prime) {
				counter++;
				System.out.println("Counter: " + counter);
			}
			if(counter == 10002) {
				System.out.println(x);
				break;
			}
			x++;
		}
	}
}
