import java.util.Scanner;

public class Point3d {

    private double x;
    private double y;
    private double z;

    Point3d(double x, double y, double z) {

        this.x = x;
        this.y = y;
        this.z = z;
    }

    Point3d() { 

        this.x = 0.0;
        this.y = 0.0;
        this.z = 0.0;
    }

    void SetX(double x) {
        
        this.x = x;
    }

    void SetY(double y) {

        this.y = y;
    }

    void SetZ(double z) {

        this.z = z;
    }

    double GetX() { 

        return x;
    }

    double GetY() { 

        return y;
    }

    double GetZ() { 

        return z;
    }

    public static boolean method(Point3d a, Point3d b) {

        return (a.x == b.x && a.y == b.y && a.z == b.z);
    }

    public static double distanceTo(Point3d a, Point3d b) {

        return Math.sqrt(Math.pow((b.x - a.x), 2) + Math.pow((b.y - a.y), 2) + Math.pow((b.z - a.z), 2));
    }

    public static void input(Point3d a) {

        Scanner n = new Scanner(System.in);
       
        System.out.print("x: ");
        double x = n.nextDouble();
        a.SetX(x);

        System.out.print("y: ");
        double y = n.nextDouble();
        a.SetY(y);

        System.out.print("z: ");
        double z = n.nextDouble();
        a.SetZ(z);
    }

    public static void output(Point3d a) {

        System.out.print("x = " + a.GetX() + '\n');
        System.out.print("y = " + a.GetY() + '\n');
        System.out.print("z = " + a.GetZ() + "\n");
    } 

    public static void main(String[] args) {

        Point3d first  = new Point3d(1.0, 2.0, 3.0);
        Point3d second = new Point3d();

        System.out.print("\n Enter the coordinates of the point: A \n");
        input(first);

        System.out.print("\n Enter the coordinates of the pont: B \n");
        input(second);

        System.out.print("\n The first point: \n");
        output(first);

        System.out.print("\n The second point: \n");
        output(second);

        if(Point3d.method(first, second))
            System.out.print("\n The points are equal! \n");
        else
            System.out.print("\n The points are not equal! \n");

        System.out.print("\n The distance between the two points in space: " + distanceTo(first, second) + "\n\n");
    }
}