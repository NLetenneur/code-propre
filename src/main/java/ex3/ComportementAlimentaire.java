package ex3;

public enum ComportementAlimentaire {
		
	HERBIVORE("Herbivore"),
	CARNIVORE("Carnivore"),
	INSECTIVORE("Insectivore");

	String libelle;

	/** Constructor
	 * @param libelle Nom du comportement alimentaire
	 */
	private ComportementAlimentaire(String libelle) {
		this.libelle = libelle;
	}

	/** Getter pour libelle
	 * @return libelle
	 */
	public String getLibelle() {
		return libelle;
	}
	
	
}
