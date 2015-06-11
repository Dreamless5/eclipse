package intelligence_artificielle;

public class Test_Chainage_Arriere 
{

	public static void main(String[] args) 
	{
		// CA MARCHE
		
		
		// TODO Auto-generated method stub
		Regle Ra = new Regle("a","a","aa");
		Regle Rb = new Regle("b","b","bb");
		Regle Rc = new Regle("c","c","cc");
		Regle Rd = new Regle("d","d","dd");
		Regle Rf = new Regle("f","f","ff");
		Regle Rh = new Regle("h","h","hh");
		Regle Ri = new Regle("i","i","ii");
		Regle Rj = new Regle("j","j","jj");
		Regle Raa = new Regle("aa", "aa", "aaaa");
		Regle Raaa = new Regle ("aa", "a", "aaa");
		
		BaseDeRegles BdR = new BaseDeRegles(Ra,Rb,Rc,Rd,Rf,Rh,Ri,Rj,Raa,Raaa);
		BaseDeFaits BdF = new BaseDeFaits("a","b","d","j");
		BaseDeRegles.setBdR_courante(BdR);
		BaseDeFaits.setBdF_courante(BdF);
		
		System.out.println("DEBUT DES Tests qui REUSSISSENT");
		System.out.println("Test a");
		System.out.println(Chercher.main("a"));
		System.out.println("Test b");
		System.out.println(Chercher.main("b"));
		System.out.println("Test d");
		System.out.println(Chercher.main("d"));
		System.out.println("Test j");
		System.out.println(Chercher.main("j"));
		// OK jusque là
		
		// PAS BON (false)...maintenant c'est BON :
		System.out.println("Test aa");
		System.out.println(Chercher.main("aa"));
		System.out.println("Test bb");
		System.out.println(Chercher.main("bb"));
		System.out.println("Test dd");
		System.out.println(Chercher.main("dd"));
		System.out.println("Test jj");
		System.out.println(Chercher.main("jj"));
		System.out.println("Test aaaa");
		System.out.println(Chercher.main("aaaa"));
		System.out.println("Test aaa");
		System.out.println(Chercher.main("aaa"));
		// PAS BON (false)...maintenant c'est BON
		System.out.println("FIN DES Tests qui REUSSISSENT");
		
		System.out.println("DEBUT DES Tests qui ECHOUENT");
		System.out.println("Test za");
		System.out.println(Chercher.main("za"));
		System.out.println("Test eb");
		System.out.println(Chercher.main("eb"));
		System.out.println("Test rd");
		System.out.println(Chercher.main("rd"));
		System.out.println("Test tj");
		System.out.println(Chercher.main("tj"));
		System.out.println("Test yaa");
		System.out.println(Chercher.main("yaa"));
		System.out.println("Test ubb");
		System.out.println(Chercher.main("ubb"));
		System.out.println("Test idd");
		System.out.println(Chercher.main("idd"));
		System.out.println("Test ojj");
		System.out.println(Chercher.main("ojj"));
		System.out.println("Test paaaa");
		System.out.println(Chercher.main("paaaa"));
		System.out.println("Test aaaaa");
		System.out.println(Chercher.main("aaaaa"));
		System.out.println("FIN DES Tests qui ECHOUENT");
		// Tests qui ECHOUENT = OK
		
		
		
		
	}
}
