import java.util.*;

public class AreaOfRectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter length:");
        int length=input.nextInt();
        System.out.print("enter breadth:");
        int breadth = input.nextInt();
        int area = length*breadth;
        System.out.printf("Area of rectangle is %d",area);
    }

}

