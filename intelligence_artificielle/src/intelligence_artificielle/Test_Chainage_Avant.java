package intelligence_artificielle;

public class Test_Chainage_Avant {

	public static void main(String[] args) {
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
		
		System.out.println(BdF);
		System.out.println("Chainage");
		Chainage_avant.main();
		
		//OK OK

	}

}
