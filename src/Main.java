public class Main {
    public static void main(String[] args) {
        int [] rectanglePoints = new int[8];
        int [] dotPoints = new int[2];
        Compute compute = new Compute();
        compute.readRectanglePosition(rectanglePoints);
        compute.readDotPosition(dotPoints);
        compute.rectangleContainsDot(rectanglePoints,dotPoints);
    }
    }

