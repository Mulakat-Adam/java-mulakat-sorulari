/* singleton design pattern*/
public class Q20 {

    private Q20(){
        System.out.println("Singleton olusturuldu.");
    }

    private static Q20 instance = null;

    public static Q20 getInstance(){
        if (instance == null){
            return new Q20();
        }else {
            return instance;
        }
    }

    public static void main(String[] args) {
        /* singleton class does not called by new */
        Q20 s1 = getInstance();
    }
}
