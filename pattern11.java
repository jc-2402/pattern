//solid rhombus
public class pattern11{
    public static void solid_rhombus(int n){
        //outer
        for(int i=1; i<=n; i++){
            //inner
            //spaces
            for(int j=1; j<=(n-i); j++){
                System.out.print(" ");
            }
            //stars
            for(int j=1; j<=n; j++){
                System.out.print("*");
            }
            System.err.println();
        }
    }
    public static void main(String[] args) {
        solid_rhombus(5);
    }
}