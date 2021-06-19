import java.util.ArrayList;
import java.util.List;

/* verilen iki listeyi combinleyen program */
public class Q7 {

    public static List<String> combineTwoList(List<String> list1, List<String> list2){

        List<String> combinelist = new ArrayList<>();
        if (!list1.isEmpty() && !list2.isEmpty()){

            for(int i=0;i<list1.size();i++){
                combinelist.add(list1.get(i));
                combinelist.add(list2.get(i));
            }
            return combinelist;
        }else{
            return null;
        }
    }

    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        list1.add("1");
        list1.add("2");
        list1.add("3");
        list2.add("a");
        list2.add("b");
        list2.add("c");

        List<String> combineList = combineTwoList(list1, list2);
        System.out.println(combineList);
    }

}
