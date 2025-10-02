public class Main {
    public static void attemptToChangePrimitive(int val) {
        System.out.println("Inside method, parameter 'val' starts as: " + val);
        val = 99; // Local change
        System.out.println("Inside method, parameter 'val' is now: " + val);
    }


    //Exercise 2
    public static void resetPoint(Point p) {
        p.move(0,0);
        p = new Point(0,0);
        System.out.println("Inside method, parameter 'p' starts as: " + p);
    }


    // Used for Exercise 5
    public static int sumCoordinates(Point... points) {
        // Implementation needed for Exercise 5
        int sum = 0;
        for (Point p : points) {
            sum += p.x;
        }
        return sum;
    }


    public static void main(String[] args) {
        // --- Implement all exercises here ---
        //Exercise 1
        Point startPoint = new Point(10,20);
        System.out.println("startPoint x: " + startPoint.x);
        startPoint.move(5, -3);
        startPoint.printState();


        //Exercise 2
        int originalValue = 50;
        System.out.println("before originalValue: " + originalValue);
        attemptToChangePrimitive(originalValue);
        System.out.println("after originalValue: " + originalValue);


        Point refPoint = new Point(7,8);
        System.out.println("Before refPoint x: " + refPoint.x);
        refPoint.printState();
        resetPoint(refPoint);
        System.out.println("after refPoint x: " + refPoint.x);
        refPoint.printState();


        //Exercise 3
        Point defaultPoint = new Point();
        defaultPoint.printState();


        //Exercise 4
        Microwave mw = new Microwave (1200,90);
        mw.printDescription();


        //Exercise 5
        Point p1 = new Point (1,2);
        Point p2 = new Point (3,4);
        Point p3 = new Point (5,6);
        int totalX = sumCoordinates(p1, p2, p3);
        System.out.println("Sum of x coordinates: " + totalX);
        Point[] pointArray = {p1,p2,p3};
        totalX = sumCoordinates(pointArray);
        System.out.println("Sum of x coordinates: " + totalX);


        //Exercise 7
        Device d1 = new Device (500);
        Microwave m1 = new Microwave(800, 60);
        Device polyDevice = m1;
        polyDevice.printDescription();


        //Exercise 8
        if (polyDevice instanceof Microwave) {
            Microwave realMicrowave = (Microwave) polyDevice;
            realMicrowave.heatFood();
        }else {
            System.out.println("polyDevice is not a Microwave");
        }
    }


}
