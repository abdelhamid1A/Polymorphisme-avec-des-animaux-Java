package models;

public class Volant extends Animal{
	private String animalVolant;

	public Volant(String nom, String voix, String animalVolant) {
		super(nom, voix);
		this.setAnimalVolant(animalVolant);
	}

	public String getAnimalVolant() {
		return animalVolant;
	}

	public void setAnimalVolant(String animalVolant) {
		this.animalVolant = animalVolant;
	}

	@Override
	public String toString() {
		return "Volant [animalVolant=" + animalVolant + "]";
	}

}
