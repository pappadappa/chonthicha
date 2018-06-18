
/**
 * Write a description of class homework_8 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class homework_8
{    
    public homework_8()
    {
        int [] myArray = {1,2,3,4,5,6,7,8,9,10};
        int solution = 0;
        
        for(int i=0; i<myArray.length; i++){
            solution = solution +myArray[i];
        }
        
        System.out.println("myArray is {1,2,3,4,5,6,7,8,9,10}");
        System.out.print("sum of myArray is " +solution);
    }   
}
