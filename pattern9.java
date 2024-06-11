//0-1 triangle
public class pattern9{
    public static void zero_1_triangle(int n){
        for(int i=1; i<=n ;i++){
            for(int j=1; j<=i; j++){
                if((i+j)%2==0){
                    System.err.print("1");
                }
                else{
                    System.err.print("0");
                }
            }
            System.err.println();
        }
    }
    public static void main(String[] args) {
        zero_1_triangle(5);
    }
}