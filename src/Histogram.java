import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Histogram {
	public static void main(String[] args) throws FileNotFoundException
    {
		String inputFileName = "Input1.txt";
		File inputFile = new File (inputFileName);
		Scanner in = new Scanner(inputFile);
		in.useDelimiter("");
		
		Map<Character, Integer> charMap = new HashMap<Character, Integer>();
		
		//PrintWriter
		String outputFileName = "Frequency.txt";
		File outputFile = new File (outputFileName);
		PrintWriter out = new PrintWriter(outputFile);		
		
		//Put Alphabet into Hashmap
		for(char cha= 'A'; cha<='Z'; cha++) {
			charMap.put(Character.valueOf(cha), 0);
		}
		
		while (in.hasNext()) {
			String character = in.next();
			
			
			character = character.replaceAll("\\n", " ");
			character = character.replaceAll("\\r", " ");
			
			String bigCh = character.toUpperCase(); //Makes all letters to capital letters
			
			char ch = bigCh.charAt(0); //String -> Char
			
					
					if (charMap.containsKey(ch))
		    		{charMap.put(ch, charMap.get(ch) + 1);
					
		    		}
					else {
		    		charMap.put(ch, 1);
					}
		}
		//find Max
		int max = Collections.max(charMap.values());
				
		//scale regarding to max 2.0
		for(Entry<Character, Integer> entry : charMap.entrySet()) {
			
			//getting the %
			int proz=((entry.getValue()*100)/max);
						
			//replace old value with new ones
			charMap.put(entry.getKey(), proz);
												
			//print * (histogram)
			out.printf(entry.getKey()+": ");
			for(int i=1; i<=proz; i++) {
				if(i%10==0) {out.printf("*|");
				} else	out.printf("*");
			}
			out.printf("\n");
		}
		//System.out.println(charMap);
		in.close();
		out.close();
    }
	
}
