// Reverse an Array

import java.util.Scanner;

public class qsn4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter size of Array: ");
        int n = input.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements: ");
        for (int i = 0; i < n; i++){
            arr[i] = input.nextInt();
        }

        int left = 0;
        int right = arr.length - 1;
        while (left < right ) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }

        System.out.println("Reversed array: ");
        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i] + " ");
        }

        input.close();
    }
}
