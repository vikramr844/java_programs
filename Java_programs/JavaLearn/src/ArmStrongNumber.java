import java.util.Scanner;

public class ArmStrongNumber {
    public static void main(String[] args) {

       try( Scanner sc=new Scanner(System.in)){
        System.out.println("enter the number :");
        int number=sc.nextInt();
       
        int temp=number;
        int rem,res = 0;

        while(number != 0)
        {
            rem=number%10;//143  =>3 // 14=>4
            res +=(rem*rem*rem);//27+  
            number=number/10;//14
        }


       if(res==temp){
           System.out.println("it is armStrong Number");

       }
       else System.out.println("it is not armStrong Number" + res);

       }
    }
}
