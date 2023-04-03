package fr.isika.cda24.TPAnnuaire.entitees;

import fr.isika.cda24.TPAnnuaire.entitees.Noeud;

public class ArbreBinaireDeRecherche {
	public class ArbreBinaireRecherche {
		
		private Stagiaire racine;
		
		public ArbreBinaireRecherche() {
			this.racine = null;
		}
		
		public ArbreBinaireRecherche(Stagiaire racine) {
			this.racine = racine;
		}

		public void ajouterDansArbre(String nomAjout) {
			//si arbre vide
			if(racine == null ) {
				racine = new Stagiaire(nomAjout);
			} else {
				this.racine.ajouterNoeud(nomAjout);
			}
		}
		
		
		public void affichageInfixe() {
			if(racine == null) {
				System.out.println("arbre vide");
			} else {
				this.racine.affichageInfixeNoeud();
			}
		}
		
		public Stagiaire rechercherNom(String nomRecherche) {
			//TODO 
			return null;
		}
		
		public void supprimer(String nomSuppression) {
			//TODO
		}
		
		
		public Stagiaire getRacine() {
			return racine;
		}

		public void setRacine(Stagiaire racine) {
			this.racine = racine;
		}
	}
}
