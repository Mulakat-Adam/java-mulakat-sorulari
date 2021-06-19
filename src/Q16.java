import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* hashset kullanarak bir listenin duplicate elemanlarını bul */
public class Q16 {

    public static void findDuplicate(List<String> list){

        HashSet<String> duplicate = new HashSet<>();
        HashSet<String> unique = new HashSet<>();

        if(!list.isEmpty()){
            for(int i=0; i<list.size();i++){
                if(!unique.add(list.get(i))){
                    duplicate.add(list.get(i));
                }
            }
        }
        System.out.println("Unique list: "+unique);
        System.out.println("Duplicate list: "+duplicate);
    }

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("4");

        findDuplicate(list);
    }

}
