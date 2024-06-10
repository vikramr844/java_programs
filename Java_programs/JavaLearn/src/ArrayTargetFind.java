import java.util.Scanner;

class TargetFind {
    private final Scanner sc = new Scanner(System.in);
    private int[] arr;

    public void arrayInput(int size) {
        arr = new int[size];
        System.out.println("Enter the  element :");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
    }

    public void displayArray(int size) {
        System.out.println("Array Element Array:\n");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

    }

    public int countOccurrences(int target, int size) {
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (arr[i] == target) {
                System.out.println("\nTarget " + target + " found at index " + (i + 1));
                count++;
            }
        }
        return count;
    }

}

public class ArrayTargetFind {
    public static void main(String[] args) {
        TargetFind t1 = new TargetFind();
        Scanner sc = new Scanner(System.in);

//Input form user get the size of array
        System.out.println("Enter the Size of the Array : ");
        int size = sc.nextInt();

        //pass the parameter to the arrayinput method
        t1.arrayInput(size);
        //display the array
        t1.displayArray(size);

        //get the user achive target value in array
        System.out.println("Enter the target:");
        int target = sc.nextInt();

        //pass tha target value and size
        t1.countOccurrences(target, size);

        sc.close();
    }
}
