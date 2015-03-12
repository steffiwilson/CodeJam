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
    int lastNumberKeyPressed = 1;
    String output = "";
    for (int i = 0; i < input.length(); i++) {
      currChar = input.charAt(i);
      //if (i != 0 && currChar == lastChar)
      //  output = output + ' '; //put a space to "pause" between identical characters
      
      switch (currChar) {
        case 'a':
          if (lastNumberKeyPressed == 2)
            output = output + " 2";
          else
            output = output + "2";
          lastNumberKeyPressed = 2;
          break;
          
        case 'b':
          if (lastNumberKeyPressed == 2)
            output = output + " 22";
          else
            output = output + "22";
          lastNumberKeyPressed = 2;
          break;
          
        case 'c':
          if (lastNumberKeyPressed == 2)
            output = output + " 222";
          else  
            output = output + "222";
          lastNumberKeyPressed = 2;
          break;
          
        case 'd':
          if (lastNumberKeyPressed == 3)
            output = output + " 3";
          else 
            output = output + "3";
          lastNumberKeyPressed = 3;
          break;
          
        case 'e':
          if (lastNumberKeyPressed == 3)
            output = output + " 33";
          else 
            output = output + "33";
          lastNumberKeyPressed = 3;
          break;
          
        case 'f':
          if (lastNumberKeyPressed == 3)
            output = output + " 333";
          else
            output = output + "333";
          lastNumberKeyPressed = 3;
          break;
          
        case 'g':
          if (lastNumberKeyPressed == 4)
            output = output + " 4";
          else
            output = output + "4";
          lastNumberKeyPressed = 4;
          break;
          
        case 'h':
          if (lastNumberKeyPressed == 4)
            output = output + " 44";
          else
            output = output + "44";
          lastNumberKeyPressed = 4;
          break;
          
        case 'i':
          if (lastNumberKeyPressed == 4)
            output = output + " 444";
          else
            output = output + "444";
          lastNumberKeyPressed = 4;
          break;
          
        case 'j':
          if (lastNumberKeyPressed == 5)
            output = output + " 5";
          else 
            output = output + "5";
          lastNumberKeyPressed = 5;
          break;
          
        case 'k':
          if (lastNumberKeyPressed == 5)
            output = output + " 55";
          else  
            output = output + "55";
          lastNumberKeyPressed = 5;
          break;
          
        case 'l':
          if (lastNumberKeyPressed == 5)
            output = output + " 555";
          else 
            output = output + "555";
          lastNumberKeyPressed = 5;
          break;
          
        case 'm':
          if (lastNumberKeyPressed == 6)
            output = output + " 6";
          else  
            output = output + "6";
          lastNumberKeyPressed = 6;
          break;
          
        case 'n':
          if (lastNumberKeyPressed == 6)
            output = output + " 66";
          else
            output = output + "66";
          lastNumberKeyPressed = 6;
          break;
          
        case 'o':
          if (lastNumberKeyPressed == 6)
            output = output + " 666";
          else
            output = output + "666";
          lastNumberKeyPressed = 6;
          break;
          
        case 'p':
          if (lastNumberKeyPressed == 7)
            output = output + " 7";
          else
            output = output + "7";
          lastNumberKeyPressed = 7;
          break;
          
        case 'q':
          if (lastNumberKeyPressed == 7)
            output = output + " 77";
          else
            output = output + "77";
          lastNumberKeyPressed = 7;
          break;
          
        case 'r':
          if (lastNumberKeyPressed == 7)
            output = output + "777";
          else
            output = output + "777";
          lastNumberKeyPressed = 7;
          break;
          
        case 's':
          if (lastNumberKeyPressed == 7)
            output = output + " 7777";
          else
            output = output + "7777";
          lastNumberKeyPressed = 7;
          break;
          
        case 't':
          if (lastNumberKeyPressed == 8)
            output = output + " 8";
          else
            output = output + "8";
          lastNumberKeyPressed = 8;
          break;
          
        case 'u':
          if (lastNumberKeyPressed == 8)
            output = output + " 88";
          else
            output = output + "88";
          lastNumberKeyPressed = 8;
          break;
          
        case 'v':
          if (lastNumberKeyPressed == 8)
            output = output + " 888";
          else
            output = output + "888";
          lastNumberKeyPressed = 8;
          break;
          
        case 'w':
          if (lastNumberKeyPressed == 9)
            output = output + " 9";
          else
            output = output + "9";
          lastNumberKeyPressed = 9;
          break;
          
        case 'x':
          if (lastNumberKeyPressed == 9)
            output = output + " 99";
          else
            output = output + "99";
          lastNumberKeyPressed = 9;
          break;
          
        case 'y':
          if (lastNumberKeyPressed == 9)
            output = output + " 999";
          else
            output = output + "999";
          lastNumberKeyPressed = 9;
          break;
          
        case 'z':
          if (lastNumberKeyPressed == 9)
            output = output + " 9999";
          else
            output = output + "9999";
          lastNumberKeyPressed = 9;
          break;
          
        case ' ':
          if (lastNumberKeyPressed == 0)
            output = output + " 0";
          else
            output = output + "0";
          lastNumberKeyPressed = 0;
          break;
          
        default: 
          //should not happen unless the input is bad
          break;
      }
    }   
    return output;
  }
}