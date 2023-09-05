
public class Array {

    // Define a method to display elements of an array
    private static void display(int[] arr) {
        for (int index = 0; index < arr.length; index++) {
            System.out.print(arr[index] + " ");
        }
    }

    public static void main(String[] args) {
        // Decalare an array
        int intArray[];
        // Initialize an array of 8 int
        // set aside memory of 8 int
        intArray = new int[8];
        System.out.println("Array before adding data.");

        // Display elements of an array.
        display(intArray);

        // Operation : Insertion
        // Add elements in the array
        for (int i = 0; i < intArray.length; i++) {
            // place value of i at index i
            System.out.println("Adding " + i + " at index " + i);
            intArray[i] = i;

        }
        System.out.println(); // for a space like <br>
        System.out.println("Array after adding data.");
        display(intArray);
        // operation: update
        // Element at any location can be updated directly
        System.out.println(); // for a space like <br>
        int index = 5;
        intArray[index] = 10;
        System.out.println("Array after updating element at index " + index);
        display(intArray);
        System.out.println(); // for a space like <br>

        // Operation : Search using index
        // Search an element using index.
        System.out.println("Data at " + index + " is :" + intArray[index]);

        // Operation : Search using value
        // Search an element using value.
        for (int i = 0; i < intArray.length; i++) {
            int value = 4;
            if (intArray[i] == value) {
                System.out.println(value + " Found at index " + intArray[i]);
                break;
            }
        }
        System.out.println("Data at index "+ index + ":" + intArray[index]);

    }
}