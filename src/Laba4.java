import java.math.BigInteger;
import java.util.Scanner;

public class Laba4 {

	public static void main(String[] args) {
		Alice.generateOpenKey();
		Alice.generateCloseKey();
		Bob.encryptionMessage();
		Alice.decryptionMessage();
	}
}
