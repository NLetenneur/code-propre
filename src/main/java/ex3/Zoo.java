package ex3;

import java.util.ArrayList;

public class Zoo {

	private String nom;
	
	public Zoo(String nom){
		this.nom = nom;
	}
	
	public void ajouterAnimal(Animal animal) throws TypeException {
		ArrayList<Animal> animaux = new ArrayList<>();
		ZoneCarnivore zoneCarnivore = new ZoneCarnivore(animaux);
		SavaneAfricaine savaneAfricaine = new SavaneAfricaine(animaux);
		FermeReptile fermeReptile = new FermeReptile(animaux);
		Aquarium aquarium = new Aquarium(animaux);
		switch(animal.type) {
		case MAMMIFERE:
			if (animal.comportement.equals(ComportementAlimentaire.CARNIVORE)) {
				zoneCarnivore.addAnimal(animal);
			} else if (animal.comportement.equals(ComportementAlimentaire.HERBIVORE)) {
				savaneAfricaine.addAnimal(animal);
			}
			break;
		case REPTILE:
			fermeReptile.addAnimal(animal);
			break;
		case POISSON:
			aquarium.addAnimal(animal);
			break;
		}		
	}

	/** Getter for nom
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/** Setter
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
}