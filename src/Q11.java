import java.util.ArrayList;
import java.util.List;

/* listedeli en büyük ve en küçük elemanı bulan program */
public class Q11 {

    public static void biggestNumber(List<Integer> list){
        if(!list.isEmpty()){
            int biggest = list.get(0);

            for(int i=0; i<list.size();i++){
                if(list.get(i) > biggest){
                    biggest = list.get(i);
                }
            }
            System.out.println("Biggest num: "+biggest);
        }else {
            System.out.println("List is empty");
        }
    }

    public static void smallestNumber(List<Integer> list){
        if(!list.isEmpty()) {
            int smallest = list.get(0);
            for(int i=0;i<list.size();i++){
                if(smallest > list.get(i)){
                    smallest = list.get(i);
                }
            }
            System.out.println("Smallest num: "+ smallest);
        }
    }

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        biggestNumber(list);
        smallestNumber(list);
    }
}
