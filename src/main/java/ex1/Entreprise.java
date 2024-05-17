package ex1;

import java.util.Date;

/**
 * Classe entreprise
 */
public class Entreprise {

	/**
	 * numéro Siret de l'entreprise
	 */
	protected int siret;
	/**
	 * nom de l'entreprise
	 */
	protected String nom;
	/**
	 * adresse de l'entreprise
	 */
	protected String adresse;
	/**
	 * date de création de l'entreprise
	 */
	protected Date dateCreation;

	protected static final int capitalMax = 3000000;

	/**
	 * Constructor
	 * 
	 * @param siret        numéro Siret de l'entreprise
	 * @param nom          nom de l'entreprise
	 * @param adresse      adresse de l'entreprise
	 * @param dateCreation date de création de l'entreprise
	 */
	public Entreprise(int siret, String nom, String adresse, Date dateCreation) {
		super();
		this.siret = siret;
		this.nom = nom;
		this.adresse = adresse;
		this.dateCreation = dateCreation;
	}

	/** Getter pour siret
	 * @return siret
	 */
	public int getSiret() {
		return siret;
	}

	/**Setter pour siret
	 * @param siret siret 
	 */
	public void setSiret(int siret) {
		this.siret = siret;
	}

	/** Getter pour nom
	 * @return nom
	 */
	public String getNom() {
		return nom;
	}

	/**Setter pour nom
	 * @param nom nom 
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/** Getter pour adresse
	 * @return adresse
	 */
	public String getAdresse() {
		return adresse;
	}

	/**Setter pour adresse
	 * @param adresse adresse 
	 */
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	/** Getter pour dateCreation
	 * @return dateCreation
	 */
	public Date getDateCreation() {
		return dateCreation;
	}

	/**Setter pour dateCreation
	 * @param dateCreation dateCreation 
	 */
	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}

	/** Getter pour capitalmax
	 * @return capitalmax
	 */
	public static int getCapitalmax() {
		return capitalMax;
	}
	
	

}
