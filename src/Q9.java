import java.util.*;

/* verilen 2 oyuncu listesinden rastgele 2 takim olusturan program */
public class Q9 {
    public static void main(String args[]) {

        Set<Integer> indexes = new HashSet<Integer>();
        Set<Integer> indexes2 = new HashSet<Integer>();

        List groupOfPlayers1= new ArrayList();
        List groupOfPlayers2= new ArrayList();

        List<String> teamHome1= new ArrayList();
        List<String> teamHome2= new ArrayList();
        List<String> teamHome = new ArrayList();
        List<String> teamAway1= new ArrayList();
        List<String> teamAway2= new ArrayList();
        List<String> teamAway = new ArrayList();

        groupOfPlayers1.add("a1");
        groupOfPlayers1.add("a2");
        groupOfPlayers1.add("a3");
        groupOfPlayers1.add("a4");
        groupOfPlayers1.add("a5");
        groupOfPlayers1.add("a6");
        groupOfPlayers1.add("a7");

        groupOfPlayers2.add("b1");
        groupOfPlayers2.add("b2");
        groupOfPlayers2.add("b3");
        groupOfPlayers2.add("b4");
        groupOfPlayers2.add("b5");
        groupOfPlayers2.add("b6");
        groupOfPlayers2.add("b7");

        Random random = new Random();
        int randomindex=random.nextInt(groupOfPlayers1.size());

        while(true){
            randomindex=random.nextInt(groupOfPlayers1.size());
            if (randomindex != 0 ){
                break;

            }
        }

        while(indexes.size() < randomindex){
            indexes.add(random.nextInt(groupOfPlayers1.size()));

        }

        for (int i : indexes){

            teamHome1.add((String) groupOfPlayers1.get(i));
        }

        while(indexes2.size() < groupOfPlayers1.size() - teamHome1.size()){
            indexes2.add(random.nextInt(groupOfPlayers1.size()));
        }


        for(int i : indexes2){

            teamHome2.add((String) groupOfPlayers2.get(i));

        }

        teamHome.addAll(teamHome1);
        teamHome.addAll(teamHome2);

        for(Object i : groupOfPlayers1){
            if(!teamHome1.contains(i)){
                teamAway1.add((String) i);
            }
        }
        for(Object i : groupOfPlayers2){
            if(!teamHome2.contains(i)){
                teamAway2.add((String) i);
            }
        }

        teamAway.addAll(teamAway1);
        teamAway.addAll(teamAway2);

        System.out.println(teamHome);
        System.out.println(teamAway);

    }
}
