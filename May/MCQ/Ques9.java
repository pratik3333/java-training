public class Ques9
{ public void myMethod1()
{ int num1=100;
final int num2=200;
System.out.println("The value of first variable is " + num1);
System.out.println("The value of second variable is " + num2);
}
public void myMethod2()
{ int arr[] = new int[2];
System.out.println(arr.length);
}
public static void main(String args[]) {
new Ques9().myMethod1();
new Ques9().myMethod2();
}
}