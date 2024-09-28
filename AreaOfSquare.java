import java.util.*;

public class AreaOfSquare {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.print("enter side:");
        int side=input.nextInt();
        int area=side*side;
        System.out.printf("Area of square is %d",area);
    }
}
