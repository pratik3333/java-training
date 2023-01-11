class Sum{
    int a[]=new int[]{10,20,30,40,50};
    int [] getresult(){
        return a;
    }
    void show(){
        for (int i=0; i<a.length; i++){
            System.out.println(a[i]);
        }
    }
}

public class SumApplication {
    public static void main(String[] args){
        Sum s=new Sum();
        int result[]=s.getresult();
        System.out.println("display the array values");
        for(int i=0; i<result.length; i++){
            result[i]=result[i]*2;
        }
        s.show();
    }
}
