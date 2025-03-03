import java.util.Scanner;

/**
 * ProbChall_1 asks user for a number between 1 and 3
 * and convert it to a roman numeral
 * progam will use a scanner keyboard for input
 * then will use a swith statement with breaks to 
 * prevent bleed through
 * Default statement will be use for incorrect values
 *  
 * 
 * @author Jasmin Leonrodriguez, jleonrodriquez@student.sdccd.edu
 * @version v1.0
 * @since 3/2/2025
 */
public class ProbChall1 {
    public static void main (String[] args){
        //variables
        int input;

        Scanner keyboard = new Scanner (System.in);
        System.out.print ("Enter a number between 1 and 3 to convert to Roman Numeral: ");
        input = keyboard.nextInt();

        switch(input){
            case 1:
                System.out.println("1 converted is I");
                break;
            case 2:
                System.out.println("2 converted is II");
                break;
            case 3:
                System.out.println("3 converted is III");
                break;
            default:
                System.out.println(input + " was not a valid number.\nPlease enter a number between 1 and 3.");
        }
    }
}
