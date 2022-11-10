import java.util.Scanner;
public class CircelAreaAndPerimeterCalculating {
    public static void main(String[] args) {


        int radius,angle;
        double area,perimeter, PI = 3.14;
        double segment,segmentArea;


        Scanner input = new Scanner(System.in);
        System.out.print("Enter radius value: ");
        radius = input.nextInt();

        System.out.print("Enter angle value: ");
        angle = input.nextInt();

        area =  PI * radius * radius;
        perimeter = 2 * PI * radius;
        segmentArea =(( PI * (radius * radius) * angle) / 360);

        System.out.println("Area:"+ area + " " + "Perimeter " + perimeter + " " + "Area of The Circle Segment: " + segmentArea);






    }
}
