//diamond pattern
public  class  pattern13{
    public static void diamond(int n){
        //1sthalf
        //outer
        for(int i=1; i<=n ; i++){
            //inner
            //spaces
            for(int j=1; j<=(n-i); j++){
                System.out.print(" ");
            }
            //stars
            for(int j=1; j<= (2*i)-1 ;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        // 2nd half
        //outer
        for(int i=n; i>=1 ; i--){
            //inner
            //spaces
            for(int j=1; j<=(n-i); j++){
                System.out.print(" ");
            }
            //stars
            for(int j=1; j<= (2*i)-1 ;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        diamond(5);
    }
}