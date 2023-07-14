import java.util.*;
import java.util.Scanner; //import scanner
// Rebeka Nyambati
// PA 8
public class Minimum
{

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        //scan user input for array size
        System.out.println("Enter size of array:");
    int size = scnr.nextInt();
    int [] array = new int[size];
    System.out.println("Enter the array elements one at a time");
    for(int i = 0; i < size; i++)  
    {  
    //scanning array elements from the user   
    array[i]=scnr.nextInt();  
    }  
    System.out.println("The array contains the following integers: ");   
    // print array elements 
    for (int i = 0; i < size; i++)   
    {  
    System.out.print(array[i] + " ");  
    }  
    //print smallest value
    System.out.println("\nThe smallest value in the array is: " + Math.min(array[size-1], minimum(array, size - 1)));
    }
    public static long minimum(int array[], int size) //create recursive class
    {
        if (size == 1) //base call
        {
         return array[0];
        }
        else { //Math.min to find minimum value
            return Math.min(array[size-1], minimum(array, size - 1)); //recursive call
        

    }
    }  
    }  
