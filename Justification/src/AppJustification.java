
public class AppJustification {
	
	
	static String texteAJustifier = "    Ce texte,   qui  est volontairement tr�s            mal  tap�, est justifi�   correctement.   ";
	final static int longueurLigne = 120;
	final static int tailleMarge = 6;
	
	public static void main(String[] args)
	{
		// 1 - transformer en tableau
		
		char[] texteTableau = texteAJustifier.toCharArray();
		
		// 2 - d�terminer le nombre de mots
		
		int nbMots = 0;
		boolean espaceAvant = true;
		
		for (char i = 0; i < texteTableau.length; i++) {
			
			char c = texteTableau[i];
			
			if (c != ' ')
			{
				if (espaceAvant)
				{
					nbMots++;
				}
				espaceAvant = false;
			}
			else
			{
				espaceAvant = true;
			}
		}
		
		System.out.println("Il y a " + nbMots + " mots");
		
		// 3 - D�terminer le nombre de caracteres :
		
		int nbCarateres = 0;
		for (char i = 0; i < texteTableau.length; i++) {
			
			char c = texteTableau[i];
		
			if (c != ' ')
			{
				nbCarateres++;
			}
		}
		
		System.out.println("il y a " + nbCarateres + " caract�res");
		
		// 4 - nombre d'espaces :
		int nbEspaces = longueurLigne - (2 * tailleMarge) - nbCarateres;
		
		// 5 - taille de l'espace justifi� :
		int tailleEspace = nbEspaces / (nbMots - 1);
		System.out.println("l'espace justifi� est de " + tailleEspace);
		
		
		// 6 - �criture de la chaine :
		for (int i = 0; i < tailleMarge; i++)
		{
			System.out.print('-');
		}
		
		espaceAvant = true;
		for (char i = 0; i < texteTableau.length; i++) {
			
			char c = texteTableau[i];
			
			if (c == ' ')
			{
				if (! espaceAvant)
				{
					for (int j = 0; j < tailleEspace; j++)
					{
						System.out.print(' ');
					}
					espaceAvant = true;
				}
			}
			else
			{
				System.out.print(c);
				espaceAvant = false;
			}		
		}
		
		for (int i = 0; i < tailleMarge; i++)
		{
			System.out.print('-');
		}
		
	}
	
	

}
