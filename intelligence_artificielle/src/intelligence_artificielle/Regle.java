package intelligence_artificielle;
import java.util.ArrayList;

public class Regle 
{
	private ArrayList<String> si;
	private String alors;
	private Boolean marque;
	
	// crée une règle vide
	public Regle(){
		si = new ArrayList<String>();
		alors = "";
		marque = false;
	}
	
	public Regle(ArrayList<String> si, String alors){
		this.si = si;
		this.alors = alors;
		marque = false;
	}
	
	// copie
	public Regle(Regle R){
		this.si = R.si;
		this.alors = R.alors;
		this.marque = R.marque;
	}
	
	// d'autres constructeurs
	
	// Arg: Deux String 
	public Regle(String si, String alors){
		this.si = new ArrayList<String>();
		this.si.add(si);
		this.alors = new String(alors);
		marque = false;
	}

	public Regle(String...faits){
		int NbDeFaits = faits.length;
		si = new ArrayList<String>();
		for (int i=0 ; i < NbDeFaits-1 ; i++)
			si.add(faits[i]);
		alors = faits[NbDeFaits-1];
		marque = false;
	}

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
