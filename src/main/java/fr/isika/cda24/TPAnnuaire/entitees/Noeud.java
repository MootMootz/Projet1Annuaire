package fr.isika.cda24.TPAnnuaire.entitees;

import java.io.IOException;
import java.io.RandomAccessFile;

public class Noeud {
	
	
	protected static final int FILS_NUL = -1;
	private Stagiaire cle;
	private int filsGauche;
	private int filsDroit;
	private int doublon;


	
	//constructeur d'un noeud 
	
	public Noeud(Stagiaire cle, int filsGauche, int filsDroit) {
		super();
		this.cle = cle;
		this.filsGauche = filsGauche;
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
	
		
	
	
	
	public void ecrireStagiaire(Stagiaire stagiaire, RandomAccessFile raf) {
		
		try {
			raf.seek(raf.length ());
			
			raf.writeChars(stagiaire.getNomLong());
			
			raf.writeChars(stagiaire.getPrenomLong());
			
			raf.writeChars(stagiaire.getDptLong());
			raf.writeChars(stagiaire.getPromoLong());
			raf.writeChars(stagiaire.getAnneeLong());
			
			raf .writeInt(Noeud.FILS_NUL); 
			raf.writeInt(Noeud.FILS_NUL); 
			
			
			
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	

	}

	
	public Noeud LireStagiaire(RandomAccessFile raf) {
		
		String nom = "";
		String prenom="";
		String departement="";
		String promo="";
		String annee = "";
		int filsGauche = -1;
		int filsDroit= -1;
		
		try {
			// Lit bes variables de l'objet stagiaire
			
			for (int i = 0; i < Stagiaire. TAILLE_NOM_Caracteres; i++) {
			nom += raf.readChar ();
			}
			
			for (int i = 0; i < Stagiaire.TAILLE_Prenom_Caracteres; i++) {
			prenom += raf.readChar ();
			
			}
			
			for (int i = 0; i < Stagiaire. TAILLE_Dpt_Caracteres; i++) {
				
			
			departement += raf.readChar ();
			
			}
			for (int i = 0; i < Stagiaire. TAILLE_promo_Caracteres; i++) {
			promo += raf.readChar();
			}
		
		
			Stagiaire stagiaire = new Stagiaire (nom, prenom, departement, promo, annee);
			
			return new Noeud(stagiaire, filsGauche, filsDroit);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace(); 
			return null;
		}
		
	}


	public int getDoublon() {
		return doublon;
	}


	public void setDoublon(int doublon) {
		this.doublon = doublon;
	}
}
	

	


	
	
	