import java.util.LinkedList;
import java.util.Scanner;

/* bagimli listenin ortanca elemanını bulan program */
public class Q12 {
    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<>();

        Scanner sc = new Scanner(System.in);
        int value = 0;

        while(value<4){
            System.out.println("Enter the value to list:\n");
            value = sc.nextInt();
            list.add(value);

        }

        int listSize = list.size();

        int mid = list.get(listSize / 2);

        System.out.println("Middle element of the list:" + mid);

    }
}
