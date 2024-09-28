import java.util.*;

public class DivisibleBy {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        System.out.print("enter your num:");
        int num=input.nextInt();
        if(num%5==0||num%11==0){
            System.out.print("divisible");
        }
        else{
            System.out.print("not divisible");
        }
    }
}
