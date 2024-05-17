package ex3;

public class Animal {
	protected String nom;
	protected ComportementAlimentaire comportement;
	protected TypeAnimal type;

	/**
	 * Constructor
	 * 
	 * @param nom          Nom de l'animal
	 * @param comportement Comportement alimentaire de l'animal
	 */
	public Animal(String nom, ComportementAlimentaire comportement, TypeAnimal type) {
		this.nom = nom;
		this.comportement = comportement;
		this.type= type;
	}
	
	@Override
	public String toString () {
		return this.nom+" : "+this.comportement;
		
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

	/** Getter pour comportement
	 * @return comportement
	 */
	public ComportementAlimentaire getComportement() {
		return comportement;
	}

	/**Setter pour comportement
	 * @param comportement comportement 
	 */
	public void setComportement(ComportementAlimentaire comportement) {
		this.comportement = comportement;
	}

	/** Getter pour type
	 * @return type
	 */
	public TypeAnimal getType() {
		return type;
	}

	/**Setter pour type
	 * @param type type 
	 */
	public void setType(TypeAnimal type) {
		this.type = type;
	}
	
	

}
