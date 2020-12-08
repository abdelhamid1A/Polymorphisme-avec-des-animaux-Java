package models;

import java.io.File;
import java.io.IOException;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class Animal {
	private String nom ;
	private String voix;
	
	public Animal(String nom,String voix){
		this.nom = nom;
		this.voix = voix;
	}
	
	public Animal() {}
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	@Override
	public String toString() {
		return "Animal [nom=" + nom + ", voix=" + voix + "]";
	}
	public String getVoix() {
		return voix;
	}
	public void setVoix(String voix) {
		this.voix = voix;
	}
	
	public void ReadSound(String effectSource)
			throws UnsupportedAudioFileException, IOException, LineUnavailableException {
		AudioInputStream audioIn = AudioSystem.getAudioInputStream(new File(effectSource));
		Clip clip = AudioSystem.getClip();
		clip.open(audioIn);
		clip.start();
		System.out.println(effectSource + " sound is start ! ");
		System.out.println("s : " + clip.isActive());
		while (clip.isActive()) {
			 //System.out.println("hola "+effectSource);
		}
		clip.close();
		System.out.println(effectSource + " sound is end ! ");
	}

}
