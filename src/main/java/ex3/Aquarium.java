package ex3;

import java.util.ArrayList;

public class Aquarium extends Zone{

	/** Constructor
	 * @param animaux
	 */
	public Aquarium(ArrayList<Animal> animaux) {
		super(animaux);
	}
	@Override
	public void addAnimal(Animal animal) throws TypeException {
		if (animal.type.equals(TypeAnimal.REPTILE)) {
			Animal newAnimal = new Animal(animal.nom, animal.comportement, animal.type);
			animaux.add(newAnimal);
		} else {
			throw new TypeException("Cette zone n'accepte que des reptiles");
		}
	}

	@Override
	public void afficherListeAnimaux(ArrayList<Animal> animaux) {
		for (Animal animal : animaux) {
			System.out.println(animal);
		}

	}

	@Override
	public double calculerKgsNourritureParJour() {
		return animaux.size() * 0.2;
	}

}