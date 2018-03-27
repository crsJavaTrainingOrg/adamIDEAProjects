package hu.adam.codeWarsExercises.sixKyuExercises.AreaOfPolygon;


public class AreaOfPolygon {
    public static double areaOfPolygonInsdeACircle(double circleRadius, double numberOfSides){
        double anglePerTriangles = 360/numberOfSides;
        double apothem = circleRadius * Math.cos(Math.toRadians(anglePerTriangles/2));
        double lengthOfSides = (apothem * Math.tan(Math.toRadians(anglePerTriangles/2)))*2;
        double perimiter = lengthOfSides * numberOfSides;
        double areaOfPolygon = (double)Math.round((0.5 * perimiter * apothem) * 1000d) /1000d;
        System.out.println(areaOfPolygon);
        return areaOfPolygon;
    }
}
