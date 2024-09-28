import java.util.*;

public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter your base:");
        int base = input.nextInt();
        System.out.print("enter your height");
        int height = input.nextInt();
        int area = (base * height)/2;
        System.out.printf("%d",area);
    }
}