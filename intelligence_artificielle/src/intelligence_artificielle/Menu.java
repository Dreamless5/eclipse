package intelligence_artificielle;

import java.util.Scanner;


// le menu du programme
// c'est l'intermédiaire entre l'utilisateur et le programme
public class Menu 
{

	public static void main() 
	{
		//Pour lire le clavier
		Scanner sc = new Scanner(System.in);
		
		
		// message d'accueil
		System.out.println("Menu Principal \n");
	
		// TODO ne pas oublier les chainages dans le menu
		String message_action = 
				  "l	charger une base depuis un fichier \n"
				+ "c	créer une base \n"
				+ "m	modifier une base \n"
				+ "s	afficher une base \n"
				+ "e	exporter une base dans un fichier \n";
		
		
		
		// l'utilisateur choisit son action
		String action = "";
		while (!action.equals("l") && !action.equals("c") && !action.equals("m") && !action.equals("s") && !action.equals("e")) {
			System.out.println(message_action);
			action = sc.nextLine();
		}
		
		
		//l'utilisateur choisit sur quel type de base il souhaite travailler
		String type = "";
		while (!type.equals("f") && !type.equals("r") && !type.equals("q")) {
			System.out.println("Base de Faits ou Base de Regles ? [f / r] \n"
					+ "q	Revenir au menu principal \n");
			type = sc.nextLine();
		}
		
		//retour au menu principal si l'utilisateur choisit de quitter
		if (type.equals("q"))
			Menu.main();
		
		
		
		//l'utilisateur tape le nom du fichier
		if (action.equals("l") || action.equals("e")) {
			System.out.println("Nom du fichier ?");
			String nom_fichier = sc.nextLine();
		}
		//TODO si modif et si pas de nom de fichier et si courant est def : ne pas toucher à courant
		
		// TODO definir la variable 'courant'
		// si creer : courant = new base 
		// sinon : courant = charger(nom_fichier)
	
		// charger => appeler charger (methode)
		// creer => creer
		// modif => appeler modification (classe)
		// afficher => appeler tostring
		
		
		
		
		// on exporte automatiquement à la fin de chaque action, après la confirmation
				// Creation est un algo à part (une classe en fait)
		
	}
}
