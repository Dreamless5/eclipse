package intelligence_artificielle;

import java.util.ArrayList;

public class Test 
{

	public static void main(String[] args) 
	{
		Regle R1=new Regle("F1","F2");
		Regle R2=new Regle("F2","F3","F4");
		Regle R3=new Regle("F2","F4","F5");
		System.out.println(R1);
		System.out.println(R2);
		System.out.println(R3);
		
		
		BaseDeRegles BDR=new BaseDeRegles(R1,R2,R3);
		BaseDeFaits  BDF=new BaseDeFaits("F1","F3");
		Chercher.Chercher("F5");
		
	
		
		
	}
		
}


