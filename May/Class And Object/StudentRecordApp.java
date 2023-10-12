/*Example: Create class name as StudentRecord with two methods 
 void setStudent(Student  …s) : this method can accept infinite number of student objects.
void show(): this method can display student records.

You have to create POJO class name as Student with field id,name and marks 
Output
Name	Id	Marks
a	1	90
b	2	70
c	3	60
Number of students : 3 */


import java.util.Scanner;


class Student
{
	private int id;
	private int marks;
	private String name;
	
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
	
	public void setId(int id)
	{
		this.id=id;
	}
	public int getId()
	{
	    return id;	
	}
	
	public void setMarks(int marks)
	{
		this.marks=marks;
	}
	public int getMarks()
	{
		return marks;
	}
}

class StudentRecord
{
	private Student []student;
	
	public void setStudent(Student ...student)
	{
		this.student=student;
	}
	public void getStudent()
	{
		for(int i=0; i<student.length; i++)
		{
			if(student[i].getMarks()>35)
			{
				int id=student[i].getId();
			String name=student[i].getName();
			int marks=student[i].getMarks();
			
			System.out.printf("%d\t%s\t%d\n", id,name,marks);
			}
		}
	}
}

public class StudentRecordApp
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		Student []student=new Student[5];
		StudentRecord sr=new StudentRecord();
		
		for(int i=0; i<student.length; i++)
		{
			student[i]=new Student();
			System.out.println("Enter student name id and marks");
			
			String name=sc.nextLine();
			int id=sc.nextInt();
			int marks=sc.nextInt();
			sc.nextLine();
			
			student[i].setName(name);
			student[i].setId(id);
			student[i].setMarks(marks);
			
		}
		
		sr.setStudent(student);
		sr.getStudent();
	}
}