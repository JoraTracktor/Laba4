import java.math.BigInteger;
import java.util.Random;
import java.util.Scanner;

public class Alice {
	
	public static int n, e;
	private static int d = 1, fn;
	
	public static void generateOpenKey() {

		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		System.out.println("Введите 2 приблизительно одинаковых простых числа: ");
		System.out.print("p = ");
		int p = scanner.nextInt();
		System.out.print("q = ");
		int q = scanner.nextInt();
		n = p * q;
		//System.out.println("n = p * q = " + n);
		fn = (p - 1)*(q - 1);
		System.out.println("fn = (p - 1)*(q - 1) = " + fn);
		
		while (true) {
			e = 3 + random.nextInt(100 - 3);
			if (relativelyPrime(e,fn)) {
				break;
			}
		}	
		System.out.println("e = " +e );
	} 
	
	public static void decryptionMessage(){
		BigInteger 	message,
					nn = BigInteger.valueOf(n);
				
		message = ((Bob.c).pow(Alice.d)).mod(nn);	
		System.out.println("Дешифрованное сообщение: " + message);
	}
	
	
	public static void generateCloseKey() {
		
		while(true) {
			if ((Alice.e*d)% fn ==1 && d!=e)
				break;
			d++;
		}
		
		System.out.println("d = " +d);
			
	}
	
	private static long gcd(long a, long b) {
	    long t;
	    while(b != 0){
	        t = a;
	        a = b;
	        b = t%b;
	    }
	    return a;
	}
	
	private static boolean relativelyPrime(long a, long b) {
	    return gcd(a,b) == 1;
	}
	
}
