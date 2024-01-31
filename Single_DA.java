package java_practice_anudip;
import java.util.Scanner;
public class Single_DA {

	public static void main(String[] args) {
		 {     
			  //single dimenstional array solve by 3 ways	
		      //int marks[]= {30,23,40,45,10};
		      
		      /*
		      //first way define value accept and use for loop
		      for(int i=0;i<5;i++)
		      {
		    	  System.out.println(marks[i]);
		      }
		      */
			 /* 
			  //second way define value accept and use for each loop
		      System.out.println("Enhanced for");
		      for(int x:marks)
		      {
		    	  System.out.println(x);
		      }
		      */
			  //third way accept the user value and use for each loop
			  int score[]=new int[5];
		      Scanner sc=new Scanner(System.in);
		      for(int i=0;i<5;i++)
		      {
		    	  System.out.println("Enter position "+(i+1)+" value");
		    	  score[i]=sc.nextInt();
		      }
		      for(int i=0;i<5;i++)
		      {
		    	  System.out.println(score[i]);
		      }
//		      for(int x: score)
//		      {
//		    	  System.out.println(x);
//		      }
			}

		}

	}


