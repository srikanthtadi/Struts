package test;

import java.io.IOException;
import java.io.InputStream;

import javazoom.jl.decoder.JavaLayerException;

import com.gtranslate.Audio;
import com.gtranslate.Language;
import com.gtranslate.Translator;

public class TranslateTest {
	
	public static void main(String[] args) throws IOException, JavaLayerException
	{/*
		Translator t = Translator.getInstance();
		String text = t.translate("amma", Language.ENGLISH, Language.TELUGU);
		System.out.println(text);*/
		Audio audio = Audio.getInstance(); 
		InputStream sound = audio.getAudio("I am a bus", Language.ENGLISH); 
		audio.play(sound);

System.out.println("hi");
	}

}
