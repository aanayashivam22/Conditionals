import java.util.*;

public class AreaOfCircle {
    public  static void main(String[]args){
       Scanner input=new Scanner(System.in);
       System.out.print("enter your radius=");
       int r=input.nextInt();
       int area=(22*r*r)/7;
       System.out.printf("%d is area of circle",area);
    }
}
