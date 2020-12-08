package app;
import java.io.IOException;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

import models.Lion;

public class Main {

	public static void main(String[] args) {
		Lion lion = new Lion();
		
		try {
			lion.ReadSound("C:\\Users\\Admin\\Downloads\\lion.wav");
		} catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
			e.printStackTrace();
		}

	}

}
