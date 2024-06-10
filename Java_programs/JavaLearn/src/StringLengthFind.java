import java.util.Scanner;

class StringLengthCalculator{
  public  int calculateLength(String length){

      return length.length();
    }
}
public class StringLengthFind {
    public static void main(String[] args) {
        StringLengthCalculator s1=new StringLengthCalculator();
        Scanner sc =new Scanner(System.in);

        //getting value form user
        System.out.println("Enter the line of word : ");
        String length = sc.nextLine();


        //pass the form method
        s1.calculateLength(length);
        int WordLength=s1.calculateLength(length);

        //print the value
        System.out.println("Total Length is :"+WordLength);
        sc.close();
    }
}
