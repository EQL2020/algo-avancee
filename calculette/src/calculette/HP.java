package calculette;

public class HP {
	
	
	public static void main(String[] args)
	{
		double[] tab = new double[10];
		
		// test pile :
		
		push(42, tab);
		push(18, tab);
		push(37, tab);
		afficher(tab);
		
		double d = pop(tab);
		System.out.println("valeur : " + d);
		afficher(tab);
		
		
		
		
	}
	
	public static void afficher(double[] tableau)
	{
		for (int i = 0; i < tableau.length; i++) {
			System.out.print(tableau[i] + "  ");
		}
		System.out.println();
	}
	
	public static void push(double d, double[] tableau)
	{
		
	}
	
	public static double pop(double[] tableau)
	{
		return 0;
	}
	
	public static void queue(double d, double[] tableau)
	{
		
	}
	
	public double dequeue(double[] tableau)
	{
		return 0;
	}

}
