package model;

public abstract class EntiteReservable<T extends Formulaire> {
	
	private int identification;
	private CalendrierAnnuel carnetReservation;
	
	
	protected EntiteReservable(int identification) {
		this.identification = identification;
		carnetReservation = new CalendrierAnnuel();
	}
	
	
	public int getIdentification() {
		return identification;
	}

	public void setIdentification(int identification) {
		this.identification = identification;
	}


	public boolean estLibre(T formulaire) {
		int jour = formulaire.getJour();
		int mois = formulaire.getMois();
		return carnetReservation.estLibre(jour, mois);
	}
	
	public abstract boolean compatible(T formulaire);
	
	public abstract Reservation reserver(T formulaire);
}
