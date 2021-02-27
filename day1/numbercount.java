import java.util.Scanner;
class NumCount
{
    int findElementCount(int a,int [] arr,int c)
    { 
        int count=0;
       for(int i=0;i<a;i++)
       {
           if(arr[i]==c)
           {
               count++;
           }
       }
       return count;
    }
	public static void main(String[] args) 
        {
	  NumCount m=new NumCount();
	 int[] array=new int[50];
	 Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Array Size");
        int n=sc.nextInt();
        if(n<0)
        {
        System.out.println("Invalid Input");
        System.exit(0);
        }
        else{
        System.out.println("Enter Elements into the Array");
        for(int i=0;i<n;i++){
        array[i]=sc.nextInt();
        if(array[i]>0)
        {
            
        }
        else{
            System.out.println("Invalid Input");
             System.exit(0);
            }
        }
    
        System.out.println("Enter element which needed to be searched");
        int se=sc.nextInt();
        
        int res=m.findElementCount(n,array,se);
        System.out.println("Number count:"+res);
        
	}
	}
}
