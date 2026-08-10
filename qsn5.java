
// Question 4: Search for an Element in an Array

import java.util.Scanner;

public class qsn5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter size of element");
        int n = input.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter Elements");
        for( int i = 0; i < n; i++){
            arr[i] = input.nextInt();
        }
        System.out.println("Enter target element in Array");
        int target = input.nextInt();
        int found = -1;

        for ( int i = 0; i < n; i++){
            if ( target == arr[i]){
                System.out.println("Element Found at " + i + " position");
            }
          
        }
        

        
    }
}
