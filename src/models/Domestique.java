package models;

public class Domestique extends Animal {
	
	private String animalDomestique;

	public Domestique(String nom,String voix,String animalDomestique) {
		super(nom,voix);
	    this.animalDomestique = animalDomestique;
	}
	
	public String getDomestique() {
		return animalDomestique;
	}

	@Override
	public String toString() {
		return "Domestique [animalDomestique=" + animalDomestique + "]";
	}

	public void setDomestique(String animalDomestique) {
		this.animalDomestique = animalDomestique;
	}

}
