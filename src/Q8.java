/* bir sayının asal olup olmadıgını bulan program */
public class Q8 {

	public static boolean isPrime(int number) {
		boolean isPrime = true;
		if(number > 2) {
			for(int i=2;i<number;i++) {
				if(number % i == 0) {
					isPrime = false;
					break;
				}else {
					isPrime = true;
				}
			}
		}else {
			isPrime = false;
		}
		
		return isPrime;
	}

    public static void main(String[] args) {

        System.out.println(isPrime(6));
        System.out.println(isPrime(2));
        System.out.println(isPrime(3));
    }
}
