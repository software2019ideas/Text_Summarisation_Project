package summariser;

import java.io.File;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.io.FileUtils;

public class Main {

	public static void main(String args[]) throws Exception{


		// Creating objects
		
		SentenceDetectionME sd = new SentenceDetectionME();
		Tokenizer tkn = new Tokenizer();
		SentencePosition sp = new SentencePosition();
		WordFrequencyCorpus wrdfrq = new WordFrequencyCorpus();

		// Array lists and toString
		
		ArrayList<String> sentenceDetectionOutput = sd.Sentence();
		String sentenceDetection = sentenceDetectionOutput.toString();

		ArrayList<String> wordsDetectionOutput = tkn.Words();
		String wordsDetection = wordsDetectionOutput.toString();
		
		ArrayList<String> sentencePositionOutput = sp.Sentence();
		String sentencePosition = sentencePositionOutput.toString();

		ArrayList<String> FrequencyDetectionOutput = wrdfrq.WordFrequency();
		String frequencyDetection = wordsDetectionOutput.toString();

		// Printing

		System.out.println("Sentence Segmentation");
		System.out.println("-----------------------------------------------------------------------------------------");
		System.out.println("");
		System.out.println(sentenceDetectionOutput);
		System.out.println("");

		System.out.println("-----------------------------------------------------------------------------------------");
		System.out.println("Tokenization");
		System.out.println("-----------------------------------------------------------------------------------------");
		System.out.println("");
		System.out.println(wordsDetectionOutput);
		System.out.println("");

		System.out.println("-----------------------------------------------------------------------------------------");
		System.out.println("Sentence Position");
		System.out.println("-----------------------------------------------------------------------------------------");
		System.out.println("");
		System.out.println(sentencePositionOutput);
		System.out.println("");
		
		System.out.println("-----------------------------------------------------------------------------------------");
		System.out.println("Word Frequency Corpus Data");
		System.out.println("-----------------------------------------------------------------------------------------");
		System.out.println("");
		System.out.println(FrequencyDetectionOutput);

	}
}
