import java.util.Scanner;
class GreaterId
{
    void findCricketerId(int size,int array[],int score)
    { 
       for(int i=0;i<size;i++)
       {
           if(i%2!=0)
           {
               if(array[i]>score)
               {
                   System.out.println(array[i-1]);
               }
               
           }
       }
    }
	public static void main(String[] args)
	{
	    GreaterId m=new GreaterId();
	    int[] arr=new int[50];
	    Scanner sc=new Scanner(System.in);
        System.out.println("Enter the array size");
        int n=sc.nextInt();
        if(n<0)
        {
        System.out.println("Invalid array size");
        System.exit(0);
        }
        else
        {
        System.out.println("Enter ID");
        for(int i=0;i<n;i++)
        {
        arr[i]=sc.nextInt();
        if(arr[i]>0)
        {
            
        }
        else
        {
            System.out.println("Invalid Input");
            System.exit(0);
        }
        }
    
        System.out.println("Enter Score");
        int se=sc.nextInt();
        if(se<0){
            System.out.println("Invalid Score");
            System.exit(0);
        }
        else
        m.findCricketerId(n,arr,se);
	}
}
}
