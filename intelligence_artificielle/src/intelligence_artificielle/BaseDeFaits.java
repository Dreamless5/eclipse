package intelligence_artificielle;

import java.util.ArrayList;

public class BaseDeFaits {

	private static BaseDeFaits courante;
	private ArrayList<String> listeF;
	
	// - - CONSTRUCTEURS - -
	
	// constructeur vide
	public BaseDeFaits() {
		listeF = new ArrayList<String>();
	}
	
	// constructeur de copie
	public BaseDeFaits(BaseDeFaits bdf) {
		listeF = new ArrayList<String>(bdf.listeF);
	}
	
	// constructeur de base
	public BaseDeFaits(ArrayList<String> liste) {
		listeF = new ArrayList<String>(liste);
	}
	
	// Arguments : n Faits
	public BaseDeFaits(String...ListeFaits) {
		listeF = new ArrayList<String>();
		for (String f : ListeFaits)
			listeF.add(f);
	}
	
	// - METHODES -
	
	//add
	public void Ajouter(String Fait) {
		if (!listeF.contains(Fait))
			listeF.add(Fait);
	}
	
	//delete
	public void Supprimer(String Fait) {
		if (listeF.contains(Fait))
			listeF.remove(Fait);
	}
	
	//modify
	public void Modifier(String Fait, String new_Fait) {
		if (listeF.contains(Fait) && !listeF.contains(new_Fait)) {
			listeF.remove(Fait);
			listeF.add(new_Fait);
		}
	}
	
	// TODO TO_STRING
	public String toString() {
		String listeDesFaits = "";
		String virgule =",";
		for (String f : listeF)
			listeDesFaits += f + virgule;
		listeDesFaits = listeDesFaits.substring(0, listeDesFaits.length() - virgule.length());
		return "BaseDeFaits[" + listeDesFaits + "]";
	}

	// - GETTERS/SETTERS - 
	
	public static BaseDeFaits getBdF_courante() {
		return courante;
	}

	public static void setBdF_courante(BaseDeFaits bdF_courante) {
		courante = bdF_courante;
	}

	public ArrayList<String> getListeF() {
		return listeF;
	}

	
}
