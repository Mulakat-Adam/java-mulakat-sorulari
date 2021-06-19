/* java generic method ornekleri */
public class Q24 {

    public static <T extends Comparable<T>> T maximum(T x, T y, T z) {
        T max;

        if(x.compareTo(y) > 0 && x.compareTo(z) >0) {
            max = x;
        }
        else if(y.compareTo(x) > 0 && y.compareTo(z) >0) {
            max = y;
        }
        else{
            max = z;
        }
        return max;
    }


    public static void main(String args[]) {
        System.out.printf("Max of %d, %d and %d is %d\n\n",
                3, 4, 5, maximum( 3, 4, 5 ));

        System.out.printf("Max of %s, %s and %s is %s\n","pear",
                "apple", "orange", maximum("pear", "apple", "orange"));
    }
}

