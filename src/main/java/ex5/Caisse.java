package ex5;

import java.util.ArrayList;
import java.util.List;

public class Caisse {

	private String nom;
	private int weightMin;
	private int weightMax;
	private List<Item> items;

	/** Constructeur
	 * @param nom
	 */
	public Caisse(String nom, int weightMin, int weightMax) {
		this.nom = nom;
		this.weightMin =weightMin;
		this.weightMax =weightMax;	
		this.items = new ArrayList<>();
	}

	/** Getter pour l'attribut nom
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/** Setter pour l'attribut nom
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/** Getter pour l'attribut items
	 * @return the items
	 */
	public List<Item> getItems() {
		return items;
	}

	/** Setter pour l'attribut items
	 * @param items the items to set
	 */
	public void setItems(List<Item> items) {
		this.items = items;
	}

	/** Getter pour weightMin
	 * @return weightMin
	 */
	public int getWeightMin() {
		return weightMin;
	}

	/**Setter pour weightMin
	 * @param weightMin weightMin 
	 */
	public void setWeightMin(int weightMin) {
		this.weightMin = weightMin;
	}

	/** Getter pour weightMax
	 * @return weightMax
	 */
	public int getWeightMax() {
		return weightMax;
	}

	/**Setter pour weightMax
	 * @param weightMax weightMax 
	 */
	public void setWeightMax(int weightMax) {
		this.weightMax = weightMax;
	}
	
}
