/* triangle pattern */
public class Q19 {
    public static void oruntu(int n){

        int i,j,k;

        for(i=1; i<=n; i++){
            for(j=n-1; j>=i; j--){
                System.out.print(" ");
            }
            for(k=1; k<=i; k++){
                System.out.print(k+" ");
            }


            System.out.println(" ");
        }

    }


    public static void main(String[] args) {
        int n = 5;
        oruntu(n);
    }
}
