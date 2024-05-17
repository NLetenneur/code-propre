package ex3;

public class ZooApplication {

	public static void main(String[] args) {
		try {
			Zoo zoo = new Zoo("Thoiry");

			zoo.ajouterAnimal(new Animal("Gazelle", ComportementAlimentaire.HERBIVORE, TypeAnimal.MAMMIFERE));
			zoo.ajouterAnimal(new Animal("Zèbre", ComportementAlimentaire.HERBIVORE, TypeAnimal.MAMMIFERE));
			zoo.ajouterAnimal(new Animal("Lion", ComportementAlimentaire.CARNIVORE, TypeAnimal.MAMMIFERE));
			zoo.ajouterAnimal(new Animal("Panthère", ComportementAlimentaire.CARNIVORE, TypeAnimal.MAMMIFERE));
			zoo.ajouterAnimal(new Animal("Requin blanc", ComportementAlimentaire.CARNIVORE, TypeAnimal.POISSON));
			zoo.ajouterAnimal(new Animal("Truite dorée", ComportementAlimentaire.CARNIVORE, TypeAnimal.POISSON));
			zoo.ajouterAnimal(new Animal("Boa constrictor", ComportementAlimentaire.CARNIVORE, TypeAnimal.REPTILE));
			zoo.ajouterAnimal(new Animal("Python", ComportementAlimentaire.CARNIVORE, TypeAnimal.REPTILE));
		} catch (TypeException e) {
			System.err.println(e);
		}
	}

}