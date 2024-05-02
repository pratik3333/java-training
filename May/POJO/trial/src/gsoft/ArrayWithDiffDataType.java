package gsoft;

public class ArrayWithDiffDataType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Object[] obj=new Object[5];
		
		obj[0]=10;
		obj[1]="pratik";
		obj[2]= new java.util.Date();
		obj[3]=23.43f;
		obj[4]=true;
		
		for(int i=0; i<obj.length; i++)
		{
			System.out.println(obj[i]);
		}
		

	}

}
