/* parantezler için kontrol algoritması*/
public class Q21 {

    public static void bracketChecker(String str){
        if(str != null && !str.isEmpty()){
            while(str.contains("()") || str.contains("[]") || str.contains("{}") ){
                str = str.replace("()", "");
                str = str.replace("[]", "");
                str = str.replace("{}", "");
            }

            if(str.isEmpty()){
                System.out.println("Dogru dizilis");
            }else {
                System.out.println("Hatali dizilis");
            }
        }
    }

    public static void main(String[] args) {
        bracketChecker("{[]}");
        bracketChecker("[}");
    }
}
