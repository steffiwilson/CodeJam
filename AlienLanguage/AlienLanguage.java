//https://code.google.com/codejam/contest/90101/dashboard#s=p0
import java.io.*;

class AlienLanguage {
  public static void main(String[] args) {
    File input = new File("practice.in");
    try {
      System.setOut(new PrintStream(new FileOutputStream("practiceout.txt")));
      } catch (IOException ex) {
      ex.printStackTrace();
    }
	
    try(BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(input)))) {
      String info = reader.readLine(); // wordLength, wordsInLanguage, testCases
      int wordLength = 0;
      int wordsInLanguage = 0;
      int testCases = 0;
      int count = 0;
      for (String splitter: info.split(" ", 3)){
        if (count == 0) {
          wordLength = Integer.parseInt(splitter);
          count = 1;
        }
        else if (count ==1) {
          wordsInLanguage = Integer.parseInt(splitter);
          count = 2;
        }
        else {
          testCases = Integer.parseInt(splitter);
        }
      }
      //Testing: 
      System.out.println("The words are " + wordLength + " letters long. There are " + wordsInLanguage + " words. We have " + testCases + " words to decipher.");
      //TODO: pull in the next [wordsInLanguage] lines into a data structure 
      
      //TODO: decipher the unknown words
      
    } catch (IOException e) {
	  e.printStackTrace();
    }
  }
}