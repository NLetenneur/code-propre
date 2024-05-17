package ex3;

import java.util.ArrayList;

public abstract class Zone {
	protected ArrayList<Animal> animaux;

	/** Constructor
	 * @param animaux
	 */
	public Zone(ArrayList<Animal> animaux) {
		super();
		this.animaux = animaux;
	}
	
	public abstract void addAnimal(Animal animal) throws TypeException;
	
	public abstract void afficherListeAnimaux(ArrayList<Animal> animaux);
	
	public int compterAnimaux(){
		return animaux.size();
	}
	
	public abstract double calculerKgsNourritureParJour();
}
