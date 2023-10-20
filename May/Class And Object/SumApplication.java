import java.util.Scanner;
class Solution
{
    private int nums[];
    private int target;

    void setData(int nums[],int target)
    {
        this.nums=nums;
        this.target=target;
    }

    void getTarget()
    {
        int i,j;
        
        for( i=0; i<nums.length; i++)
        {
            for( j=i+1; j<nums.length; i++)
            {
                if((nums[i]+nums[j])==target)
                {
                    System.out.printf("[%d,%d]",i,j);
                    break;
                }
            }
        }
    }
}

public class SumApplication
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int nums[]=new int[5];
        System.out.println("Enter array values");
        for(int i=0; i<nums.length; i++)
        {
            nums[i]=sc.nextInt();
        }
         System.out.println("target");
         int target=sc.nextInt();
         Solution s1=new Solution();
         s1.setData(nums,target);
         s1.getTarget();
    }
}