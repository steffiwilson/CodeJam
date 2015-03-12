//https://code.google.com/codejam/contest/351101/dashboard#s=p2
import java.io.*;

class T9spelling {
  public static void main(String[] args) {
    File input = new File("C-small-practice.in");
    try {
      System.setOut(new PrintStream(new FileOutputStream("systemout.txt")));
      } catch (IOException ex) {
      ex.printStackTrace();
    }
	
    try(BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(input)))) {
      int numberOfCases = Integer.parseInt(reader.readLine());
      int currentCase = 1;
      while (currentCase <= numberOfCases) {
        System.out.println("Case #" + currentCase + ": " + convertToT9(reader.readLine()));
      }
    } catch (IOException e) {
	  e.printStackTrace();
    }
  }

  public static String convertToT9(String input) {
    char currChar;
    char lastChar;
    String output = '';
    for (int i = 0; i < input.length(); i++) {
      //TODO: get currChar
      if (i != 0 and currChar = lastChar)
        output = output + ' ';
      
      switch (currChar) {
        case 'a':
          //stuff
          break;
        case 'b':
          //stuff
          break;
        //...
        default: 
          //stuff
          break;
      }
    }   
    return output;
  }
}