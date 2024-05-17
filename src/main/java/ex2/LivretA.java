package ex2;

public class LivretA extends CompteBancaire {
	/** tauxRemuneration : taux de rémunération */
	double tauxRemuneration;

	/** Constructor
	 * @param solde
	 * @param decouvert
	 * @param tauxRemuneration
	 */
	public LivretA(double solde, double tauxRemuneration) {
		super(solde, 0);
		this.tauxRemuneration = tauxRemuneration;
	}


	public void appliquerRemuAnnuelle(){
			double newSolde = this.getSolde()*1+tauxRemuneration/100;
			this.setSolde(newSolde);
		}


}
