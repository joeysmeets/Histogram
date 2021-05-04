import java.io.File;
import java.io.IOException;
import java.util.Map;

import javax.swing.JFileChooser;

public class TextParser {
	private static final String FILE_CHOOSER_DEFAULT_LOCATION = "C:\\Users\\alexj\\Desktop\\HTW\\#2 Module_sem2\\Labs\\Lab4\\gitRepo1\\Histogram";
	
	private final static JFileChooser fc = new JFileChooser(FILE_CHOOSER_DEFAULT_LOCATION);
	
	public static File openFileSelector() {}
	
	public static Map<Character, Integer> parseFile(File file) throws IOException {}
	
	private static Character normalizeCharacter(int c) {}
}
