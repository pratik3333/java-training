
// 6. create the class name as ConvertToUpper with a following methods
// class ConvertToUpper
// { char c[];
//  void setCharArray(char ch[])
//  { //here accept the character array and store in instance variable in character array
//  c=ch;
//  }
//  void convertToUpperCase()
//  { //here we need to write the manual logics for converting lower case array
// //to upper case
//  }
// }
// public class ConvertToUpperApp
// {
//  public static void main(String x[])
//  { //here declare the fix array with a some character e.g char ch[]=new char[]={"good"};
//  //here create the object of ConvertToUpper class 
//  //call setCharArray() function and pass ch array in setCharArray() function
//  //call convertToUpperCase() function and see the result
//  }
// }

import java.util.*;

/**
 * InnerConvertToUpperCase
 */
 class UpperCase {

    char ch[];
    void setCharArray(char ch[])
    {
        this.ch=ch;
    }

    void convertUpper(){

        for (int i = 0; i < ch.length; i++) {
            
            if ( ch[i]>=97 && ch[i]<=122) {
                ch[i] = (char)((int)ch[i] - 32);
            }
        }

        for (int i = 0; i < ch.length; i++) {
            System.out.print(ch[i]);
        }
    }
    
}

public class ConvertToUpperCase {
    public static void main(String[] args ) {
        
        UpperCase up=new UpperCase();

        String str="good";  //here we take string

        char ch[]=str.toCharArray(); //and here we do type casting we converted string into character

        up.setCharArray(ch);
        up.convertUpper();
    }
}
