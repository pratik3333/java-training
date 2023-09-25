// WAP to input the name ,id and percentage of student and display it.

import java.util.*;

public class StudRecordApp {
    public static void main(String x[]) {
        Scanner xyz = new Scanner(System.in);
        System.out.println("Enter the student name");

        String name = xyz.nextLine();
        System.out.println("Enter the student id");
        int id = xyz.nextInt();
        System.out.println("Enter the student percentage");
        float per = xyz.nextFloat();
        System.out.printf("Student name is %s\n", name);
        System.out.printf("Student id is %d\n", id);
        System.out.printf("Student percentage is %f\n", per);
    }
}