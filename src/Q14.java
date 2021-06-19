import java.util.ArrayList;
import java.util.List;

/* listedeki kayıp elemani bul */
public class Q14 {

    public static void main(String[] args) {
        int expectedNumberOfList = 0;
        int expectedTotalNumberOfTheList = 0;
        int totalNumberOfList = 0;
        int missingNumber = 0;
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(4);
        list.add(5);

        expectedNumberOfList = list.size()+1;
        totalNumberOfList = 0;
        for(int i=0;i<list.size();i++){
            totalNumberOfList += list.get(i);
        }
        expectedTotalNumberOfTheList = (expectedNumberOfList * ((expectedNumberOfList + 1) / 2) );

        missingNumber = expectedTotalNumberOfTheList - totalNumberOfList;
        System.out.println(missingNumber);

    }

}
