package intelligence_artificielle;

import java.util.ArrayList;

public class Chercher 
{
	
	

	public static boolean main(String Fait_Cherche) 	
	{	// retourne True si le Fait_Cherche est vrai, False sinon
		// on suppose que le Fait_Cherche n'est pas vrai 
		int vrai=0;
		
		//On renomme les ListeF et ListeR
		
		ArrayList<String> listeDesFaits= BaseDeFaits.getBdF_courante().getListeF();
		ArrayList<Regle> listeDesRegles=BaseDeRegles.getBdR_courante().getListeR();
		
		// if Faite_Cherche est deja dans le BaseDeFaits alors c'est succes
		
		if(listeDesFaits.contains(Fait_Cherche))
		{
			//DEBUG. OK ça marche
			System.out.println("Ce fait est déjà dans la base de fait");
			//DEBUG. OK
			vrai=1;
		}
		
		else
		{
			
		    // On parcourt tous les regles
			
			int j=0;
			while((vrai==0)&&(j<listeDesRegles.size()))
			{
				
		        Regle Regle_Courante=listeDesRegles.get(j);
		        //DEBUG
		        //System.out.println(Regle_Courante);
		        //DEBUG
		        //Trouver la regle donc la partie Alors est egale a Fait_Cherche, si la regle est marque alors on a pas besoin la verifier
		        
				if(Regle_Courante.getAlors().equals(Fait_Cherche))  // il faut utiliser equals pour comparer les séquences de caractères des Strings
				{
					//DEBUG OK
					//System.out.println("sa partie Alors est égale à " + Fait_Cherche);
					//DEBUG OK
					if (Regle_Courante.getMarque() == true)
						vrai=1;
					
					else 
					{
						// Verifier si tous les conditions de la regle courant satisifient
						int i=0;		
						while(i<Regle_Courante.getSi().size()==true && Chercher.main(Regle_Courante.getSi().get(i))) //l'ordre des conditions est IMPORTANT
							i++;
						
						//Si tous les conditions sont satisfies, alors on marque la regle et on reussi
						if(i==Regle_Courante.getSi().size()) {
							vrai=1;
							Regle_Courante.setMarque(true);
						}				
					}					
				}
				//DEBUG
				//else System.out.println("sa partie Alors n'est pas égale à " + Fait_Cherche);
				//DEBUG
				j++;
			}
		
		}
		
		if(vrai==0) return false;
		else if(vrai==1) return true;
		else return false;
				
	}
}
  
 
	  
		
			
			
			
	


