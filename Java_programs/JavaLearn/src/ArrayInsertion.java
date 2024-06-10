import java.util.Scanner;

class Array {
    private int size;
    private Scanner sc;
    private int[] arr;

    public void Input() {
        sc = new Scanner(System.in);
        System.out.print("Enter the size of Array :");
        size = sc.nextInt();
    }

    public void gettingValue() {
        arr = new int[size];
        System.out.println("Enter the elements :");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();

        }
    }

    public void insert() {
        int pos;
        System.out.print("Enter the position to insert: ");
        pos = sc.nextInt();
        if (pos < size) {
            System.out.println("Enter the Element To Be Insert : ");
            int number = sc.nextInt();
            for (int i = size-1; i > pos-1; i--) {
                arr[i-1]=arr[i];
            }
            arr[pos-1]=number;

        }
        else{
            System.out.println("Invalid Position!");
        }
    }

    public void delete() {
        int val;
        System.out.println("Enter the Element You Want To Delete : ");
        val=sc.nextInt();
        for (int i=0;i<size;i++){
            if (arr[i]==val){
                for (int j=i;j<size-1;j++){
                    arr[j]=arr[j+1];
                }
            size--;
                System.out.println(val+" "+"Element is deleted Sucessfully ");
            }
        }
    }

    public void display() {
        System.out.println("Array Elements Are : ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

}

public class ArrayInsertion {
    public static void main(String[] args) {

        Array a1 = new Array();
        a1.Input();
        a1.gettingValue();
        a1.insert();
        a1.display();
        a1.delete();
        a1.display();
    }
}
