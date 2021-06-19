/* girilen bir cumleyi testen, ters sıralı kelime , kelime sayisini, harf sayisini bulan program */
public class Q17 {

    public static void ters(String cumle){
        String ters = "";
        String tersSirali = "";
        String[] arr =null;
        int harfSayisi = 0;
        int kelimeSayisi = 0;

        if(cumle != null && !cumle.isEmpty()){
            arr = cumle.split(" ");

            for(int i=cumle.length()-1;i>=0;i--){
                ters += cumle.charAt(i);
            }

            for(int i=arr.length-1;i>=0;i--){
                tersSirali += arr[i] + " ";
            }

            for(int i=0;i<cumle.length();i++){
                if(cumle.charAt(i) != ' '){
                    harfSayisi++;
                }
            }

            kelimeSayisi = arr.length;

            System.out.println("Ters Cumle: "+ters);
            System.out.println("Ters Sıralı Cumle: "+tersSirali);
            System.out.println("Kelime Sayisi: "+kelimeSayisi);
            System.out.println("Harf Sayisi: "+harfSayisi);
        }

    }

    public static void main(String[] args) {
        ters("merhaba dunya ben mutlu");
    }
}
