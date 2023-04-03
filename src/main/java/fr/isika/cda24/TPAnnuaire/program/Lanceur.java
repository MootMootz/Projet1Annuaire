package fr.isika.cda24.TPAnnuaire.program;


import java.util.ArrayList;
import java.util.List;

import fr.isika.cda24.TPAnnuaire.entitees.Stagiaire;
import fr.isika.cda24.TPAnnuaire.entitees.User;



public class Lanceur {

	public static void main(String[] args) {
		
	    // Instanciation de l'arbre
        ArbreAnnuaire<Noeud> arbreDeChaines = new ArbreAnnuaire<Noeud>();

        // Ajout de plusieurs contacts
        arbreDeChaines.ajouterNoeud(new Noeud(new Stagiaire("DURAND", "Patrick", null, null, null)));
        arbreDeChaines.ajouterNoeud(new Noeud(new Stagiaire("AITCHEOU", "David", null, null, null)));
        arbreDeChaines.ajouterNoeud(new Noeud(new Stagiaire("LESTIEUX", "Florian", null, null, null)));
        arbreDeChaines.ajouterNoeud(new Noeud(new Stagiaire("BASTOS", "André", null, null, null)));
        
        //arbreDeChaines.ajouterNoeud("Jane DOE");
       // arbreDeChaines.ajouterNoeud("Tony DUPONT");
       // arbreDeChaines.ajouterNoeud("Matt MACHIN");
       // arbreDeChaines.ajouterNoeud("John DOE");

        // Tests de quelques méthodes de base
        
        System.out.println("Ordre alphabétique par parcours infixe");
        System.out.println("----------------");
        
      //  arbreDeChaines.parcoursInfixe();
	
		
	}

}
