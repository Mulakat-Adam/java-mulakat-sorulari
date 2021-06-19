import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/* java 8 streams ornekleri */
public class Q23 {
    public static void streams(){
        List<Integer> numbers = Arrays.asList(1,2,3,4,5);
        List<String> names = Arrays.asList("Mutlu","Metin","Umut");

        // convert the numbers array as a square
        List<Object> square = new ArrayList<>();
        square = numbers.stream().map(x->x*x).collect(Collectors.toList());
        System.out.println(square);

        //find the even numbers of the list
        List<Integer> even = new ArrayList<>();
        numbers.stream().filter(x->x %2 ==0 ).forEach(y -> even.add(y));
        System.out.println(even);

        //multiply with 3 the odd numbers list
        List<Integer> threeTimes = new ArrayList<>();
        threeTimes = numbers.stream().filter(x->x%2==1).map(y->y*3).collect(Collectors.toList());
        System.out.println(threeTimes);

        //find the name that is start with the M
        List<Object> letter = new ArrayList<>();
        letter = names.stream().filter( x -> x.startsWith("M") || x.startsWith("m")).collect(Collectors.toList());
        System.out.println(letter);

    }

    public static void main(String args[])
    {
        streams();
    }

}
