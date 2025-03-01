import java.util.Scanner;

public class Dub {

  static void arr() {
    int arr2[] = new int[]{2, 6, 2, 3, 6, 5};

    // Outer loop to go through each element of the array
    for (int i = 0; i < arr2.length; i++) {
      
      boolean dub = false;  // Reset dub to false for each new element
      
      // Inner loop to compare the current element with the rest of the elements
      for (int j = i + 1; j < arr2.length; j++) {
        
        // If a duplicate is found, mark it with -1
        if (arr2[i] == arr2[j]) {
          arr2[j] = -1;  // Mark the duplicate as processed
          dub = true;    // Set dub to true if a duplicate is found
        }
      }
      
      // If dub is true and the element is not -1, print the element
      if (dub && arr2[i] != -1) {
        System.out.println(arr2[i]);
      }
    }
  }

  public static void main(String arg[]) {
    arr();  // Call the arr method to find duplicates
  }
}
