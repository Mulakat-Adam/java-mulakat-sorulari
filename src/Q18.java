import java.util.ArrayList;

/* fizz buzz if %3 and %5 => fizzbuzz , only %3 => fizz, else %5 =>buzz */
public class Q18 {

    public static void fizzBuzz(int number){

        if(number > 0){
            ArrayList<String> list = new ArrayList<>();

            for(int i=1;i<=number;i++){
                if(i % 3== 0 && i % 5 != 0){
                    list.add("Fizz");
                }
                else if(i % 5== 0 && i % 3 != 0){
                    list.add("Buzz");
                }
                else if(i % 3== 0 && i % 5 == 0){
                    list.add("FizzBuzz");
                }else{
                    list.add(Integer.toString(i));
                }
            }

            System.out.println(list);
        }
    }

    public static void main(String[] args) {
        fizzBuzz(15);
    }
}
