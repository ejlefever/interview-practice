import java.util.*;

public class MergeSort {

    public static void main(String[] args) {

        System.out.println("Generating random array...");
        int[] unsorted = generateRandomArr();
        printArr(unsorted);
        System.out.println("Sorting...");
        mergeSort(unsorted, 0, unsorted.length-1);
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

    public static void mergeSort(int[] unsorted, int lowIndex, int highIndex) {

        if (lowIndex < highIndex) {
            int mid = lowIndex + (highIndex - lowIndex)/2; //get the index of the center element
            mergeSort(unsorted, lowIndex, mid);
            mergeSort(unsorted, mid + 1, highIndex);
            merge(unsorted, lowIndex, mid, highIndex);
        }

    } // mergeSort

    public static void merge(int[] unsorted, int low, int mid, int  high) {

        int[] original = new int[unsorted.length]; //want a copy of the array that we won't modify
        for (int i = low; i <= high; i++) {
            original[i] = unsorted[i];
        }

        int a = low;
        int b = mid + 1;
        int z = low;

        while (a <= mid && b <= high) {
            if (original[a] <= original[b]) {
                unsorted[z] = original[a];
                a++;
            } else {
                unsorted[z] = original[b];
                b++;
            }
            z++;
        }

        while (a <= mid) {
            unsorted[z] = original[a];
            a++;
            z++;
        }
        while (b <= high) {
            unsorted[z] = original[b];
            b++;
            z++;
        }

    } //merge

} //MergeSort




