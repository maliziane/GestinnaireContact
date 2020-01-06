
package fr.gtm.GestionnaireContacts;

public class Entreprise extends Contact{

	
	@Override
	public String getNom() {
		return "Entreprise "+super.getNom();
	}
	
	
	public Entreprise(String nom) {
		super(nom);	}

}
