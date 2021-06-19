/* girilen bir cumledeki sesli, sessiz harfleri ve kelime sayisini bulan program */
public class Q6 {

    public static void sesliHarfleriBul(String cumle){

        if(cumle == null){
            System.out.println("Cumle bos olamaz!");
            return;
        }

        int sesli = 0;
        int sayi = 0;

        for(int i = 0;i<cumle.length();i++)
        {
            char c = cumle.charAt(i);

            if(c == 'a' || c == 'e' || c == 'ı' || c == 'i' || c == 'o' || c == 'ö' || c == 'u' || c == 'ü' )
            {
                sesli ++;
            }
        }

        for(int i = 0;i<cumle.length();i++)
        {
            if(cumle != null){
                if(cumle.charAt(i) == ' ')
                    sayi++;
            }

        }

        System.out.println("Girilen cumle:" + cumle);
        System.out.println("Cumledeki kelime sayisi:" + (sayi+1));
        System.out.println("Sesli harf sayisi:" + sesli);
        System.out.println("Sessiz harf sayisi:" + (cumle.length() - sesli));
    }

    public static void main(String[] args) {
        String cumle = "Merhaba Dünya";

        sesliHarfleriBul(cumle);
    }

}