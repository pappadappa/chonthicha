
/**
 * Write JAVA to run * and - version 2.
 *
 * @author (Chonthicha Pinkaraket: Pang)
 * @version (12 June 2018)
 */
import java.util.Scanner;
public class homework_3
{
    
    public homework_3()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("put your input: ");
        int input = sc.nextInt(); 
        
        System.out.println("3");
        
        for(int i=0; i<input/3; i++){
            System.out.print("**-");             
        }
    }

}
