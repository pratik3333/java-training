public class Ques12
{
public static void main(String args[])
{
Ques12 q = new Ques12();
q.myMethod (10,20);
q.myMethod (new char[]{});
q.myMethod (new int[]{10,20});
}
void myMethod (short s1, short s2)
{
System.out.println ("short");
}
void myMethod (int i1, int i2)
{ System.out.println ("int");
}
void myMethod (int ...args)
{
System.out.println ("intargs");
}
}