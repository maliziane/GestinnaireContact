package fr.gtm.GestionnaireContacts;

public class Personne extends Contact {

	private String prenom;
	private String civilite;
	
	
	public Personne(String nom,String prenom, String civilite) {
		super(nom);
		this.setPrenom(prenom);
		this.setCivilite(civilite);
	
	}

	@Override
	public String getNom() {
		return getCivilite()+" "+getPrenom()+" "+super.getNom();
	}
	
	
	
	public String getPrenom() {
		return prenom;
	}


	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}


	public String getCivilite() {
		return civilite;
	}


	public void setCivilite(String civilite) {
		this.civilite = civilite;
	}
	
	

}
