import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class MatchMain1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Match1> al=new ArrayList<Match1>();
		System.out.println("Enter the number of matches");
		int n=Integer.parseInt(br.readLine());
		for(int i=1;i<=n;i++)
		{
			System.out.println("Enter match date in (MM-dd-yyyy)");
			String s=br.readLine();
			//Date date1=new SimpleDateFormat("dd/MM/yyyy").parse(s);
			System.out.println("Enter Team 1");
			String s1=br.readLine();
			System.out.println("Enter Team 2");
			String s2=br.readLine();
			al.add(new Match1(s,s1,s2));
		}
		System.out.println("Match Details");
		Collections.sort(al);
		for(Match1 m1:al)
		{
			System.out.println("Team 1"+m1.getTeamOne());
			System.out.println("Team 2"+m1.getTeamTwo());
			System.out.println("Match held on "+m1.getDate());
		}
		

	}

}
