import java.util.Scanner;

class Average{
    Scanner sc=new Scanner(System.in);
    public double FindAverage(int size){
        int[] arr=new int[size];
        double sum=0;
        System.out.println("Enter the Array Value : ");
        for (int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        for (int j:arr){
            sum+=j;
        }
        sum /=size;
        System.out.println("The Average Number is :"+sum);
        return sum;
    }
}

public class AverageCalculator {
    public static void main(String[] args) {
        Average a1=new Average();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size : ");
        int size=sc.nextInt();
//        System.out.println("Enter the number : ");
//        double number=sc.nextInt();
        a1.FindAverage(size);
        sc.close();
    }
}
