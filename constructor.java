package java_practice_anudip;

import java.util.Scanner;

public class constructor
{
	int i=7;
	int j=5;
	constructor()
	{
		System.out.println("called constructor");
	}
	void add(int a,int b)
	{
		int c=a+b;
		System.out.println(c);;
	}
	
//	int add(int a,int b)                        	  {
//		  int c=a+b;
//		  System.out.println(c);
//		  return c;
//	  }
	
	public static void main(String[] args)
	{
		int x, y;
		Scanner sc=new Scanner(System.in);
		x=sc.nextInt();
		y=sc.nextInt();
		constructor co=new constructor();
		co.add(x,y);
		co.add(co.i, co.j);

	}

}
