import java.util.ArrayList;

public class PlanDeBataille {
	private ArrayList<Habitant> listeHabitant = new ArrayList<Habitant>();
	private Combat combat;
	
	public PlanDeBataille(ArrayList<Habitant> listeHabitant, Combat c) {
		this.listeHabitant = listeHabitant;
		this.combat = c;
	}
	
	public void envoyer() {
		for (Habitant h : this.listeHabitant) {
			if (h.getStatut_civique()!="non combattant"){
				h.addCombat(this.combat);	
			}
		}
	}
}