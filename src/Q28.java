import java.util.*;

/* 
	bir tane array list olacak, bu listenin boyutu cift ise
	liste 2 listeye bolunecek. iki yeni listenin toplamı ayrı ayrı hesaplanıp ekrana basılacak.
	tek ise dogrudan toplamı hesaplanacak 
*/

public class Q28 {
	
	  public static void yarimList(List<Integer> list){
		if(list!=null && !list.isEmpty()){
		  if(list.size() % 2 == 0){
			int halfOfList = list.size()/2;
			int firstListSum = 0;
			int secondListSum = 0;
			List<Integer> l1 = list.subList(0,halfOfList);
			List<Integer> l2 = list.subList(halfOfList,list.size());

			System.out.println(l1);
			System.out.println(l2);

			for(Integer i : l1){
			  firstListSum += i;
			}
			for(Integer i : l2){
			  secondListSum += i;
			}        

			System.out.println(firstListSum);
			System.out.println(secondListSum);
			
		  }else{
			int sum = 0;
			for(Integer i : list){
			  sum += i;
			}
			System.out.println(sum);
		  }
		}
	  }	
	
    public static void main(String[ ] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		yarimList(list);
    }
}
