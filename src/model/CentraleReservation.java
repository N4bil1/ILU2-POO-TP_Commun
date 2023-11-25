package model;

public class CentraleReservation<T extends EntiteReservable<U>, U extends Formulaire> {
	private T[] entites;
	private int nbEntites;
	
	public CentraleReservation(T[] entites) {
		this.entites = entites;
		this.nbEntites = 0;
	}
	
	public int ajouterEntite(T entite) {
		entites[nbEntites++] = entite;
		entite.setIdentification(entite.getIdentification()+1);
		return entite.getIdentification();
	}
	
	public int[] donnerPossibilites(U formulaire) {
		int[] possibilites = new int[nbEntites];
		for (int i = 0; i < nbEntites; i++) {
			if (entites[i].estLibre(formulaire) && entites[i].compatible(formulaire)) {
				possibilites[i] = entites[i].getIdentification();
			} else {
				possibilites[i] = 0;
			}
		}
		return possibilites;
	}
	
//	public Reservation reserver(int numEntite, U formulaire) {
//		return;
//	}
}
