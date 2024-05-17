package ex3;

import java.util.ArrayList;

public class ZoneCarnivore extends Zone {

	/**
	 * Constructor
	 * 
	 * @param animaux
	 */
	public ZoneCarnivore(ArrayList<Animal> animaux) {
		super(animaux);
	}

	@Override
	public void addAnimal(Animal animal) throws TypeException {
		if ((animal.type.equals(TypeAnimal.MAMMIFERE)
				&& (animal.comportement.equals(ComportementAlimentaire.CARNIVORE)))) {
			Animal newAnimal = new Animal(animal.nom, animal.comportement, animal.type);
			animaux.add(newAnimal);
		} else {
			throw new TypeException("Cette zone n'accepte que des mammifères carnivores");
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
		return animaux.size() * 10;
	}

}