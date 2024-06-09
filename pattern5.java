//advance patterns
//hollow rectangle
public class pattern5{
    public static void hollowrect(int row, int col){
        for(int i = 1 ; i<=row  ; i++){
            for(int j =1 ; j<=col; j++){
                if(i==1 || j==1 || i==row || j==col){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.err.println();
        }
    }
    public static void main(String args[]){
        hollowrect(4,5);
    }
}
