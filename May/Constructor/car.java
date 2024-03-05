import java.util.*;

/**
 * Innercar
 */
 class Innercar {
    public Innercar()
    {
        System.out.println("In InnerCar");
    }
    public Innercar(int a)
    {
        System.out.println("in first Parameterise constructor");
    }

    
}

/**
 * Innercar_1
 */
class Innercar_1 extends Innercar {

    public Innercar_1()
{
    System.out.println("In InnerCar_1");
}

   public Innercar_1(int n)
   {
    super(n);
     System.out.print("in second parametersize constructor");
   }
    
}   

public class car {
    public static void main(String[] args) {
        Innercar_1 ic=new Innercar_1(10);

        
    }
    
}


// if we not pass there super() constructor then it will show the answer like this
// O/P:-In InnerCar
// in second parametersize constructor


//  and if we pass super() constructor then it will show the answer like this

O/P:-
// in first Parameterise constructor
// in second parametersize constructor