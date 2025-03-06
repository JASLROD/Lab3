import java.util.Scanner;

/**
 * Program  will ask user for 3 numbers
 * with keyboard scanner. 
 * will use an if else statement to sort smallest to largest.
 * 
 * 
 * @author Jasmin Leonrodriguez, jleonrodriquez@student.sdccd.edu
 * @version v1.0
 * @since 3/2/2025
 */

public class Sorting
{
    public static void main (String[] args){
        int  n1, n2, n3;
        int low, med, high;

        //Create a Scanner object
        Scanner keyboard = new Scanner (System.in);

        System.out.print (" Enter 1st number ");
        n1 = keyboard.nextInt();
        System.out.print (" Enter 2nd number ");
        n2 = keyboard.nextInt();
        System.out.print (" Enter 3rd number ");
        n3 = keyboard.nextInt();

        //create an input message and use Scanner object collect 3 numbers to be sorted
        ////Look for when n1 is smallest section
        if ((n1<= n2) && (n1<= n3)){ 
            low = n1;
            if (n2 <= n3){
                med = n2;
                high = n3;}

            else{
                med = n3;
                high = n2;
            }
        }
        //if true n2 is ?, n3 is ?
        //else n2 is ?, n3 is ?

        ////Above n1 is smallest, now we need to figure out when n2 is smallest section
        else if (n2<=n3) { 
            low = n2;
            if (n1>=n3){
                high = n1;
                med = n3;
            }
            else { 
                med = n1;
                high = n3;
            } 

        }

        else { 
            low = n3;
            if ( n1 <= n2){ 
                high = n2;
                med = n1;}
            else {
                high = n1;
                med = n2;
            }

        }
        System.out.println("The inputs sorted smallest to largest are: "+ low + " " + med + " " + high);

    }////end main
}////end class
