import javax.swing.JOptionPane;

/**
 * ProbChall_4 asks the user to input 3 different exam scores with a dialog box.
 * the program will take the average of the three exams and give a letter grade.
 * if else statement was created to show message in the dialog box.
 * 
 * @author Jasmin Leonrodriguez, jleonrodriquez@student.sdccd.edu
 * @version v1.0
 * @since 3/2/2025
 */
public class ProbChall4
{
    public static void main (String[] args){
        //variables
        int exam1, exam2, exam3;
        double avg;
        char grade;
        String temp;
        
        temp = JOptionPane.showInputDialog("Enter Exam1 score: ");
        exam1 = Integer.parseInt(temp);
        temp = JOptionPane.showInputDialog("Enter Exam2 score: ");
        exam2 = Integer.parseInt(temp);
        temp = JOptionPane.showInputDialog("Enter Exam3 score: ");
        exam3 = Integer.parseInt(temp);
        
        avg = (double) (exam1+exam2+exam3)/3;
        
        if(avg>=90)
        grade='A';
        else if (avg>=80)
        grade='B';
        else if (avg>=70)
        grade='C';
        else if (avg>=60)
        grade='D';
        else
        grade='F';
        
        JOptionPane.showMessageDialog(null,String.format("With an average score of: %.1f\nYour grade is: %c",avg, grade));
    }////end main
}////end class
