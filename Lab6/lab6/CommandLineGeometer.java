//********************************************
//Honor Code: The work I am submitting is a result of my own thinking and efforts.
//Dan Bonnett
//CMPSC 111 Fall 2014
//Lab 6
//October 9 2014
//
//Purpose: To go on a bug hunt and fix the errors.
// ********************************************


import java.util.Date;
import java.util.Scanner;
import java.text.DecimalFormat;

public class CommandLineGeometer {

    private enum GeometricShape {sphere, triangle, cylinder};

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        GeometricShape shape = GeometricShape.sphere;
        double sphereVolume;
        double surfaceArea;
        double radius;
        double height;
        double sphereSurfaceArea;
        double cylSurfaceArea;
        double cylinderVolume;
        double triangleArea;
        int x;
        int y;
        int z;
        int s;


        System.out.println("Dan Bonnett " + new Date());
        System.out.println("Welcome to the Command Line Geometer!");
        System.out.println();

        System.out.println("What is the radius for the " + shape + "?");
        radius = scan.nextDouble();
        System.out.println();

        System.out.println("Calculating the volume of a " + shape + " with radius equal to " + radius);
        DecimalFormat fmt = new DecimalFormat("0.####");    //gives us an answer with four decimal places
        sphereVolume = GeometricCalculator.calculateSphereVolume(radius);
        sphereVolume = (4/3) * Math.PI * Math.pow(radius, 3);
        System.out.println("The volume is equal to " + fmt.format(sphereVolume));
        System.out.println();

        shape = GeometricShape.triangle;    //changes the shape from a sphere to a triangle


        System.out.println("What is the length of the first side of the triangle?");
        x = scan.nextInt();

        System.out.println("What is the length of the second side?");
        y = scan.nextInt();

        System.out.println("What is the length of the third side?");
        z = scan.nextInt();
        System.out.println();

        s = (x + y +z);    //formula for the perimeter of a triangle
        System.out.println("The perimeter of the triangle is " +s);

        System.out.println("Calculating the area of a " + shape);
        triangleArea = GeometricCalculator.calculateTriangleArea(x, y, x);
        triangleArea = Math.sqrt(s*(s-x)*(s-y)*(s-z));
        System.out.println("The area is equal to " + fmt.format(triangleArea));
        System.out.println();

        shape = GeometricShape.cylinder;    //changes the shape from a triangle to a cylinder

        System.out.println("What is the radius for the " + shape + "?");
        radius = scan.nextDouble();
        System.out.println();

        System.out.println("What is the height for the " + shape + "?");
        height = scan.nextDouble();
        System.out.println();

        System.out.println("Calculating the volume of a " + shape + " with radius equal to " + radius + " and height equal to " + height);
        cylinderVolume = GeometricCalculator.calculateCylinderVolume(radius, height);
        cylinderVolume = (Math.PI * Math.pow(radius, 2) * height);
        System.out.println("The volume is equal to " + fmt.format(cylinderVolume));
        System.out.println();

        shape = GeometricShape.sphere;

        System.out.println("What is the radius for the " + shape + "?");
        radius = scan.nextDouble();
        System.out.println();

        System.out.println("Calculating the surface area of a " + shape + " with radius equal to " + radius);
        sphereSurfaceArea = GeometricCalculator.calculateSphereSurfaceArea(radius);
        sphereSurfaceArea = (4 * Math.PI * Math.pow(radius, 2));
        System.out.println("The surface area of the sphere is equal to " + fmt.format(sphereSurfaceArea));
        System.out.println();
    }
}
