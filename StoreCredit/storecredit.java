//https://code.google.com/codejam/contest/351101/dashboard#s=p0
import java.io.*;

class storecredit {
  public static void main(String[] args) {
    File input = new File("A-large-practice.in");
	try {
	 System.setOut(new PrintStream(new FileOutputStream("systemout.txt")));
    } catch (IOException ex) {
	  ex.printStackTrace();
	}
	
    try(BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(input)))) {
	  int numberOfCases = Integer.parseInt(reader.readLine());
	  int currentCase = 1;
	  while (currentCase <= numberOfCases) {
	    int creditThisCase = Integer.parseInt(reader.readLine());
		int itemsInStore = Integer.parseInt(reader.readLine());
		String itemString = reader.readLine();
		int[] itemArray = parseArray(itemString, itemsInStore);

		//findPair returns the indices of the two items that add up to the total credit
		//findPair was made a method (rather than leaving its logic in the main method) to allow a clean break out of the nested array iterations when the solution is found
		String solution = findPair(itemArray, creditThisCase);

		System.out.println("Case #" + currentCase + ": " + solution);
	    currentCase++;
	  }
	} 
	catch (IOException e) {
	  e.printStackTrace();
	}
  }
  
  public static int[] parseArray(String stringValues, int arrayLength) {
    stringValues = stringValues + " "; //add a space on the end to capture the last value
    int[] arrayValues = new int[arrayLength];
	int currentIndex = 0;
	String current = "";

	for (int i = 0; i < stringValues.length(); i++) {
	  if (Character.toString(stringValues.charAt(i)).equals(" ")) {
	    arrayValues[currentIndex] = Integer.parseInt(current);
		current = "";
		currentIndex++;
	  }
	  else {
        current += Character.toString(stringValues.charAt(i));
	  }
    }
	return arrayValues;
  }

  public static String findPair(int[] itemArray, int credit) {
    int firstItem = -1;
	int secondItem = -1;
    for (int i = 0; i < itemArray.length; i++) {
	  int targetValue = credit - itemArray[i];
	  for (int j = i + 1; j < (itemArray.length); j++) {
		if (itemArray[j] == targetValue) { //found the pair
		    return Integer.toString(i + 1) + " " + Integer.toString(j + 1); //adding 1 since my array is indexed from 0 and the answer expects indexing from 1
		}
	  }
	}
    return "Unable to find pair";
  }
}