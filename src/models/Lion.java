package models;

import java.io.IOException;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class Lion extends Sauvage{

	private String lionVoix;
	
	public Lion(String nom, String voix, String animalSauvage, String lionVoix) {
		super(nom, voix,animalSauvage);
		this.lionVoix = lionVoix;
		
	}

	public Lion() {} 
	@Override
	public String toString() {
		return "Lion [lionVoix=" + lionVoix + "]";
	}


	public String getLionVoix() {
		return lionVoix;
	}

	public void setLionVoix(String lionVoix) {
		this.lionVoix = lionVoix;
	}
	
	public void ReadSound(String effetDeVoix)
			throws UnsupportedAudioFileException, IOException, LineUnavailableException {
		super.ReadSound(effetDeVoix);
	}
	

}
