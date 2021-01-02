import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Graphe {
	
	private HashMap<Sommet, List<Sommet>> sommetList = new LinkedHashMap<>();
	private ArrayList<Sommet> list ; 
	
	
	void ajoutSommet(String etiquette) {
		
		// Sommet newSommet = new Sommet(etiquette);
		/*sommetList.putIfAbsent(newSommet, new ArrayList<>());
		list.add(newSommet);*/
		
		sommetList.put(new Sommet (etiquette), new ArrayList<>());
		   System.out.println(sommetList.keySet().toArray()[0]);

	}
	/*
	void suppSommet(String etiquette) {
	    Sommet v = new Sommet(etiquette);
	    sommetList.values()
	      .stream()
	      .map(e -> e.remove(v))
	      .collect(Collectors.toList());
	    sommetList.remove(new Sommet(etiquette));
	}*/
	
	void ajoutArete(String label1, String label2) {
	    Sommet v1 = new Sommet(label1);
	    Sommet v2 = new Sommet(label2);
	   sommetList.get(v1).add(v2);
	   sommetList.get(v2).add(v1);
	}
	static /*
	void suppArete(String label1, String label2) {
	    Sommet v1 = new Sommet(label1);
	    Sommet v2 = new Sommet(label2);
	    List<Sommet> eV1 =sommetList.get(v1);
	    List<Sommet> eV2 =sommetList.get(v2);
	    if (eV1 != null)
	        eV1.remove(v2);
	    if (eV2 != null)
	        eV2.remove(v1);
	}*/
	
	Graphe createGraph(ArrayList<String> Sn , int l) {
	    Graphe graph = new Graphe();
	     for (int i =0; i< Sn.size();i++ ) {
	    graph.ajoutSommet(Sn.get(i));
	     }
	     
	   //  Set<Sommet> sommet = sommetList.keySet();
	     
	     for (int i =0; i< Sn.size();i++ ) {
	  	   //
	    
	    	if (RechercheMot.lrmax(Sn.get(i), Sn.get(i+1)) == l - 1);
	    	
	    	graph.ajoutArete(Sn.get(i),Sn.get(i+1) );
	    	
	    
	    
	     }
	return graph;
	}
	
	
	
	List<Sommet> getsommetList(String label) {
	    return sommetList.get(new Sommet(label));
	}
	
	public static void main(String [] args) {
		
		String sn = "AGGTCAGGT";
		ArrayList<String> Sn = RechercheMot.liste_Mots(3, sn);
		
		System.out.println(Sn);
		
		
		
	}

	
}
