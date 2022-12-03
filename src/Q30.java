import java.util.*;

/* 
  listeyi sirala, listeyi 1 den oranca elemana ve ortanca elemandan sonuna kadar olacak sekilde 2 listeye bol
  iki listenin de en buyuk elemanlarının toplamını ekrana bas
*/

public class Q30 {
	
	  public static void toplam(List<Integer> list){
		if(list!=null && !list.isEmpty()){
		  Collections.sort(list);
		  List<Integer> one = list.subList(0,list.size()/2);
		  List<Integer> two = list.subList(list.size()/2,list.size());
		  System.out.println(one); 
		  System.out.println(two); 

		  System.out.println(one.get(one.size()-1));
		  System.out.println(two.get(two.size()-1));

		  System.out.println(one.get(one.size()-1) + two.get(two.size()-1));
		  
		}
	  }
	
    public static void main(String[ ] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		toplam(list);
    }
}
