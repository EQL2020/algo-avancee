public class AppJustification {

	// PARAMETRES :
	// ------------
	
	static int tailleMarges = 5;
	static int tailleLigne = 120;
	static String texteAJustifier = "    le   petit  chat est gris    ";

	static char[] tableauEntree;
	static int nbMots;
	static int nbLettres;
	static char[] tableauSortie = new char[tailleLigne];

	public static void main(String[] args) {
		// TRAITEMENT :
		// ------------
		
		// 1 - transformer le texte � justifier en tableau de caract�res
		tableauEntree = texteAJustifier.toCharArray();

		// 2 - compter les mots
		compterMotsV2();
		System.out.println("Il y a " + nbMots + " mots");

		// 3 - compter le nombre de lettres (tout caract�re diff�rent de l'espace)
		compterLettres();
		
		// 4 - d�finir le nombre d'espaces total

		// 5 - d�finir le nombre de s�parateurs

		// 6 - d�finir la taille du s�parateur

		// 7 - fabriquer le texte justifi� (tableauSortie)
		// ecrire la marge de gauche

		// r�p�ter

		// ecrire un mot : une s�quence de lettres sans espace

		// ecrire un s�parateur : quand j'ai un espace qui suit une lettre

		// jusqu'� la fin du texte

		// ecrire la marge de droite
		
		// 8 - afficher le r�sultat (tableauSortie)
		for(int i = 0; i < tableauSortie.length; i++)
		{
			System.out.println(tableauSortie[i]);
		}

	}

	private static void compterLettres() {
		// TODO faire le job....
		
	}

	private static void compterMotsV2() {
		
		nbMots = 0;
		
		for(int i = 0; i < tableauEntree.length; i++)
		{
			char courant = tableauEntree[i];
			
			if (courant == ' ' && i > 0 && tableauEntree[i-1] != ' ') 
			{
				nbMots++;
			}
			
			if (courant != ' ' && i == tableauEntree.length -1)
			{
				nbMots++;
			}
		}
	}
		
	private static void compterMotsV1() {

		nbMots = 0;

		// A TESTER for(int i = 1; i < tableauEntree.length; i++)
		for (int i = 0; i < tableauEntree.length; i++) {
			char courant = tableauEntree[i];

			if (courant == ' ') // le caractere courant est un espace
			{
				if (i > 0) // j'ignore le cas ou c est le premier element
				{
					char precedent = tableauEntree[i - 1];

					if (precedent != ' ') // le caractere pr�c�dent est une lettre
					{
						nbMots++;
					}
				}
			} 
			else // le caractere courant est une lettre
			{
				if (i == tableauEntree.length - 1) // le caractere courant est le dernier element
				{
					nbMots++;
				}
			}
		}

	}

}