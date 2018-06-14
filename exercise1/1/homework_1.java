
/**
 * Write JAVA to run *.
 *
 * @author (Chonthicha Pinkaraket: Pang)
 * @version (12 June 2018)
 */
import java.util.Scanner;
public class homework_1
{
    public homework_1()
    {      
        Scanner sc = new Scanner(System.in);
        System.out.print("put your input (column): ");
        int input = sc.nextInt(); 
        
        System.out.println("1");
        
        for(int i=0; i<input; i++){
            System.out.print("*");             
        }
    }    
}
