package fr.gtm.GestionnaireContacts;

import java.util.ArrayList;
import java.util.List;


public class Numeroteur {
/*
 * a une liste de contact, qu'il peut appeler et dire bonjour Monsieur .... .... ou Entreprise ....
 */
	List<Contact> contacts = new ArrayList<Contact>();
	
	
	public void telephonerAtous() {
		for(int i=0; i<contacts.size();i++) {
		System.out.print("tel : "+contacts.get(i).getTelephone());
		System.out.println(" => Bonjour "+contacts.get(i).getNom());
	}}

		
		public void add(Contact contact) {
			contacts.add(contact);
		
		}
}
