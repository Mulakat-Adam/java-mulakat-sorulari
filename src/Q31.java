
/* 
	parametre olarak bir email ornegın mulakat.adam@mail.com olsun,
	buradan adı ve soyadı parse edip "merhaba mulakat adam" yazdırın
*/

public class Q31 {
	
	  public static void nameFromMail(String mail){
		if(mail != null && !mail.isEmpty() && mail.contains("@") && mail.contains(".")){
		  String[] arr = mail.split("@");
		  String fullname = arr[0];

		  String[] name = fullname.split("\\.");
		  System.out.println("Hello "+name[0]+" "+name[1]); 
		}
	  }
	
    public static void main(String[ ] args) {
		nameFromMail("mulakat.adam@mail.com");
    }
}
