package fr.isika.cda24.TPAnnuaire.entitees;

public class Noeud {
	
	public class Noeud {
		
		public final static int TAILLE_NOEUD_MAX = 132;
		private Stagiaire cle;
		private int filsGauche;
		private int filsDroit; 

		
		
		//constructeur d'un noeud 
		
		public Noeud(Stagiaire cle, int filsGauche, int filsDroit) {
			super();
			this.cle = cle;
			this.filsGauche = filsGauche;
			this.filsDroit = filsDroit;
		}
			
		
		   // Constructeur du dernier noeud 
		
	    public Noeud(Stagiaire cle) {
	        this.cle = cle;
	        this.filsGauche = -1;
	        this.filsDroit = -1;
	    }
	    
	    // constructeur de la racine 

	    public Noeud(Stagiaire cle, int filsDroit ) {
	        this.cle = cle;
	        this.filsGauche = -1;
	        this.filsDroit = filsDroit;
	    }
			
			
		public Stagiaire getCle() {
			return cle;
		}
		public void setCle(Stagiaire cle) {
			this.cle = cle;
		}
		public int getFilsGauche() {
			return filsGauche;
		}
		public void setFilsGauche(int filsGauche) {
			this.filsGauche = filsGauche;
		}
		public int getFilsDroit() {
			return filsDroit;
		}
		public void setFilsDroit(int filsDroit) {
			this.filsDroit = filsDroit;
		}


		
		
	}