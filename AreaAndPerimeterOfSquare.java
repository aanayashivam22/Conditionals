import java.util.*;

public class AreaAndPerimeterOfSquare {
    public static void main(String[]args){
      Scanner input=new Scanner(System.in);
      System.out.print("enter side,please:");
      int side=input.nextInt();
      int area=side*side;
      int peri=4*side;
      System.out.printf("area is %d and perimeter is %d",area,peri);

    }
}
