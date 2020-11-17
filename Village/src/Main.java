import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class Main {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		// Creation GestionnaireHabitant
		GestionnaireHabitant gh = GestionnaireHabitant.getInstance();
		
		// Creation Quartier
		Quartier q1 = new Quartier("centre-ville",null);
		Quartier q2 = new Quartier("port",null);
		gh.addQuartier(q1);
		gh.addQuartier(q2);
		
		// Creation Habitant
		Habitant h1	 = new Habitant("Bob", 0, 75, "combattant", 
				"force", "Guetteur", "rue Grande Place", 2);
		Habitant h2	 = new Habitant("Maurice", 1, 63, "combattant", 
				"intelligence", "Forgeron", "impasse colibri", 5);
		Habitant h3	 = new Habitant("Jeanette", 2, 64, "combattant", 
				"force", "Messager", "rue de la Fontaine", 3);
		Habitant h4	 = new 	Habitant("Paulette", 3, 59, "non combattant", 
				"rapidite", "Forgeron", "rue du port", 7);
		gh.addHabitant(h1,q1);
		gh.addHabitant(h2,q1);
		gh.addHabitant(h3,q2);
		gh.addHabitant(h4,q2);
		
		System.out.println("liste des habitants : "+ gh.getListeHabitant());
		System.out.println("liste des quartiers : "+ gh.getListeQuartier());
		
		// Creation GestionnaireCombat
		GestionnaireCombat gc = GestionnaireCombat.getInstance();
		ArrayList<Habitant> listeHabitant = new ArrayList<Habitant>();
		listeHabitant.add(h2);
		listeHabitant.add(h3);
		listeHabitant.add(h4);

		Date date1 = new SimpleDateFormat("yyyy-MM-dd").parse("0007-11-07");
		Date date2 = new SimpleDateFormat("yyyy-MM-dd").parse("0007-12-08");
		
		// Creation GestionnaireCombat
		gc.convoquerQuartier(q1,"Combat de la pleine lune", "Foret-verte",date1);
		gc.convoquerHabitant(listeHabitant,"Combat de la comete", "Butte-aux-cerfs",date2);
		
		for (Habitant h : gh.getListeHabitant()) {
			System.out.println("L'habitant : "+h.getNom() + ""+ h.getConvoque();
		}
	}

}
