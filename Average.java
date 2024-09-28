import java.util.*;

public class Average {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        System.out.print("enter 1st no:");
        int a=input.nextInt();
        System.out.print("enter 2nd no:");
        int b=input.nextInt();
        System.out.print("enter 3rd no:");
        int c=input.nextInt();
        int average=(a+b+c)/3;
        System.out.println(average);
    }
}
