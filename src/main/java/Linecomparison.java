import java.util.Scanner;
public class Linecomparison {
    public static void main(String[] args) {
        System.out.println("Welcome to Line Comaprison");
        int x1,x2,y1,y2;
        int a1,a2,b1,b2;
        double distance ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value x1=");
        x1 = sc.nextInt();
        a1 = sc.nextInt();
        System.out.println("Enter the value x2=");
        x2 = sc.nextInt();
        a2 = sc.nextInt();
        System.out.println("Enter the value y1=");
        y1 = sc.nextInt();
        b1 = sc.nextInt();
        System.out.println("Enter the value y2=");
        y2 = sc.nextInt();
        distance = Math.sqrt(((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1)));
        b2 = sc .nextInt();
        distance=Math.sqrt((a2-a1)*(a2-a1)+b2-b1)*(b2-b1);
        System.out.println("The distance between two lines is" +distance);

    }
}
