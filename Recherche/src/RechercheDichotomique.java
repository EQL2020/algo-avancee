
public class RechercheDichotomique {

	public static void main(String[] args) {


		String s1 = "Benoit";
		String s2 = "Zoe";

		// s1.compareTo(s2) :
		// 0   si s1 = s2
		// <0  si s1 < s2
		// >0  si s1 > s2
		
		if(s1.compareTo(s2) > 0)
		{
			System.out.println(s1 + " est plus grand que " + s2);
		}
		else if (s1.compareTo(s2) == 0)
		{
			System.out.println(s1 + " est égal à " + s2);
		}
		else
		{
			System.out.println(s1 + " est plus petit que " + s2);
		}
	}

}
