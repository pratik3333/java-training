
// 4. WAP to create the class name as Student with a following methods 
// class Student
// { void setSubMarks(int s[])
//  { //here we need to store the array in instance variable 
//  }
//  void calculatePer()
//  { //here we need to call the aggregate of six subjects marks through the array and calculate its per 
// and store in instance variable.
//  } 
//  void checkGrades()
//  { //here we need to check grades means per>75 && per<=100 then student in distinction if per>60 
// && per<=75 then in first division if per>=50 && per<=60 then second division and if per>40 && 
// per<=50 then in third division and if per <40 then student failed 
//  }
// }
// public class StudentApp
// { public static void main(String x[])
//  { //create the object of scanner class
//  //declare the array with 6 six of type integer and store input values in array as subject marks
//  //create the object of Student class and call the setSubMarks() function and pass array in it
//  //then call calculatePer() student function
//  //then call checkGrades() function for checking the grading of students.
//  }
// }


import java.util.*;

class Student{
    private int s[];
    private int sum;
    double agg;

    void setMarks(int s[])
    {
        this.s=s;
    }

    void calculatePer()
    {
        
        
        for (int i = 0; i < s.length; i++) {
              sum =s[i] + sum;
        }
        agg = sum / 6;

    }

    void checkGrade(){

        if (agg>75 && agg<=100) {
            System.out.println("Distinction");
        }
        else if (agg>60 && agg<=75) {
            System.out.println("First Division");
        }
        else if (agg > 50 && agg <=60) {
            System.out.println("Second Division");
        }
        else if (agg>=40 && agg<=50) {
            System.out.println("Third Divison");
        }
        else
        {
            System.out.println("Failed");
        }
        
    }
}

public class StudentApp {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        Student std=new Student();

        int s[]=new int[6];
        System.out.println("Enter six subjects marks.");
        System.out.println("Note:- marks should not be higher than 100");

        for (int i = 0; i < s.length; i++) {
            
             s[i]=sc.nextInt();
        }

        std.setMarks(s);
        std.calculatePer();
        std.checkGrade();

    }
}
