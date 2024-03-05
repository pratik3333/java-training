import java.util.*;

/**
 * Innercar
 */
 class Innercar {
    public Innercar()
    {
        System.out.println("In InnerCar");
    }
    
}

/**
 * Innercar_1
 */
class Innercar_1 extends Innercar {

     Innercar_1()
{
    System.out.println("In InnerCar_1");
}

    Innercar_1(int n)
   {
     System.out.print("parametersize constructor");
   }
    
}   

public class car {
    public static void main(String[] args) {
        Innercar_1 ic=new Innercar_1();

        
    }
    
}
