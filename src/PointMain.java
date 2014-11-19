// A program that deals with 2D points.
// Second version, to accompany Point class with behavior.

public class PointMain {
    public static void main(String[] args) {
        // create two Point objects
        Point p1 = new Point();
        p1.setX(7);
        p1.setY(2);

        Point p2 = new Point();
        p2.setX(4);
        p2.setY(3);

        // print each point and its distance from origin
        System.out.println("p1 is " + p1.toString());
        System.out.println("distance from origin = " + p1.distanceFromOrigin());

        System.out.println("p2 is " + p2.toString());
        System.out.println("distance from origin = " + p2.distanceFromOrigin());
         
        // print the distance between the two points
        System.out.println("distance between p1 & p2 = " + p1.distance(p2));

        // translate each point to a new location
        p1.translate(11, 6);
        p2.translate(1, 7);

        // print each point and its distance from origin
        System.out.println("p1 is " + p1.toString());
        System.out.println("distance from origin = " + p1.distanceFromOrigin());

        System.out.println("p2 is " + p2.toString());
        System.out.println("distance from origin = " + p2.distanceFromOrigin());
         
        // print the distance between the two points
        System.out.println("distance between p1 & p2 = " + p1.distance(p2));
    }
}
