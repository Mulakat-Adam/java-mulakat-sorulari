import java.util.Scanner;

/* recursive fonksiyon kullanarak kullanıcıdan alınan bir sayının factorial hesabı */
public class Q4 {

    public static int findFactorial(int number){

        if(number == 0 || number == 1){
            return 1;
        }
        return number * findFactorial(number - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = sc.nextInt();
        sc.close();
        int facNumber = findFactorial(number);
        System.out.println("Factorial of "+number+" "+facNumber);
    }

}
