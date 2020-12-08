package models;

public class Sauvage extends Animal {
    
	private String animalSauvage;
	
	public Sauvage(String nom, String voix, String animalSauvage) {
		super(nom, voix);
		this.animalSauvage = animalSauvage;
	}
	
	public Sauvage() {}
	@Override
	public String toString() {
		return "Sauvage [animalSauvage=" + animalSauvage + "]";
	}

	public String getAnimalSauvage() {
		return animalSauvage;
	}

	public void setAnimalSauvage(String animalSauvage) {
		this.animalSauvage = animalSauvage;
	}

}
