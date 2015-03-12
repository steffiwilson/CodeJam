//<<insert codejam URL here>>
import java.io.*;

class /*<<insert Java class name>>*/ {
  public static void main(String[] args) {
    File input = new File("<<inputfilename>>.in");
    try {
      System.setOut(new PrintStream(new FileOutputStream("systemout.txt")));
      } catch (IOException ex) {
      ex.printStackTrace();
    }
	
    try(BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(input)))) {
      int numberOfCases = Integer.parseInt(reader.readLine());
      int currentCase = 1;
      while (currentCase <= numberOfCases) {
        
      }
    } catch (IOException e) {
	  e.printStackTrace();
    }
  }
//<<insert any methods here>>
}