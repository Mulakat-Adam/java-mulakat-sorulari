/* 1'den' 100'e fibonaci serisi */
public class Q10 {

    public static void fibonacciSeries(int n){
        int a = 0;
        int b = 1;
        int c = 0;

        while (c<100){
            c = a + b;
            System.out.println(c);
            a = b;
            b = c;
        }
    }

    public static void main(String[] args) {
        fibonacciSeries(50);
    }

}
