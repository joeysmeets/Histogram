import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
 /**
This program reads a file with numbers, and writes the numbers to another
file, lined up in a column and followed by their total.
 */
public class Histogram
{
	public static void main(String[] args) throws FileNotFoundException
	{
	// Prompt for the input and output file names							
		Scanner in = new Scanner("/Users/joey/Documents/HTW/2nd Semester/Info 2/Projects/Histogram/Input.txt");
		System.out.print("Input file: Input.txt");
		String inputFileName = in.next();
		System.out.print("Output file: Output.txt");
		String outputFileName = in.next();
		
	// Construct the Scanner and PrintWriter objects for reading and writing
		File inputFile = new File(inputFileName);
		Scanner in = new Scanner(inputFile);
		PrintWriter out = new PrintWriter(outputFileName);
	
	// Read the input and write the output 
		while (in.hasNext()) {
			char ch = in.next().charAt(0);
			if (isTheSame(ch)) {
				vowels++;
			}
		}
		try {
			Map<Character, Integer> dict = TextParser.parseFile(selectedFile);
			generateHistogram(dict, true);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}