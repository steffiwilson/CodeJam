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
        String currentLine = reader.readLine();
        String currentLineConverted = convertToT9(currentLine);
        System.out.println("Case #" + currentCase + ": " + currentLineConverted);
        
        currentCase++;
      }
    } catch (IOException e) {
	  e.printStackTrace();
    }
  }

  public static String convertToT9(String input) {
    char currChar = ' ';
    char lastChar = ' ';
    String output = "";
    for (int i = 0; i < input.length(); i++) {
      currChar = input.charAt(i);
      if (i != 0 && currChar == lastChar)
        output = output + ' '; //put a space to "pause" between identical characters
      
      switch (currChar) {
        case 'a':
          output = output + "2";
          break;
        case 'b':
          output = output + "22";
          break;
        case 'c':
          output = output + "222";
          break;
        case 'd':
          output = output + "3";
          break;
        case 'e':
          output = output + "33";
          break;
        case 'f':
          output = output + "333";
          break;
        case 'g':
          output = output + "4";
          break;
        case 'h':
          output = output + "44";
          break;
        case 'i':
          output = output + "444";
          break;
        case 'j':
          output = output + "5";
          break;
        case 'k':
          output = output + "55";
          break;
        case 'l':
          output = output + "555";
          break;
        case 'm':
          output = output + "6";
          break;
        case 'n':
          output = output + "66";
          break;
        case 'o':
          output = output + "666";
          break;
        case 'p':
          output = output + "7";
          break;
        case 'q':
          output = output + "77";
          break;
        case 'r':
          output = output + "777";
          break;
        case 's':
          output = output + "7777";
          break;
        case 't':
          output = output + "8";
          break;
        case 'u':
          output = output + "88";
          break;
        case 'v':
          output = output + "888";
          break;
        case 'w':
          output = output + "9";
          break;
        case 'x':
          output = output + "99";
          break;
        case 'y':
          output = output + "999";
          break;
        case 'z':
          output = output + "9999";
          break;
        case ' ':
          output = output + "0";
          break;
        default: 
          //should not happen unless the input is bad
          break;
      }
      lastChar = currChar;
    }   
    return output;
  }
}