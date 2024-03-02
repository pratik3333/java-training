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
