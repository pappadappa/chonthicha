
/**
 * Write a description of class homework_9 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class homework_9
{    
    public homework_9()
    {
        int [] arr = {1,2,3,4,5,6,7,8,9,10};
<<<<<<< HEAD
        int max = 0;
=======
        int max = 1;
>>>>>>> ac63dbd663b9154109b497d57e2ae9f6e933dc65
        for(int i=0; i<arr.length; i++){           
            if (max<arr[i]){
                max = arr[i];
            }  
        }
        System.out.print("Maximum of arr is " +max);
    }
}
