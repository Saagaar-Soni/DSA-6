
// Find the Sum of All Elements in an Array

import java.util.Scanner;
public class qsn3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter size f array: ");
        int n = input.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter Elements: ");
        for ( int i = 0; i < n; i++ ){
            arr[i] = input.nextInt();
        }

        int sum = 0;
        for ( int i = 0; i < n; i++){
            sum = sum + arr[i];
        }

        System.out.println("Sum of all elements: " + sum);

    }
}
