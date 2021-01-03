import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Graph {

	private ArrayList<Sommet> list = new ArrayList<Sommet>();
	private int l;
	private int s;
	private ArrayList<String> Sn;
	private int[][] matrice;
	private String sn;
	private static ArrayList<String> listSuff = new ArrayList<String>();
	private static ArrayList<String> listPreff = new ArrayList<String>();
	
	
	public Graph(int l, String sn) {
		this.l = l;
		this.sn = sn;

		Sn = RechercheMot.liste_Mots(3, sn);

		s = Sn.size();
		System.out.println(s);
		matrice = new int[s][s];

		for (int i = 0; i < Sn.size(); i++) {
			ajoutSommet(Sn.get(i));
		}

		for (int j = 0; j < Sn.size(); j++) {

			for (int k = j + 1; k < Sn.size(); k++) {

				if (RechercheMot.lrmax(Sn.get(j), Sn.get(k)) == l - 1)

					ajoutArete(list, matrice, list.get(j), list.get(k));

			}
		}

	}

	public Graph(int l, ArrayList<String> Sn) {
		this.l = l;
		this.Sn = Sn;

		s = Sn.size();
		System.out.println(s);
		matrice = new int[s][s];

		for (int i = 0; i < Sn.size(); i++) {
			ajoutSommet(Sn.get(i));
		}

		for (int j = 0; j < Sn.size(); j++) {

			for (int k = j + 1; k < Sn.size(); k++) {

				if (RechercheMot.lrmax(Sn.get(j), Sn.get(k)) == l - 1) {

					ajoutArete(list, matrice, list.get(j), list.get(k));

				}

				if (RechercheMot.lrmax(Sn.get(k), Sn.get(j)) == l - 1) {

					ajoutArete(list, matrice, list.get(k), list.get(j));

				}
			}
		}

	}

	public void ajoutSommet(String etiquette) {
		Sommet newSommet = new Sommet(etiquette);
		list.add(newSommet);

	}

	public void afficheMatrice() {
  
		for (int i = 0; i < s; i++) {

			System.out.println();
			for (int j = 0; j < s; j++) {
				System.out.print("   ");

				System.out.print("   " + this.matrice[i][j]);
			}

		}
		System.out.println();
	}

	public void ajoutArete(ArrayList<Sommet> list, int[][] matrice, Sommet a, Sommet b) {

		int indiceA = list.indexOf(a);
		int indiceB = list.indexOf(b);

		matrice[indiceA][indiceB] = 1;

		System.out.println(a.etiquette + " -- " + b.etiquette);

	}

	public static ArrayList<String> suffixe(ArrayList<String> suf, int l){
		
		for(int i = 0; i<suf.size(); i++ ) {
			
			String s = suf.get(i);
			String b =  s.substring(s.length()-l+1, s.length());
			if(!listSuff.contains(b))
				listSuff.add(b);
		};
		
		return listSuff;
		
	}
public static ArrayList<String> preffixe(ArrayList<String> pref, int l){
		
		for(int i = 0; i<pref.size(); i++ ) {
			
			String s = pref.get(i);
			String b = s.substring(0,l-1);
			
			if(!listPreff.contains(b))
			listPreff.add(b);
		};
		
		return listPreff;
		
	}
	
	
	
}
