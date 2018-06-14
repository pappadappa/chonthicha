
/**
 * Write a description of class homework_6 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class homework_6
{
    public homework_6()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("put your input (row): ");
        int input = sc.nextInt();
        
        for(int i=0;i<input;i++){

            if(i%2==0){
               System.out.println("**********");
           }
            else{
               System.out.println("__________"); 
           }
        }
        
    }
}
