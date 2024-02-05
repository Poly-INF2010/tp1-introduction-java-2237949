package Letter;

import Point.Point2d;
import Shape.*;
import org.w3c.dom.css.Rect;

import java.util.ArrayList;
import java.util.Collection;

public final class LetterFactory {
    final static Double maxHeight = 150.0;
    final static Double maxWidth = maxHeight / 2.5;
    final static Double halfMaxHeight = maxHeight / 2;
    final static Double halfMaxWidth = maxWidth / 2;
    final static Double stripeThickness = maxHeight / 8;
    final static Double halfStripeThickness = stripeThickness / 2;


    /** TODO
     * Create the letter A graphically
     * @return BaseShape containing the letter A
     */
    public static BaseShape create_A()  {
        Rectangle firstRectangle = new Rectangle(halfStripeThickness, maxHeight);
        Rectangle secondRectangle = firstRectangle.clone();
        Rectangle thirdRectangle = new Rectangle(halfStripeThickness, 20.0);

        firstRectangle.rotate(firstRectangle.getCoords(), 0.18);
        secondRectangle.rotate(secondRectangle.getCoords(), -0.18);
        Point2d point = new Point2d(halfMaxWidth, 0.0);
        secondRectangle.translate(secondRectangle.getCoords(), point);
        thirdRectangle.rotate(thirdRectangle.getCoords(), 1.57);
        Point2d point2 = new Point2d(14.0, 12.0);
        thirdRectangle.translate(thirdRectangle.getCoords(), point2);

        BaseShape shape = new BaseShape();
        shape.add(firstRectangle);
        shape.add(secondRectangle);
        shape.add(thirdRectangle);
        return shape;
    }

    /** TODO
     * Create the letter B graphically
     * @return BaseShape containing the letter B
     */
    public static BaseShape create_B() {
        Rectangle rectangle = new Rectangle(stripeThickness + 3, maxHeight);
        Circle circle = new Circle(halfMaxHeight);
        Circle secondCircle = new Circle(halfMaxHeight);
        Circle thirdCircle = new Circle((halfMaxHeight)/1.4);
        Circle fourthCircle = new Circle((halfMaxHeight)/1.4);
        Point2d point = new Point2d(circle.getMaxX(), -rectangle.getMaxY()/2);
        Point2d point2 = new Point2d(circle.getMaxX(), rectangle.getMaxY()/2);

        circle.translate(circle.getCoords(), point);
        secondCircle.translate(secondCircle.getCoords(), point2);
        thirdCircle.translate(thirdCircle.getCoords(), point);
        fourthCircle.translate(fourthCircle.getCoords(), point2);
        circle.remove(thirdCircle);
        secondCircle.remove(fourthCircle);
        BaseShape shape = new BaseShape();
        shape.add(rectangle);
        shape.add(circle);
        shape.add(secondCircle);

        return shape;
    }

    /** TODO
     * Create the letter C graphically
     * @return BaseShape containing the letter C
     */
    public static BaseShape create_C() {
        Ellipse ellipse = new Ellipse(maxWidth, maxHeight);
        Rectangle rectangle = new Rectangle(stripeThickness, maxHeight * 0.6);

        Ellipse ellipseRemove = new Ellipse(maxWidth * 0.65, maxHeight * 0.8);
        ellipse.remove(ellipseRemove);

        Point2d point = new Point2d(halfMaxHeight * 0.3, 0.0);
        rectangle.translate(rectangle.getCoords(), point);
        ellipse.remove(rectangle);

        BaseShape shape = new BaseShape();
        shape.add(ellipse);
        return shape;
    }

    /** TODO
     * Create the letter E graphically
     * @return BaseShape containing the letter E
     */
    public static BaseShape create_E() {
        Rectangle firstRectangle = new Rectangle(halfStripeThickness,maxHeight - 10);
        Rectangle secondRectangle = new Rectangle(halfStripeThickness, maxWidth);
        Rectangle thirdRectangle = secondRectangle.clone();
        Rectangle fourthRectangle = secondRectangle.clone();

        double rotation = 1.57;
        secondRectangle.rotate(secondRectangle.getCoords(), rotation);
        thirdRectangle.rotate(thirdRectangle.getCoords(), rotation);
        fourthRectangle.rotate(fourthRectangle.getCoords(), rotation);

        double yTranslation = secondRectangle.getMaxX() - 5;
        Point2d point = new Point2d(yTranslation, -firstRectangle.getMaxY() - 3);
        Point2d point2 = new Point2d(yTranslation, 0.0);
        Point2d point3 = new Point2d(yTranslation, firstRectangle.getMaxY() - 3);
        secondRectangle.translate(secondRectangle.getCoords(), point);
        thirdRectangle.translate(thirdRectangle.getCoords(), point2);
        fourthRectangle.translate(fourthRectangle.getCoords(), point3);

        BaseShape shape = new BaseShape();
        shape.add(firstRectangle);
        shape.add(secondRectangle);
        shape.add(thirdRectangle);
        shape.add(fourthRectangle);

        return shape;
    }

    /** TODO
     * Create the letter H graphically
     * @return BaseShape containing the letter H
     */
    public static BaseShape create_H() {
        Rectangle firstRectangle = new Rectangle(stripeThickness, maxHeight);
        Rectangle secondRectangle = new Rectangle(stripeThickness, halfMaxHeight);
        Rectangle thirdRectangle = firstRectangle.clone();
        Point2d translationVector = new Point2d(secondRectangle.getMaxY(), 0.0);
        secondRectangle.rotate(secondRectangle.getCoords(), 1.57);
        secondRectangle.translate(secondRectangle.getCoords(), translationVector);

        Point2d secondTranslationVector = new Point2d(secondRectangle.getMaxX(), 0.0);
        thirdRectangle.translate(thirdRectangle.getCoords(), secondTranslationVector);

        BaseShape shape = new BaseShape();
        shape.add(firstRectangle);
        shape.add(secondRectangle);
        shape.add(thirdRectangle);
        return shape;
    }

    /** TODO
     * Create the letter N graphically
     * @return BaseShape containing the letter N
     */
    public static BaseShape create_N() {
        Rectangle firstRectangle = new Rectangle(halfStripeThickness, maxHeight);
        Rectangle secondRectangle = new Rectangle(halfStripeThickness, maxHeight + 8);
        Rectangle thirdRectangle = firstRectangle.clone();
        Point2d translationVector = new Point2d(halfMaxWidth, 0.0);
        secondRectangle.rotate(secondRectangle.getCoords(), -0.38);
        secondRectangle.translate(secondRectangle.getCoords(), translationVector);
        Point2d point = new Point2d(secondRectangle.getMaxX(), 0.0);
        thirdRectangle.translate(thirdRectangle.getCoords(), point);
        BaseShape shape = new BaseShape();
        shape.add(firstRectangle);
        shape.add(secondRectangle);
        shape.add(thirdRectangle);
        return shape;
    }

    /** TODO
     * Create the letter O graphically
     * @return BaseShape containing the letter O
     */
    public static BaseShape create_O() {
        Ellipse ellipse = new Ellipse(maxWidth, maxHeight);
        Ellipse ellipseRemove = new Ellipse(maxWidth * 0.65, maxHeight * 0.8);
        ellipse.remove(ellipseRemove);
        BaseShape shape = new BaseShape();
        shape.add(ellipse);
        return shape;
    }

}
