// Find the Maximum Element in an Array


import java.util.Scanner;
public class qsn1 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter size of array: ");
         
        int Element = input.nextInt();
        // size of array ------------------>
        int[] arr = new int[Element];
        System.out.println(" Enter elements of array: ");
        for (int i = 0; i < Element; i++){
            arr[i] = input.nextInt();
        }

        int max = arr[0];
        for(int i = 1; i < Element; i++){
            if (arr[i] > max ){
                max = arr[i];
            }
        }

        System.out.println("Maximum element: " + max);
        input.close();

    }
}
