package model;

public abstract class Reservation {
	
	protected int[] date = new int[2];
	
	protected Reservation(int jour, int mois) {
		date[0] = jour;
		date[1] = mois;
	}
	
	public abstract String toString();
}
