package ex5;

import java.util.ArrayList;
import java.util.List;

public class Inventaire {

	private List<Caisse> caisses;

	public Inventaire() {
		caisses = new ArrayList<>();
		caisses.add(new Caisse("Petits objets", 0, 5));
		caisses.add(new Caisse("Moyens objets", 5, 20));
		caisses.add(new Caisse("Grands objets", 20, 2000000000));
	}

	public void addItem(Item item) {
		for (Caisse caisse : caisses) {
			if ((caisse.getWeightMin() <= item.getPoids()) && (item.getPoids() < caisse.getWeightMin())) {
				caisse.getItems().add(item);
			}
		}
	}

	public int taille() {
		int totalItem = 0;
		for (Caisse caisse : caisses) {
			totalItem += caisse.getItems().size();
		}
		return totalItem;
	}

}
