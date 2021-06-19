/* perfect number - muhtesem sayi*/
public class Q22 {

    public static void isPerfect(int number){

        int sum = 0;
        if(number > 1) {
            for (int i = 1; i < number; i++) {
                if(number % i == 0){
                    sum += i;
                }
            }

            if(number == sum){
                System.out.println("Perfect Number");
            }else {
                System.out.println("Not perfect Number");
            }

        }
    }

    public static void main (String[] args)
    {
        isPerfect(6);
        isPerfect(4);
    }
}