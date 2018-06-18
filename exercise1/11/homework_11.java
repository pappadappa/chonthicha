
/**
 * Find average for array.
 *
 * @author (Chonthicha Pinkaraket)
 * @version (18 June 2018)
 */
public class homework_11
{
    public homework_11()
    {
        int [] arr = {1,2,3,4,5,6,7,8,9,10};
        int sum = 0;
        for(int i=0; i<arr.length; i++){
            sum = sum +arr[i];
        }
        
        int solution1 = sum/arr.length;
        int solution2 = sum%arr.length;
        
        System.out.println("myArray is {1,2,3,4,5,6,7,8,9,10}");
        System.out.print("Average of myArray is " +solution1+ "." +solution2);
    }
}
