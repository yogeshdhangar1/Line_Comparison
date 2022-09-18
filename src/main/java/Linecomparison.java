import java.util.Scanner;
public class Linecomparison {
    public static void main(String[] args) {
        System.out.println("Welcome to Line Comaprison");
        int a1,a2,b1,b2;
        int a3,a4,b3,b4;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value of x1");
        a1=sc.nextInt();
        System.out.println("Enter value of y1");
        b1=sc.nextInt();
        System.out.println("Enter value of x2");
        a2=sc.nextInt();
        System.out.println("Enter value of y2");
        b2=sc.nextInt();
        Double length1=Math.sqrt((a2-a1)*(a2-a1)+(b2-b1)*(b2-b1));
        System.out.println("The length of line1 is" +length1);
        System.out.println("Enter value of x3");
        a3=sc.nextInt();
        System.out.println("Enter value of y3");
        b3=sc.nextInt();
        System.out.println("Enter value of x4");
        a4=sc.nextInt();
        System.out.println("Enter value of y4");
        b4=sc.nextInt();
        Double length2=Math.sqrt((a4-a3)*(a4-a3)+(b4-b3)*(b4-b3));
        System.out.println("The length of line2 is" +length2);

        System.out.println(length1 + ".compareTo " +length2+ ":" +length1.compareTo(length2));

    }
}
