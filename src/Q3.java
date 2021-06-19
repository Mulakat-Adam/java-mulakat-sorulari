import java.util.*;

/* listedeki benzer elemanları bul */
class Q3 {

    public static void duplicatechecker(List<Integer> list ){
        if(list!=null && !list.isEmpty()){

            Set<Integer> benzer = new HashSet<>();
            for(int i=0;i<list.size();i++){
                for(int j=i+1;j<list.size();j++){
                    if(list.get(i) == list.get(j)){
                        benzer.add(list.get(j));
                    }
                }
            }
            System.out.println("There are "+benzer.size()+" dublicate item: "+benzer);
        }
    }


    public static void main(String args[]) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(2);
        list.add(3);
        list.add(3);
        list.add(3);
        list.add(5);
        list.add(5);
        list.add(6);
        list.add(6);
        list.add(6);

        duplicatechecker(list);
    }
}
