package intelligence_artificielle;

import java.util.ArrayList;

public class BaseDeRegles {

	private static BaseDeRegles courante;
	private ArrayList<Regle> listeR;
	
	// - - CONSTRUCTEURS - -
	
	// constructeur vide
	public BaseDeRegles() {
		listeR = new ArrayList<Regle>();
	}
	
	// constructeur de copie
	public BaseDeRegles(BaseDeRegles BdR) {
		listeR = new ArrayList<Regle>(BdR.listeR);
	}
	
	// constructeur de base
	public BaseDeRegles(ArrayList<Regle> liste) {
		listeR = new ArrayList<Regle>(liste);
	}
	
	// Arguments : n Regles
	public BaseDeRegles(Regle...ListeRegles) {
		for (Regle r : ListeRegles)
			listeR.add(r);
	}
	
	// - METHODES -
	
	//add
	public void Ajouter(Regle regle) {
		if (!listeR.contains(regle))
			listeR.add(regle);
	}
	
	//delete
	public void Supprimer(Regle regle) {
		if (listeR.contains(regle))
			listeR.remove(regle);
	}
	
	//modify
	public void Modifier(Regle regle, Regle new_regle) {
		if (listeR.contains(regle) && !listeR.contains(new_regle)) {
			listeR.remove(regle);
			listeR.add(new_regle);
		}
	}
	
	// TODO TO_STRING
	public String toString() {
		return "";
	}

	// - GETTERS/SETTERS - 
	
	public static BaseDeRegles getBdR_courante() {
		return courante;
	}

	public static void setBdR_courante(BaseDeRegles bdR_courante) {
		courante = bdR_courante;
	}

	public ArrayList<Regle> getListeR() {
		return listeR;
	}


}
