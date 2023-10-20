public class Ques10
{ private static int num1 = 100;
private int num2 = 200;
public static void myMethod1()
{ num1 = 300;
num2 = 400;
System.out.println(num1 + "," + num2);
}
public static void myMethod2()
{
num1 = 300;
Ques10.num2 = 400;
}
public void myMethod3()
{
num1 = 300;
num2 = 400;
}
public void myMethod4()
{
Ques10.num1 = 300;
num2 = 400;
}
public static void main(String args[])
{
Ques10 q = new Ques10();
q.myMethod1();
}
}