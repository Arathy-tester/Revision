package javarevision;

import java.util.Scanner;

public class Sample_bio {
	public void bio() {
		System.out.println("Name:" + "ARATHY");
		System.out.println("Age:" + 38);
		System.out.println("DOB:" + "19/05/1987");

	}
	
	public void add(String[] args) {
		//String[] args= null;
		int a= Integer.parseInt(args[0]);
		int b= Integer.parseInt(args[1]);
		//String s=args[3];
		int c= a+b;
		System.out.println(c);
	}
	public void addscan()
	{
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter first number: ");
	        int a = sc.nextInt();

	        System.out.print("Enter second number: ");
	        int b = sc.nextInt();

	        int c = a + b;
	        System.out.println("Sum: " + c);

	        sc.close();
	    }

	
	public void grade() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the marks ");
        int marks = sc.nextInt();
		if(marks<40)
		{
			System.out.println("FAILED");
		}
		else if(marks>40 && marks<60) 
		{
			System.out.println("SECOND CLASS");
		}
		else if(marks>60 && marks<80)
		{
			System.out.println("FIRST CLASS");
		}
		else
		{
			System.out.println("DISTINCTION");
		}
		sc.close();
	}
	public void multidimension()
	{
		int a[][]= {{1,2,3},{4,5,6},{7,8,9}};
		int b[][]= {{1,2,3},{4,5,6},{7,8,9}};
		int c[][]= {{0,0,0},{0,0,0},{0,0,0}};
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				c[i][j]=a[i][j]+b[i][j];
				System.out.print(c[i][j]+" ");
			}
				System.out.println( );
		}
		
	}
	
	public static void overload(float a, int b)
	{
		float c= a + b;
		System.out.println(c);
	}
	public static void overload3(float a, int b, int c)
	{
		float d= a + b +c;
		System.out.println(d);
	}
	
	public static void main(String[] args) {
		Sample_bio sample_bio = new Sample_bio();
		sample_bio.bio();
		//sample_bio.add(args);
		//sample_bio.addscan();
		//sample_bio.grade();
		//sample_bio.multidimension();
		//sample_bio.overload(5.6f, 10);
		sample_bio.overload3(35.5f, 10, 20);
	}

}

