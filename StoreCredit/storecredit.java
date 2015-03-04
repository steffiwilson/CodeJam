import java.io.*;

class storecredit {
  public static void main(String[] args) {
    File input = new File("C:/Users/shydanus/Desktop/storecreditinput.txt");

	
    try(BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(input)))) {
	  int numberOfCases = Integer.parseInt(reader.readLine());
	  System.out.println("Number of cases: " + numberOfCases);
	  int currentCase = 1;
	  while (currentCase <= numberOfCases) {
	    int creditThisCase = Integer.parseInt(reader.readLine());
		int itemsInStore = Integer.parseInt(reader.readLine());
		String itemString = reader.readLine();
		int[] itemArray = parseArray(itemString, itemsInStore);
		
		System.out.println("Case #" + currentCase + ": \nI have $" + creditThisCase + " store credit. There are " + itemsInStore + " items in the store. Their values are:");
		printArray(itemArray);
		System.out.println("\nThe values in String format were: \n" + itemString + "\n\n");
		
	  
	    currentCase++;
	  }
	} 
	catch (IOException e) {
	  e.printStackTrace();
	}
  }
  
  public static int[] parseArray(String stringValues, int arrayLength) {
    stringValues = stringValues + " "; //add a space on the end to capture the last value
    int[][] arrayValues = new int[arrayLength][2];
	int currentIndex = 0;
	String current = "";

	for (int i = 0; i < stringValues.length(); i++) {
	  if (Character.toString(stringValues.charAt(i)).equals(" ")) {
	    arrayValues[currentIndex][1] = Integer.parseInt(current);
		arrayValues[currentIndex][2] = i;
		current = "";
		currentIndex++;
	  }
	  else {
        current += Character.toString(stringValues.charAt(i));
	  }
    }
	return arrayValues;
  }

  public static void printArray(int[] array) {
    for (int i = 0; i < array.length; i++) {
	  System.out.print(array[i] + " ");
	}
  }
  
  public static void quickSort(int[] array) {
    //sort the array
  }
}