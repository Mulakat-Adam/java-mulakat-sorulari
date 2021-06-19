
/* girilen bir kelimenin palidrome olup olmadıgını bul */
public class Q1 {

    public static Boolean palidromechecker(String kelime){
        String ters = "";
        if(kelime != null){
            for(int i=kelime.length()-1; i>=0 ;i--){
                ters += kelime.charAt(i);
            }
            if(kelime.equals(ters)){
                return true;
            }else {
                return false;
            }
        }else {
            System.out.println("Lütfen doğru cümle giriniz.");
            return false;
        }
    }

    public static void main(String[] args) {

        String kelime = "ana";

        if (palidromechecker(kelime)){
            System.out.println("Palidrome");
        }else {
            System.out.println("Değil");
        }
    }

}
