import java.util.Scanner;
public class Linecomparison {
        public  double Line1 (int x1 ,int x2, int y1 ,int y2) {
            double length ;
            double length2;
            double P = (x1-x2)*(x1-x2) + (y1-y2)*(y1-y2);
            double length1 = Math.sqrt(P);
            System.out.println(length1);
            return length1;
        }

        public double Line2 (int x3,int x4,int y3,int y4) {
            double M = (x3-x4)*(x3-x4) + (y3-y4)*(y3-y4);
            double length2 = Math.sqrt(M);
            System.out.println(length2);
            return length2;
        }
        public void  Check ( double length1 , double length2) {

            if (length1 == length2)
                System.out.println("length are equql");
            else if (length1 >length2)
                System.out.println("length1 is greter than length2");
            else
                System.out.println("length1 is less than length2");
        }
        public static void main(String[] args) {
            // TODO Auto-generated method stub
            Linecomparison L1 = new Linecomparison();
            double length1=L1.Line1(0,3,4,0);
            double length2=L1.Line2(0,4,4,0);
            L1.Check(length1, length2);
    }
}
