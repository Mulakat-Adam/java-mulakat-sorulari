
/* girilen bir cumlenın kelimelerini ters sırala */
public class Q2 {

    public static void cumleyiTersCevir(String cumle){
        String ters = "";

        if(cumle !=null && cumle.length()>1) {
            String dizi[] = cumle.split(" ");
            for (int i = dizi.length - 1; i >= 0; i--) {
                ters += dizi[i] + " ";
            }
        }
        System.out.println("Girilen cumle: "+cumle);
        System.out.println("Ters cumle "+ters);
    }

    public static void main(String[] args) {
        cumleyiTersCevir("Merhaba dunya benim adım Mutlu");
    }

}
