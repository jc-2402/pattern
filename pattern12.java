//hollow rhombus
public  class pattern12{
public static void hollow_rhombus(int n){
    //outer
    for(int i=1; i<=n; i++){
        //inner
        //spaces
        for(int j=1; j<=(n-i); j++){
            System.err.print(" ");
        }

        //hollow rectangle - stars
        for(int j=1; j<=n; j++){
            if( i==1 || i==n|| j==1 || j==n){
                System.err.print("*");
            }
            else{
                System.out.print(" ");
            }
        }
        System.err.println();
    }
}
public static void main(String[] args) {
    hollow_rhombus(5);
}
}