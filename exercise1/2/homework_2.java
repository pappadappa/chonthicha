
/**
 * Write JAVA to run * and - ,.
 *
 * @author (Chonthicha Pinkaraket: Pang)
 * @version (12 June 2018)
 */
import java.util.Scanner;
public class homework_2
{
    public homework_2(){
        Scanner sc = new Scanner(System.in);
        System.out.print("put your input (column): ");
        int input = sc.nextInt(); 
        
        System.out.println("2");
        
        for(int i=0; i<input/2; i++){
            System.out.print("*-"); 
        
        }
        
    }
}
