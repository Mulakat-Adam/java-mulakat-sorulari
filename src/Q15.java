import java.util.ArrayList;
import java.util.List;

/* recursive fonksiyon kullanarak bir listenin toplamını bulan program */
public class Q15 {

    public static Integer sumOfList(List<Integer> list){
        try {
            return list.get(0) + sumOfList(list.subList(1, list.size()));
        }catch (Exception e) {
            return 0;
        }
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        int sum = sumOfList(list);
        System.out.println(sum);
    }

}
