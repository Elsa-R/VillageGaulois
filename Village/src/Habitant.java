import java.util.ArrayList;

public class Habitant {
	private String nom;
	private int nnig;
	private int poids;
	private String statut_civique;
	private String caracteristique;
	private String specialite;
	private String voie;
	private int num_voie;
	private ArrayList<Combat> convoque = new ArrayList<Combat>();	
	
	public Habitant(String nom, int nnig, int poids, String statut_civique, 
					String caracteristique, String specialite, String voie, 
					int num_voie) {
		this.nom = nom;
		this.nnig = nnig;
		this.poids = poids;
		this.statut_civique = statut_civique;
		this.caracteristique = caracteristique;
		this.specialite = specialite;
		this.voie = voie;
		this.num_voie = num_voie;
	}

	public ArrayList<Combat> getConvoque() {
		return convoque;
	}

	public void addCombat(Combat c) {
		this.convoque.add(c);
	}

	public String getNom() {
		return nom;
	}

	public int getNnig() {
		return nnig;
	}

	public int getPoids() {
		return poids;
	}

	public String getStatut_civique() {
		return statut_civique;
	}

	public String getCaracteristique() {
		return caracteristique;
	}

	public String getSpecialite() {
		return specialite;
	}

	public String getVoie() {
		return voie;
	}

	public int getNum_voie() {
		return num_voie;
	}

}
