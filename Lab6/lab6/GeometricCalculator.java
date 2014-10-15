public class GeometricCalculator {

    public static double calculateSphereVolume(double radius) {
        double volume;
        volume = (4/3) * (Math.PI) * radius * radius * radius;
        return volume;
    }

    public static double calculateTriangleArea(double a, double b, double c) {
        double area;
        double s;
        s = (a+b+c);
        area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
        return area;
    }

    public static double calculateCylinderVolume(double radius, double height) {
        double volume;
        volume = (Math.PI) * radius * radius * height;
        return volume;
    }

    public static double calculateSphereSurfaceArea(double radius) {
        double sphereSurfaceArea;
        sphereSurfaceArea = (4*Math.PI*Math.pow(radius, 2));
        return sphereSurfaceArea;
    }

    public static double calculateCylinderSurfaceArea(double radius, double height) {
        double cylSurfaceArea;
        cylSurfaceArea = (2 * Math.PI * radius * height);
        return cylSurfaceArea;
    }

}
