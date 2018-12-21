import java.math.BigInteger;
import java.util.Scanner;

public class Bob {
	
	public static BigInteger c;
	
	public static void encryptionMessage() {
		
		Scanner scanner = new Scanner(System.in);
		BigInteger nn = BigInteger.valueOf(Alice.n);
		System.out.print("Введите сообщение: ");
		int message = scanner.nextInt();
		BigInteger mess = BigInteger.valueOf(message);
		c = (mess.pow(Alice.e)).mod(nn);
		System.out.println("Зашифрованное сообщение: "+ c);
	}
}
