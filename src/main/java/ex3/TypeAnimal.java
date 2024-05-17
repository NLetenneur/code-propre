package ex3;

public enum TypeAnimal {
	
	MAMMIFERE("Mammifère"),
	REPTILE("Reptile"),
	POISSON("Poisson");
	
	String libelle;

	/** Constructor
	 * @param libelle
	 */
	private TypeAnimal(String libelle) {
		this.libelle = libelle;
	}

	/** Getter pour libelle
	 * @return libelle
	 */
	public String getLibelle() {
		return libelle;
	}
	
	

}
