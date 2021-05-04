import java.io.File;
import java.io.FileNotFoundException;
//import java.io.PrintWriter;
import java.util.Scanner;
 /**
This program reads a file with numbers, and writes the numbers to another
file, lined up in a column and followed by their total.
 */
public class Histogram
{
	public static void main(String[] args) throws FileNotFoundException {
		String inputFileName = "alice30.txt";
		File inputFile = new File(inputFileName);
		Scanner in= new Scanner(inputFile);
		
		int vowels = 0;
		while (in.hasNext()) {
			char ch = in.next().charAt(0);
			if (isVowel(ch)) {
				vowels++;
			}
		}
		System.out.println(vowels);
	}
	
	public static boolean isVowel(char ch) {
		return "aeiouAEIOU".indexOf(ch) >= 0;
	}
}
