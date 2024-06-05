 //patterns part 1 
// *
// **
// ***
// ****

public class pattern1{
    public static  void main(String args[]){
        for(int line = 1 ; line <=4; line++){
            for(int stars = 1; stars<=line ; stars++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}