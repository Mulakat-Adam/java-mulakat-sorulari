/* singleton design pattern*/
class Q20 {  

  private static Q20 instance = null;

  private Q20(){}

  public static Q20 getInstance(){
    if(instance == null){
     System.out.println("Instance olusturuldu."); 
      instance = new Q20();
      return instance;
    }else{
           System.out.println("Instance daha once olusturulmus."); 
      return instance;
    }
  }

}
class Main{
  public static void main(String[] args){
    Object s1 = Q20.getInstance();
    Object s2 = Q20.getInstance();

  }
}
