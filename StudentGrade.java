//Task 2 : STUDENT GRADE CALCULATOR .
import java.util.Scanner;

public class StudentGrade
{
    public static void main(String[] args)
    {
		Scanner scanner= new Scanner(System.in);

        int count, i;
        float totalMarks = 0, avg;

        System.out.println("Enter Number of Subject");
        count = scanner.nextInt();

        System.out.println("Enter Marks of " + count + " Subject out of 100 -");
        for (i = 0; i < count; i++)
        {
			System.out.print("\nEnter Marks of Subject "+(i+1)+" : ");
			int marks = scanner.nextInt();
            totalMarks = totalMarks + marks;
        }

        System.out.println("\nTotal Marks : " + totalMarks);

        avg = (int)totalMarks/count;

        System.out.print("\nThe student Grade is: ");
		if(avg>=80)
		{
			System.out.println("A");
		}
	    else if(avg>=60 && avg<80)
	    {
			System.out.println("B");
	    }
	    else if(avg>=40 && avg<60)
	    {
	        System.out.println("C");
	    }
	    else
        {
            System.out.println("D");
        }
    }
}