package classs;
class table{
    int no;
    void setValue(int no){
        this.no=no;
    }
    void showtable(){
        for(int i=1; i<=10; i++){
            System.out.printf("%d\n",no*i);
        }
    }

}


public class Table {
    public static void main(String[] args){
        table t1=new table();
        t1.setValue(10);
        t1.showtable();
    }
    
}
