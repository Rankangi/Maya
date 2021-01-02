import java.util.ArrayList;
import java.util.Arrays;

public class Main {
	
	public static void main(String [] args) {
		
		String sn = "AGGTCAGGT";
		
		ArrayList<String> n =  new ArrayList<String>( Arrays.asList("GTGA","ATGA","GACG","CGTG","ACGT","TGAC"));
		//ArrayList<String> Sn =  new ArrayList<String>();
		ArrayList<String> m =  new ArrayList<String>( Arrays.asList("TAC","ACC","ACG","CAC","CCG","CGT","CGC","GCA","GTA"));
		
		System.out.println(sn);
		RechercheMot.lrmax("TCTAGCCAGCTAGC", "CGTAAATG");
		
		Graph graphe = new Graph(3,m);

		Graph graphe2 = new Graph(4,n);
		
		graphe2.afficheMatrice();
		graphe.afficheMatrice();
		
	


	
	}
}
