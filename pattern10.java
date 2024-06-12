//butterfly pattern
public class pattern10{
    public static void butterfly(int n){
        //1st half
        for(int i=1; i<=n; i++){
           //inner
           //star
           for(int j=1;j<=i; j++){
            System.err.print("*");
           }
           //spaces
           for(int j=1; j<= (2*(n-i)); j++){
            System.err.print(" ");
           }
           //star
           for(int j=1; j<=i; j++){
            System.out.print("*");
           }
           System.err.println();
        }
        //2st half
        for(int i=n; i>=1; i--){
           //inner
           //star
           for(int j=1;j<=i; j++){
            System.err.print("*");
           }
           //spaces
           for(int j=1; j<= (2*(n-i)); j++){
            System.err.print(" ");
           }
           //star
           for(int j=1; j<=i; j++){
            System.out.print("*");
           }
           System.err.println();
    }
    }
    public static void main(String[] args) {
        butterfly(5);
    }
}
