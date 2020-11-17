import java.util.ArrayList;

public class ListeCombat {
	private static ListeCombat lc;
	private  ArrayList<Combat> listeC = new ArrayList<Combat>();
	private ListeCombat() {
		
	}
	
	public static ListeCombat getInstance() {
		if (lc == null) {
			lc = new ListeCombat();
		}
		return lc;
	}
	
	public void addCombat(Combat c) {
		listeC.add(c);
	}
	
	public void removeCombat(Combat c) {
		listeC.remove(c);
	}

	public ArrayList<Combat> getListeC() {
		return listeC;
	}
	
	
}
