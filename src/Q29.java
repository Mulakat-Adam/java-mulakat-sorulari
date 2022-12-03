import java.util.*;

/* 
	bir listeye rastgele int elemanlar eklenecek.
	bu listedeki ikinci en buyuk ve ikinci en kucuk elemanları bul
*/

public class Q29 {
	
	  public static void ikinciBuyuk(List<Integer> list){
		if(list!=null && !list.isEmpty()){
		  System.out.println(list);
		  //elemanları buyukten kucuge sirala, karisik gelebilir
		  Collections.sort(list);
		  System.out.println(list);
		  //benzer eleman olmamasi icin bir adet hashsete ekle
		  HashSet<Integer> set = new HashSet<Integer>();
		  for(Integer i : list){
			set.add(i);
		  }
		  System.out.println(set);
		  //HashSette get özelliği olmadığı için seti arraya ceviriyoruz
			Integer[] arr = set.toArray(new Integer[set.size()]);  
		  System.out.println(arr[set.size()-2]);
		}
	  }	
	
    public static void main(String[ ] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(11);
		list.add(12);
		list.add(111);
		ikinciBuyuk(list);
    }
}
