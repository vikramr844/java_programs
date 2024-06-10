import java.util.Scanner;

public class ArrayRotate {
    public static void main(String[] args) {
      try(  Scanner sc = new Scanner(System.in)){
    	System.out.print("ENTER THE SIZE OF ARRAY: ");
        int size = sc.nextInt();
        int rotations = size;
        int[] arr = new int[size];
        rotateArray( arr,  size, rotations);
        System.out.println("\nRotated Array: " + arrayToString(arr));
    } 
    }
    
    public static void rotateArray(int[] arr, int size, int rotations) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("ENTER THE ARRAY ELEMENTS:");
            for (int i = 0; i < size; i++) {
                arr[i] = sc.nextInt();
            }
        }

        int[] temp = new int[size];
        // Copy elements to temp array after rotation
        for (int i = 0; i < size; i++) {
            temp[(i + rotations) % size] = arr[i];
        }

        // Copy elements back to original array
        for (int i = 0; i < size; i++) {
            arr[i] = temp[i];
        }
        System.out.print("Original Array: ");
        for(int i=0;i<size;i++) {
        	System.out.print(arr[i]+" ");
        }
       
    }

    public static String arrayToString(int[] array) {
        StringBuilder sb = new StringBuilder();
        for (int i = array.length - 1; i >= 0; i--) {
            sb.append(array[i]+" ");
        }
        return sb.toString();
    }
}
