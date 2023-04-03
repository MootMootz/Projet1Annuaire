package fr.isika.cda24.TPAnnuaire.entitees;


public class Stagiaire {
	

	// attributs 
	
	public final static int TAILLE_NOM_Caracteres = 22;
	public final static int TAILLE_Prenom_Caracteres = 22;
	public final static int TAILLE_Dpt_Caracteres = 2;
	public final static int TAILLE_promo_Caracteres = 10;
	public final static int TAILLE_annee_Caracteres = 4;

	private String nom;
	private String prenom;
	private String departement;
	private String promo;
	private String annee;
	
	
	
	public String getNomLong() {
		String NomLong = this.nom;
		for(int i = this.nom.length(); i < TAILLE_NOM_Caracteres; i++) {
			NomLong += "*";
		}
		return NomLong;
	}
	
	public String getPrenomLong() {
		String PrenomLong = this.prenom;
		for(int i = this.prenom.length(); i < TAILLE_Prenom_Caracteres; i++) {
			PrenomLong += "*";
		}
		return PrenomLong;
	}
	
	public String getDptLong() {
		String DptLong = this.departement;
		for(int i = this.departement.length(); i < TAILLE_Dpt_Caracteres; i++) {
			DptLong += "*";
		}
		return DptLong;
	}
	public String getAnneeLong() {
		String anneeLong = this.annee;
		for(int i = this.annee.length(); i < TAILLE_annee_Caracteres; i++) {
			anneeLong += "*";
		}
		return anneeLong; 
	}

	// constructeur surchargé 
	
		public Stagiaire(String nom, String prenom, String departement, String promo, String annee) {
			super();
			this.nom = nom;
			this.prenom = prenom;
			this.departement = departement;
			this.promo = promo;
			this.annee = annee; 
		}

		//getter et setter 
		
		@Override
		public String toString() {
			return "Stagiaire [nom=" + nom + ", prenom=" + prenom + ", departement=" + departement + ", promo=" + promo
					+ ", annee=" + annee + "]";
		}

		public String getNom() {
			return nom;
		}

		public void setNom(String nom) {
			this.nom = nom;
		}

		public String getPrenom() {
			return prenom;
		}

		public void setPrenom(String prenom) {
			this.prenom = prenom;
		}

		public String getDepartement() {
			return departement;
		}

		public void setDepartement(String departement) {
			this.departement = departement;
		}

		public String getPromo() {
			return promo;
		}

		public void setPromo(String promo) {
			this.promo = promo;
		}

		public String getAnnee() {
			return annee;
		}

		public void setAnnee(String annee) {
			this.annee = annee;
		}
		

}







		
		