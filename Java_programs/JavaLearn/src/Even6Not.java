import java.util.Scanner;

class NumberChecker{

    public static void isEven(int number){

        //The if condition check if number if == 0
        if ((number % 2)==0){
            System.out.println("Its a Even Number");
        }
        else{
            System.out.println("Its a Odd Number");
        }

    }
}

public class Even6Not {
    public static void main(String[] args) {
        //NumberChecker n1=new NumberChecker();
        Scanner sc=new Scanner(System.in);

        //Getting Value from user
        System.out.println("Enter The Number : ");
        int number=sc.nextInt();
        //pass the value too the method
        NumberChecker.isEven(number);
        sc.close();
    }
}
