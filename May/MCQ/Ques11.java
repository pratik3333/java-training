public class Ques11 {
public static void main(String args[])
{ Ques11 q = new Ques11();
q.method(30);
byte b = 3;
q.method(b);
}
public void method(Integer i) 
{ System.out.print("Integer value is: " + i + " ");
}
public void method(short s)
{ System.out.print("Short value is: " + s + " ");
}
public void method(byte t)
{ System.out.print("Byte value is: " + t + " ");
}
public void method(int num)
{ System.out.print("Int value is: " + num + " ");
}
}