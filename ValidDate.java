import java.util.Scanner;

/**
 * Program Description
 * 1) Fill in steps
 * 
 * @author Jasmin Leonrodriguez, jleonrodriquez@student.sdccd.edu
 * @version v1.0
 * @since 3/2/2025
 */

public class ValidDate{ 
    public static void main (String[] args){
        int month, day, year;
        String temp, output="";
        boolean isValid = false;

        // create input section, what they use to type in 
        Scanner keyboard = new Scanner(System.in);
        keyboard.useDelimiter("/");

        //use Scanner object to assign day   
        //create a blank output, output = "";
        System.out.print("Enter date in mm/dd/yyyy format: ");
        month = keyboard.nextInt();
        day = keyboard.nextInt();
        temp = keyboard.nextLine().substring(1);  
        year = Integer.parseInt(temp);

        //boolean
        if (day < 1)
            output = " Can never have less than 1 day in a month.";
        else if (day > 31)
            output = " Can never have more than 31 days in a month.";
        ///Section 3, btw 1 and 31 days, can use a switch that evaluates months with intentional bleed through
        else{  
            switch(month){
                    ////Cases for all 31 day months
                case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                    isValid = true;
                    break;
                    ////Cases for all 30 day months
                case 4: case 6: case 9: case 11:
                    if(day <=30)
                        isValid = true;
                    else
                        output = " Can not have 31 days for this month.";
                    break;
                    ////This is February
                case 2: 
                    boolean isLeapYear = false;
                    if(year%400==0 || (year%4==0&&!(year%100==0)))  ////Carefully look at || and && combo
                        isLeapYear = true;
                    if (isLeapYear){ ////use isLeapYear flag
                        if(day <=29) //Update X
                            isValid = true;
                        else
                            output = " Can not have 30 or more days in a leap year.";
                    }
                    else{  ////non-leap year
                        if(day <=28)
                            isValid = true;
                        else
                            output = " Can not have 29 or more days in a non-leap year.";
                    }
                    break; //prevent bleed through
                    ////end case 2:

                default:
                    output = " Months must be btw 1 and 12.";
            }////End of switch
        }////End of else section for multibranch if-else if

        //// Output section using isValid flag
        if (isValid) ////if isValid is true statement below will run
            System.out.println(month + "/" + day + "/" + year + " is a valid date.");
        else
            System.out.println(month + "/" + day + "/" + year + " is not a valid date." + output);
    }////end main
}////end class