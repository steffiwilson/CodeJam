//https://code.google.com/codejam/contest/351101/dashboard#s=p0
import java.io.*;
import java.util.*;

class reverseWords {
  public static void main(String[] args) {
	File input = new File("reversewordsinput.txt");
	try {
	 System.setOut(new PrintStream(new FileOutputStream("systemout.txt")));
    } catch (IOException ex) {
	  ex.printStackTrace();
	}
	
    try(BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(input)))) {
	  int numberOfCases = Integer.parseInt(reader.readLine());
	  //System.out.println("Number of cases: " + numberOfCases);
	  int currentCase = 1;
	  while (currentCase <= numberOfCases) {
	    String words = reader.readLine();
		String reversed = reverse(words);
		System.out.println("Case #" + currentCase + ":" + reversed);
		currentCase++;
	  }
	} 
	catch (IOException e) {
	  e.printStackTrace();
	}
  }
  public static String reverse(String input) {
    String output = "";
	input = " " + input + " ";
	int index = -1;
	ArrayList<String> temp = new ArrayList<String>();
	for (int i = 0; i < input.length(); i++) {
	  if (input.charAt(i) == ' ') {
	    index++;
		temp.add(index, "");
	  }
	  else {
		temp.set(index, temp.get(index) + input.charAt(i));
	  }
	}
	
	for (int i = temp.size() - 1; i >= 0; i--) {
	  if (i == 0) {
	    output = output + temp.get(i);
	  }
	  else {
	    output = output + temp.get(i) + " ";
	  }
	}
	
	return output;  
  }
}