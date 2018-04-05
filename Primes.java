/**Primes numbers*/

public class Primes {

	public static void main(String[] args) {

		isPrime();	
	}
	
	public static void isPrime() {

		boolean check;
		
		for(int i = 2; i <= 100; i++) {

			check = true;

				for (int j = 2 ; j < i; j++) 
					if(i % j == 0 && j != i)
						check = false;

				if(check)
					System.out.print(i + " ");
			}
		}
	}