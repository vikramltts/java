import java.util.Scanner;
class LeapyearCal
{
    int checkLeapYear(int x)
    {
        int r;
        r=x%4;
        if(r==0)
        return 1;
        else if(r>0)
        return 0;
        else
        return -1;
    }
public static void main(String[] args)
{
   Leapyearcal m=new LeapyearCal();
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter an year: ");
   int number=sc.nextInt();
   int res1=m.checkLeapYear(number);
   if(res1==1)
   System.out.println("YES");
   else if(res1==0)
   System.out.println("NO");
   else
   System.out.println("Invalid Input");
}

}import java.util.Scanner;
class LeapyearCal
{
    int checkLeapYear(int x)
    {
        int r;
        r=x%4;
        if(r==0)
        return 1;
        else if(r>0)
        return 0;
        else
        return -1;
    }
public static void main(String[] args)
{
   Leapyearcal m=new LeapyearCal();
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter an year: ");
   int number=sc.nextInt();
   int res1=m.checkLeapYear(number);
   if(res1==1)
   System.out.println("YES");
   else if(res1==0)
   System.out.println("NO");
   else
   System.out.println("Invalid Input");
}

}
