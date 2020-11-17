import java.util.ArrayList;

public class GestionnaireMusee {
	private static GestionnaireMusee gm = null;
	private  ArrayList<Casque> listeCasque = new ArrayList<Casque>();
	private GestionnaireMusee() {
	}
		
	public static GestionnaireMusee getInstance() {
		if (gm == null) {
			gm = new GestionnaireMusee();
		}
		return gm;
	}
	
	public void addCasque(String g, String f, String e, Combat c,Habitant h) {
		Casque casque = new Casque( g,  f,  e,  c, h);
		listeCasque.add(casque);
	}
	
	public void enleverCasque(Casque c) {
		listeCasque.remove(c);
	}

	public ArrayList<Casque> getListeCasque() {
		return listeCasque;
	}
	
	public ArrayList<Habitant> getListeHabitant() {
		return GestionnaireHabitant.getInstance().getListeHabitant();
	}
	
	public ArrayList<Combat> getListeCCombat() {
		return ListeCombat.getInstance().getListeC();
	}
}
