import java.util.ArrayList;
import java.util.Collections;

public class RechercheMot {
//<>
	
	/*
	 * Cette m�thode  calcule la liste de tous les mots de longueur l � partir d'une chaine de caract�res s
	 * **Avec r�p�tition **
	 * @param l : longueur des mots 
	 * @param s : chaine de caract�re (s�quence d'ADN)
	 * @return listeMots : liste contenant les mots cr�e � partir de la chaine de caract�re  
	 */
/*	
	public static ArrayList<String> listeMots(int l, String s) {
		
		int n = s.length();//longueur de la chaine de caract�re
		ArrayList<String> listeMots = new ArrayList<String>() ;
			for (int i =0 ; i< n-l+1;i++) {
				String sub = (String) s.subSequence(i, l+i);// subSequence return une sous chaine � partir de la chaine de caract�re s ,� partir du  caract�re i(debut) jusqu'au carat�re l+i(fin) 
				listeMots.add(sub);
			}
		
		return listeMots;
		
	}*/
	
	public static ArrayList<String> listeMots(int l, String s) {
		
		int n = s.length();//longueur de la chaine de caract�re
		ArrayList<String> listeMots = new ArrayList<String>() ;
			for (int i =0 ; i< n-l+1;i++) {
				String sub = (String) s.subSequence(i, l+i);// subSequence return une sous chaine � partir de la chaine de caract�re s ,� partir du  caract�re i(debut) jusqu'au carat�re l+i(fin) 
				listeMots.add(sub);
			}
		
		return listeMots;
		
	}
	
	//renvoie la liste de mots distincts 
	public static ArrayList<String> liste_Mots(int l, String s) {
		
		int n = s.length();//longueur de la chaine de caract�re
		ArrayList<String> listeMots = new ArrayList<String>() ;
			for (int i =0 ; i< n-l+1;i++) {
				String sub = (String) s.subSequence(i, l+i);// subSequence return une sous chaine � partir de la chaine de caract�re s ,� partir du  caract�re i(debut) jusqu'au carat�re l+i(fin) 
				//if (Collections.frequency(listeMots, sub)== 0)//verifie la frequence d'apparition de la sous-chaine sub (le mot), si elle est egal � 0 c'est que le mot n'est pas d�j� pr�sent dans la liste (non redendant) donc on l'ajoute � la liste sinon non 
			//listeMots.contains(sub) : renvoie true si sub est contenu dans la liste
				if(!listeMots.contains(sub)) {//verifie si la sous-chaine de caract�re (le mots) est contenue dans la liste, s'il est d�j� pr�sent on ne l'ajoute pas sinon on l'ajoute
					listeMots.add(sub);
				}
			
			}
			
		
		return listeMots;
		
	}
	
	public static int lrmax (String m1, String m2) {
		int lrmax = 0 ;
		 StringBuilder s = new StringBuilder() ;
		
		
			for( int i = 0; i< Math.min(m1.length(),m2.length()) ; i++) {
			//	char n1 = m1.charAt(i);char n2 = m2.charAt(lrmax);//m2.length(-1-lrmax
				//System.out.println(m1.charAt(i));
				//int z =0;
				
					String a  = m1.substring(m1.length()-i-1,m1.length());
					String b  = m2.substring(0,i+1);
					
					
						if(a.equals(b)) {
							
							lrmax = a.length();
							
							//System.out.println("lrmax = "+lrmax);
							
						}
						
						
						
				/*if(n1==n2) {
					if(lrmax==0) {
					s.insert(lrmax, n1);
					n2= m2.charAt(lrmax);
					lrmax++;}
					else {
						s.insert(lrmax, n1);
						if (s != (m2.subSequence(0, lrmax))) {
							s.delete(0,lrmax);
							lrmax=0;}
							else {
							n2= m2.charAt(lrmax);
							lrmax++;
							}
						} */
					
					
	
			}	 
					
			/*	
			}
			if(lrmax!= 0) {
				
				System.out.print("lrmax = "+lrmax+ " la chaine est : "+s);
			}else {
				System.out.println("Il n�existe aucun recouvrement entre M1 et M2");
			}
			*/
			return lrmax;
			
	}
	
	
	
	public static void main(String [] args) {
		/*
		System.out.println(listeMots(3,"AGGTCAGGT"));
		System.out.println(listeMots(4,"AGGTCAGGT"));
		System.out.println(liste_Mots(3,"AGGTCAGGT"));*/
		lrmax("GCTAGGCTAA","AGGCTAAGTCGAT");
	}
	
}
