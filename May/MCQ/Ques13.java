public class Ques13
{ public static void main(String args[])
{
System.out.println(myMethod(myMethod(new int[] {10,20}),myMethod(10,20)));
}
static int myMethod(int num1, int num2)
{ return 10;
}
static int myMethod(int... args)
{ return 20;
}
}
