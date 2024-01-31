package java_practice_anudip;
import java.util.Scanner;
public class schoolSystem 
{

	public static void main(String[] args)
	{
				int age ;
				Scanner sc= new Scanner(System.in);
				System.out.println("Enter your age:");
				age=sc.nextInt();
				if((age >=6)&&(age<=16))
				{
					System.out.println("School Adimission allowed");
				}
				else if((age>16)&&(age<=18))
				{
					System.out.println("Jr.Collage Admission  allowed");
				}
				else if((age>18)&&(age<=21))
				{
					System.out.println("Graduation Collage Admission  allowed");
				}
				else if((age>21)&&(age<=24))
				{
					System.out.println("masters Collage Admission  allowed");
				}
				else
				{
					System.out.println("Admission not allowed");
				}
	}
}


