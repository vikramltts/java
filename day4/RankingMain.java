import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class RankingMain {

	public static void main(String[] args)throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Ranking> al=new ArrayList<Ranking>();
		System.out.println("Please provide the number of players");
		int n=Integer.parseInt(br.readLine());
		int k=1;
		for(int i=1;i<=n;i++)
		{
			System.out.println("Enter the name of player"+i);
			String s=br.readLine();
			System.out.println("Enter the score of player"+i);
			int sc=Integer.parseInt(br.readLine());
			al.add(new Ranking(s,sc));
		}
		System.out.println("Player details by score(High to Low)");
        Collections.sort(al);
        for(Ranking r:al)
        {
        	System.out.println(k+" "+r.getName()+" "+r.getScore());
        	k++;
        }
	}

}
