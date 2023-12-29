package firstproject;

import java.util.Scanner;

/**
 *
 * @author ozzgu
 */
public class FirstProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a,b,c;
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Please enter of A value: ");
        a = scan.nextInt();
        
        System.out.println("Please enter of B value: ");
        b = scan.nextInt();
        
        System.out.println("Please Enter of C value: ");
        c = scan.nextInt();
        
        if(a==b || a==c || b==c){
            System.out.println("Please enter the another numbers.");
        }
        else{
            if (a>b && a>c) {
                if (b>c) {
                    System.out.println("The order is: "+ a + " > "+ b + ">" + c);
                }
                else{
                    System.out.println("The order is: "+ a + " > " + c + " > " + b);
                }
            }
            else if(b>a && b>c){
                if (a>c) {
                    System.out.println("The order is: "+ b + " > "+ a + " > "+ c);
                }else{
                    System.out.println("The order is: "+ b + " > "+ c + " > "+ a);
                }
            }
            else{
                if(a>b){
                    System.out.println("The order is: "+ c + " > "+ a + " > "+ b);
                }else{
                    System.out.println("The order is:"+ c + " > "+ b + " > "+ a); 
                }
            }
        }
    }
    
}
