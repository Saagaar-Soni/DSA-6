//Minimum no. 


import java.util.Scanner;
public class qsn2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter size of array");
        int n = input.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter no. of elements");
        for (int i = 0; i < n; i++){
            arr[i] = input.nextInt();
        }

        int min = arr[0];
        for (int i = 0; i < n; i++){
            if( min > arr[i]){
                min = arr[i];
            }
        }
        System.out.println("Minimum element: " + min);
        input.close();
    }
}
