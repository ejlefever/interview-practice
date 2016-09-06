import java.util.*;

public class QuickSort {

    public static void main(String[] args) {

        System.out.println("Generating random array...");
        int[] unsorted = generateRandomArr();
        printArr(unsorted);
        System.out.println("Sorting...");
        quickSort(unsorted, 0, unsorted.length-1);
        printArr(unsorted);

    } //main

    public static int[] generateRandomArr() {

        int[] random = new int[(int)(Math.random() * 50)];
        for (int i = 0; i < random.length; i++) {
            random[i] = (int)(Math.random() * 100);
        }
        return random;

    } //generateRandomArr

    public static void printArr(int[] arr) {

        System.out.print("[ ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("]");

    } //printArr

    public static void quickSort(int[] unsorted, int lowIndex, int highIndex) {

        int low = lowIndex;
        int high = highIndex;

        //want a value that will likely be in the middle of the data
        int pivot = (unsorted[low] + unsorted[high] + unsorted[(low + high)/2])/3;

        while (low <= high) {
            while (unsorted[low] < pivot) { //want a value > pivot
                low++;
            }
            while (unsorted[high] > pivot) { //want a value < pivot
                high--;
            }
            if (low <= high) {
                swap(unsorted, low, high);
                low++;
                high--;
            }
        }
        if (lowIndex < high) {
            quickSort(unsorted, lowIndex, high);
        }
        if (low < highIndex) {
            quickSort(unsorted, low, highIndex);
        }

    } //quickSort

    public static void swap(int[] unsorted, int i, int j) {

        int temp = unsorted[i];
        unsorted[i] = unsorted[j];
        unsorted[j] = temp;

    } //swap

} //QuickSort




