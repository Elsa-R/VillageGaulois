import java.io.File;
import java.util.ArrayList;

public class Quartier {
	private String nom;
	private File image;
	private ArrayList<Habitant> listeHabitant = new ArrayList<Habitant>();

	public Quartier(String nom, File image) {
		this.nom = nom;
		this.image = image;
	}

	public File getImage() {
		return image;
	}

	public ArrayList<Habitant> getListeHabitant() {
		return listeHabitant;
	}
	
	public void addHabitant(Habitant h) {
		this.listeHabitant.add(h);
	}
	
	public void removeHabitant(Habitant h) {
		this.listeHabitant.remove(h);
	}
}

