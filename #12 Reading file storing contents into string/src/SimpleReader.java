import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;


public class SimpleReader {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

//		 String workingDir = System.getProperty("user.dir");
//		 System.out.println("Current working directory : " + workingDir);
		   
		readFromTextFile("C:\\Users\\burea1124\\JavaInputFiles\\readthisfile.txt");
		lines_CommentsCounter("C:\\Users\\burea1124\\JavaInputFiles\\readthisfile.txt");
		
	}
	
	static void readFromTextFile (String path) throws IOException{
		String content = new String(Files.readAllBytes(Paths.get(path)));
		System.out.println(content);
	}
	
	static void lines_CommentsCounter (String path) throws IOException {
		
		int lineCount = 0, commentsCount = 0;
		
		Scanner input = new Scanner(new File(path));
		while (input.hasNextLine()) {
			String data = input.nextLine();
			
			if (data.startsWith("//") || data.startsWith("/*") || data.endsWith("*/")) commentsCount++;
			
			lineCount++;
		}
		
		System.out.println("Line Count: " + lineCount + "\t Comments Count: " + commentsCount);
	}
	
	
	
}
