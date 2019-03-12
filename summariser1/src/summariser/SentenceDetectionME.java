package summariser;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import summariser.Constants;
import org.apache.commons.io.FileUtils;

import opennlp.tools.sentdetect.SentenceDetectorME; 
import opennlp.tools.sentdetect.SentenceModel; 
import opennlp.tools.util.Span; 

public class SentenceDetectionME { 
	

	public ArrayList<String> Sentence () {

		ArrayList<String> sent_output = new ArrayList<String>();
		try {
			String text = FileUtils.readFileToString(new File("PUT YOUR PATH HERE\\Arsenal 4-1 Fulham Hosts start New Year with victory to close gap on top four(Tue 1st January).txt"));
			 //txt extension necessary

			String stopWordsPattern = String.join("|", Constants.stopWords);
			Pattern pattern = Pattern.compile("\\b(?:" + stopWordsPattern + ")\\b\\s*", Pattern.CASE_INSENSITIVE);
			Matcher matcher = pattern.matcher(text);
			text = matcher.replaceAll("");


			//Loading a sentence model 
			InputStream inputStream = new FileInputStream("E:/university/2018-2019/2nd Semester/Honour's project/app/en-sent.bin"); 
			SentenceModel model = new SentenceModel(inputStream); 

			//Instantiating the SentenceDetectorME class 
			SentenceDetectorME detector = new SentenceDetectorME(model);  

			//Detecting the position of the sentences in the paragraph  
			String sentences[] = detector.sentDetect(text); 

			
			
			//Printing the sentences and their spans of a paragraph
			for(String sent : sentences)        
				//System.out.println(text.substring(span.getStart(), span.getEnd())+" "+ span);
				sent_output.add(" \n" + sent);
		}

			catch (IOException e) {  
				e.printStackTrace();
		}
		
		return sent_output; 

	}
	
}
	
