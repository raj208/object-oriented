public class ArrayExample {

    // Method to modify the values of an array
    public static void modifyArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] *= 2; // Doubling each element
        }
    }

    public static void main(String[] args) {
        int[] myArray = {1, 2, 3, 4, 5};

        System.out.println("Original array:");
        for (int num : myArray) {
            System.out.print(num + " ");
        }

        modifyArray(myArray);

        System.out.println("\nArray after modification:");
        for (int num : myArray) {
            System.out.print(num + " ");
        }
    }
}
