package er001;

import java.math.BigInteger;

public class Homework10_1 {
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			Integer n = (int) (Math.random() * 100 + 1);
			String k = n.toString();
			BigInteger o = new BigInteger(k);

			if (o.isProbablePrime(n)) {
				System.out.println(n + " is a prime");
			} else {
				System.out.println(n + " is not a prime");
			}
		}
	}
//	public static void main(String[] args) {
//	random.nextInt()
//	Random random = new Random();
//	for (int j = 1; j <= 5; j++) {
//		int r = random.nextInt(100) + 1;
//		if (isPrime(r)) {
//			System.out.println(r + "是質數");
//		} else {
//			System.out.println(r + "不是質數");
//		}
//	}
//}
//public static boolean isPrime(int r) {
//		if (r <= 1) {
//			return false;
//		}
//	for(int k = 2;k<=Math.sqrt(r);k++){
//		if (r % k == 0) {
//			return false;
//		}
//	}return true;
//}
//}	
}
