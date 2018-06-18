
/**
 * Write pyramid *.
 *
 * @author (Chonthicha Pinkaraket)
 * @version (15 June 2018)
 */
import java.util.Scanner;
public class homework_7
{
    
    public homework_7()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("put your input (row): ");
        int input =sc.nextInt();
        
        for(int i=1; i<=input; i++){        //จำนวนแถว
            
            int a = input - i;  //จำนวนช่องว่าง          
           
            for(int j=0; j<a; j++){
                System.out.print(" ");
            }
            
            int b = i -1;   //จำนวน *
            
            for(int k=0; k<b; k++){
                System.out.print("*");
            }
            
            System.out.print("*");  // * ตรงกลาง
            
            for(int k=0; k<b; k++){
                System.out.print("*");
            }
            
            
            System.out.println("");
            
      
        }
        
    }
}
