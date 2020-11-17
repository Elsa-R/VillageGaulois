import java.util.ArrayList;
import java.util.Date;

public class GestionnaireCombat {
	private static GestionnaireCombat gc = null;
	
	private GestionnaireCombat() {
		
	}
	
	public static GestionnaireCombat getInstance() {
		if (gc == null) {
			gc = new GestionnaireCombat();
		}
		return gc;
	}
	
	public void convoquerQuartier(Quartier q,String nom, String lieu,Date date) {
		Combat c = new Combat(nom,lieu,date);
		ListeCombat.getInstance().addCombat(c);
		envoyerPlan(q.getListeHabitant(), c);
	}
	
	public void convoquerHabitant(ArrayList<Habitant> listeHabitant,String nom, String lieu,Date date) {
		Combat c = new Combat(nom,lieu,date);
		ListeCombat.getInstance().addCombat(c);
		envoyerPlan(listeHabitant, c);
	}
	
	public void envoyerPlan(ArrayList<Habitant> listeHabitant, Combat c) {
		PlanDeBataille pb = new PlanDeBataille(listeHabitant, c);
		pb.envoyer();
	}
	
	public ArrayList<Habitant> getListeHabitant() {
		return GestionnaireHabitant.getInstance().getListeHabitant();
	}
	
	public ArrayList<Quartier> getListeQuartier() {
		return GestionnaireHabitant.getInstance().getListeQuartier();
	}
}
