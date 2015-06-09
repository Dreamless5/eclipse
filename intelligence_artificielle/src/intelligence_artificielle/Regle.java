package intelligence_artificielle;

import java.util.ArrayList;

public class Regle 
{
	// - - ATTRIBUTS - -
	
	private ArrayList<String> si;
	private String alors;
	private Boolean marque;
	
	// - - CONSTRUCTEURS - -
	
	// constructeur qui crée une règle vide
	public Regle(){
		si = new ArrayList<String>();
		alors = "";
		marque = false;
	}
	
	// constructeur de base
	public Regle(ArrayList<String> si, String alors){
		this.si = new ArrayList<String>(si);
		this.alors = new String(alors);
		marque = false;
	}
	
	// constructeur de copie
	public Regle(Regle R){
		this.si = new ArrayList<String>(R.si);
		this.alors = new String(R.alors);
		this.marque = R.marque;
	}
	
	// - d'autres constructeurs - 
	
	// Arguments: Deux String 
	public Regle(String si, String alors){
		this.si = new ArrayList<String>();
		this.si.add(si);
		this.alors = new String(alors);
		marque = false;
	}

	// Arguments : n String
	public Regle(String...faits){
		int NbDeFaits = faits.length;
		si = new ArrayList<String>();
		for (int i=0 ; i < NbDeFaits-1 ; i++)
			si.add(faits[i]);
		alors = new String(faits[NbDeFaits-1]);
		marque = false;
	}

	
	// - - METHODES - -
	
	// TO_STRING
	public String toString() {
		String PartieSi = "";
		String Et = " + ";
		for (String f : si)
			PartieSi += f + Et;
		PartieSi = PartieSi.substring(0 , PartieSi.length() - Et.length() );
		return "Regle[" + PartieSi + " => " + alors + "]" ;
	}
	
	// - GETTERS/SETTERS -
	
	public ArrayList<String> getSi() {
		return si;
	}

	public void setSi(ArrayList<String> si) {
		this.si = si;
	}

	public String getAlors() {
		return alors;
	}

	public void setAlors(String alors) {
		this.alors = alors;
	}

	public Boolean getMarque() {
		return marque;
	}

	public void setMarque(Boolean marque) {
		this.marque = marque;
	}

	
	
}
