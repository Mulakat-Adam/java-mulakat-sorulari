import java.util.HashMap;
import java.util.Map;

/* hashMap iterasyonu uzerinden yasi en buyuk ve en kucuk olan kisinin ismini ekrana basan program */
public class Q26 {

    public static void enBuyukKisiyiBul(HashMap<String, Integer> kisiler) {
        String enBuyukKisi = "";
        String enKucukKisi = "";
        int enBuyukYas = 0;
        int enKucukYas = 200;

        for (Map.Entry<String, Integer> entry : kisiler.entrySet()) {
            if (entry.getValue() > enBuyukYas) {
                enBuyukYas = entry.getValue();
                enBuyukKisi = entry.getKey();
            }
        }

        for (Map.Entry<String, Integer> entry : kisiler.entrySet()) {
            if (entry.getValue() < enKucukYas) {
                enKucukYas = entry.getValue();
                enKucukKisi = entry.getKey();
            }
        }

        System.out.println("En buyuk kisi: "+enBuyukKisi);
        System.out.println("En kucuk kisi: "+enKucukKisi);
    }

    public static void main(String[] args) {

        HashMap<String, Integer> kisiler = new HashMap<String, Integer>();
        //İsim - Yas
        kisiler.put("Ahmet", 32);
        kisiler.put("Ayşe", 30);
        kisiler.put("Can", 33);
        kisiler.put("Umut", 11);

        enBuyukKisiyiBul(kisiler);
    }
}
