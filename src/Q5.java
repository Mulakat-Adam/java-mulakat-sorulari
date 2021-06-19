import java.util.Scanner;

/* Kullanicidan alinan 4 basamakli sayiyi yaziya ceviren program */
public class Q5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sayi;
        int br,on,yz,bn;
        System.out.println("4 basamakli bir sayi giriniz:\n");
        sayi = sc.nextInt();
        char c;

        c = Integer.toString(sayi).charAt(0);
        bn = Integer.parseInt(Character.toString(c));

        c = Integer.toString(sayi).charAt(1);
        yz = Integer.parseInt(Character.toString(c));

        c = Integer.toString(sayi).charAt(2);
        on = Integer.parseInt(Character.toString(c));

        c = Integer.toString(sayi).charAt(3);
        br = Integer.parseInt(Character.toString(c));

        String[] binler = {"","bin","ikibin","üçbin","dörtbin","beþbin","altýbin","yedibin","sekizbin","dokuzbin"};

        String[] yuzler = {"","yüz","ikiyüz","üçyüz","dörtyüz","beþyüz","altýyüz","yediyüz","sekizyüz","dokuzyüz"};

        String[] onlar = {"","on","yirmi","otuz","kýrk","elli","altmýþ","yetmiþ","seksen","doksan"};

        String[] birler = {"","bir","iki","üç","dört","beþ","altý","yedi","sekiz","dokuz"};

        System.out.println("Girilen sayi: "+binler[bn] +" "+ yuzler[yz] +" "+  onlar[on] +" "+  birler[br]);

    }
}
