import java.util.*;

class Student
{
	int arr[],sum,i;
	float per;
	void setSubMarks(int a[])
	{
		arr=a;
	}
	void calculatePer()
	{
		for(i=0; i<arr.length; i++)
		{
			sum=sum+arr[i];
		}
		
		per=sum/arr.length;
		
	}
	void checkGrades()
	{
		if(per>75 && per<=100)
		{
			System.out.println("Distinction");
		}
		else if(per>60 && per<=75)
		{
			System.out.println("First Division");
		}
		else if(per>=50 && per<=60)
		{
			System.out.println("Second Division");
		}
		else if(per>40 && per<50)
		{
			System.out.println("Third Division");
		}
		else if(per<=40)
		{
			System.out.println("Student Failed");
		}
	}
}

public class StudentApp
{
	public static void main(String x[])
	{
		int i;
		Scanner sc = new Scanner(System.in);
		Student st = new Student();
		
		System.out.println("Enter How many subjects are there");
		int size=sc.nextInt();
		int a[]=new int [size];
		
		System.out.println("Enter Subject Marks");
		
		for(i=0; i<a.length; i++)
		{
			a[i]=sc.nextInt();
		}
		st.setSubMarks(a);
		st.calculatePer();
		st.checkGrades();
		
	}
}