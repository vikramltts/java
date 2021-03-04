import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.HashSet;
import java.util.TreeSet;

public class MatchSet {

	public static void main(String[] args)throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		HashSet<String> hs=new HashSet<String>();
		int n=Integer.parseInt(br.readLine());
		for(int i=0;i<n;i++)
		{
			hs.add(br.readLine());
			
		}
		TreeSet<String> ts=new TreeSet<String>(hs);
		for(String s:ts)
		{
			System.out.println(s);	
		}
        
        
	}

}
