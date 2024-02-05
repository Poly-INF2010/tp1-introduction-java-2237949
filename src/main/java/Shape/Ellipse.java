package Shape;

import Point.Point2d;

import java.util.Collection;

public class Ellipse extends BaseShape {
    /** TODO
     * Create a filled Ellipse that is centered on (0, 0)
     * @param widthDiameter Width of the Ellipse
     * @param heightDiameter Height of the Ellipse
     */
    public Ellipse(Double widthDiameter, Double heightDiameter) {
        for(double i = -widthDiameter/2; i < widthDiameter/2; i+=0.5)
        {
            for(double j = -heightDiameter/2; j < heightDiameter/2; j+= 0.5){
                double equation = (Math.pow(i,2))/Math.pow(widthDiameter/2,2) + (Math.pow(j,2))/Math.pow(heightDiameter/2,2);
                if(equation <= 1){
                    Point2d point = new Point2d(i, j);
                    this.add(point);
                }
            }
        }

    }

    /** TODO
     * Create a filled Ellipse that is centered on (0,0)
     * @param dimensions 2D point containing the width and height of the Ellipse
     */
    public Ellipse(Point2d dimensions) {
        this(dimensions.X(), dimensions.Y());
    }

    /**
     * Create an Ellipse from a given collection of 2D points
     * @param coords Collection of 2D points
     */
    private Ellipse(Collection<Point2d> coords) {
        BaseShape shape = new BaseShape();
        for(Point2d element: coords)
        {
            shape.add(element);
        }
    }

    /** TODO
     * @return Deep Copy of the Ellipse
     */
    @Override
    public Ellipse clone() {
        return new Ellipse(this.cloneCoords());
    }
}
