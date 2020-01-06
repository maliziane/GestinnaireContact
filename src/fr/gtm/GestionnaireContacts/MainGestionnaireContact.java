package fr.gtm.GestionnaireContacts;

public class MainGestionnaireContact {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Numeroteur numeroteur = new Numeroteur();
		
		Contact c1 = new Personne ("ALI ZIANE","Myriam","Mme");
		c1.setTelephone("0647458512");
		Contact c2 = new Entreprise ("GTM");
		c2.setTelephone("0645458541");
		Contact c3 = new Personne ("SLIMANI","Mona","Mx");
		c3.setTelephone("0745142585");
		
		numeroteur.add(c1);
		numeroteur.add(c2);
		numeroteur.add(c3);
		
		numeroteur.telephonerAtous();
		
		
	}

}
