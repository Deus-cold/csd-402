import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Samir Rodriguez
// Module 8.2 Assignment

public class SamirArrayListTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> myList_01 = new ArrayList<Integer>();

        System.out.println("Enter numbers (enter 0 to stop):");

        while (true) {
            int input = scanner.nextInt(); // Get user input
            if (input == 0) {
                break; // Stop when 0 is entered
            }
            myList_01.add(input); // Add to the list
        }

        scanner.close();

        Integer maxNumber = max(myList_01);
        
        if (maxNumber == null) {
            System.out.println("No valid numbers entered.");
        } else {
            System.out.println("The largest number in the list is: " + maxNumber);
        }
    }

    public static Integer max(List<Integer> list) {
        if (list.isEmpty()) {
            return null; // Return null for empty list
        }

        int maxVal = list.get(0);
        for (int num : list) {
            if (num > maxVal) {
                maxVal = num;
            }
        }
        return maxVal;
    }
}