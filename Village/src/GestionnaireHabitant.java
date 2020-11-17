import java.io.File;
import java.util.ArrayList;

public class GestionnaireHabitant {
	private ArrayList<Habitant> listeHabitant = new ArrayList<Habitant>();
	private ArrayList<Quartier> listeQuartier = new ArrayList<Quartier>();
	private static GestionnaireHabitant gh = null;
	
	private GestionnaireHabitant() {
		
	}
	
	public static GestionnaireHabitant getInstance() {
		if (gh == null) {
			gh = new GestionnaireHabitant();
		}
		return gh;
	}
	
	public void addHabitant(Habitant h, Quartier q) {
		this.listeHabitant.add(h);
		q.addHabitant(h);
	}
	
	public void removeHabitant(Habitant h) {
		this.listeHabitant.remove(h);
	}
	
	public void addQuartier(Quartier q) {
		this.listeQuartier.add(q);
	}
	
	public void removeQuartier(Quartier q) {
		this.listeQuartier.remove(q);
	}

	public ArrayList<Habitant> getListeHabitant() {
		return listeHabitant;
	}

	public ArrayList<Quartier> getListeQuartier() {
		return listeQuartier;
	}
	
	
	
}
