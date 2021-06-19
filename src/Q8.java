/* bir sayının asal olup olmadıgını bulan program */
public class Q8 {

    public static boolean isPrime(int number){

        boolean isPrime = true;
        for(int i=2;i<number;i++){
            if(number % i ==0){
                return isPrime = false;
            }
        }
        return isPrime;
    }

    public static void main(String[] args) {

        if(isPrime(4)){
            System.out.println("Prime");
        }else{
            System.out.println("NOT Prime");
        }
    }
}
