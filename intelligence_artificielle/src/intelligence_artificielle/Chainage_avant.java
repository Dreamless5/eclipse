package intelligence_artificielle;

import java.util.ArrayList;


public class Chainage_avant
{

	/**
	 * @param args
	 */
	
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		// On travaille sur les copies des bases courantes
		BaseDeFaits F_Actuelle = new BaseDeFaits(BaseDeFaits.getBdF_courante());
		BaseDeRegles R_Actuelle = new BaseDeRegles(BaseDeRegles.getBdR_courante());
		
		// Creation de 'raccourcis'
		ArrayList<String> listeDesFaits = F_Actuelle.getListeF();
		ArrayList<Regle> listeDesRegles = R_Actuelle.getListeR();
		
		// Algorithme pour démarquer les regles (optionnel)
		for (Regle regle_courante : listeDesRegles)
			regle_courante.setMarque(false);
		
		// tant que l'on n'a pas de saturation, on continue
		boolean saturation = false;
		while (saturation == false)
		{
			// on parcourt les regles à la recherche de faits à déduire
			// si aucune déduction n'est faite sur un parcours, on s'arrete (saturation !)
			saturation = true;
			
			for (Regle regle_courante : listeDesRegles)
			{
				if (!regle_courante.getMarque())
				{
					int c = 0;
					while (listeDesFaits.contains( regle_courante.getSi().get(c) ) && 
							c < regle_courante.getSi().size() )
						c++;
					
					if (c == regle_courante.getSi().size())
						listeDesFaits.add(regle_courante.getAlors());
						regle_courante.setMarque(true);	
				}
			}
		
		}
	
		// TODO : il y a pas qc à faire ? bof
		
		
		
		
		
	}
}
