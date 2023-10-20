class Ques3
{
    final static void main(String args[]) 
	{
          int x = 201;
          myMethod(x++);
         System.out.println(x);
    }
     static void myMethod(int x)
     {  x %= 10;
        System.out.println(x);
     } 
}