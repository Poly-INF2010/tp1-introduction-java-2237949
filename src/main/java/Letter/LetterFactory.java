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
        Rectangle secondRectangle = new Rectangle(halfStripeThickness, maxHeight);
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
        Circle circle = new Circle(halfMaxHeight * 1.53);
        Circle secondCircle = new Circle(halfMaxHeight * 1.53);
        Circle thirdCircle = new Circle((halfMaxHeight*1.53)/1.5);
        Circle fourthCircle = new Circle((halfMaxHeight*1.53)/1.5);
        Point2d point = new Point2d(48.0, -19.0);
        Point2d point2 = new Point2d(48.0, 93.0);

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
        Ellipse ellipse = new Ellipse(halfMaxHeight, maxHeight * 1.5);
        Rectangle rectangle = new Rectangle(stripeThickness, maxHeight * 0.6);

        Ellipse ellipseRemove = new Ellipse(halfMaxHeight * 0.65, maxHeight * 1.5 * 0.87);
        ellipse.remove(ellipseRemove);

        Point2d point = new Point2d(halfMaxHeight * 0.3, -20.0);
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
        Rectangle firstRectangle = new Rectangle(halfStripeThickness,maxHeight);
        Rectangle secondRectangle = new Rectangle(halfStripeThickness, halfMaxHeight * 0.7);
        Rectangle thirdRectangle = new Rectangle(halfStripeThickness, halfMaxHeight * 0.7);
        Rectangle fourthRectangle = new Rectangle(halfStripeThickness, halfMaxHeight * 0.7);

        secondRectangle.rotate(secondRectangle.getCoords(), 1.57);
        thirdRectangle.rotate(thirdRectangle.getCoords(), 1.57);
        fourthRectangle.rotate(fourthRectangle.getCoords(), 1.57);

        Point2d point = new Point2d(80.0 * 0.7, -70.0);
        Point2d point2 = new Point2d(80.0 * 0.7, 40.0);
        Point2d point3 = new Point2d(80.0 * 0.7, 140.0);
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
        Rectangle thirdRectangle = new Rectangle(stripeThickness , maxHeight);
        Point2d translationVector = new Point2d(70.0, 30.0);
        secondRectangle.rotate(secondRectangle.getCoords(), 1.57);
        secondRectangle.translate(secondRectangle.getCoords(), translationVector);

        Point2d secondTranslationVector = new Point2d(110.0, 0.0);
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
        Rectangle secondRectangle = new Rectangle(halfStripeThickness, maxHeight + 3);
        Rectangle thirdRectangle = new Rectangle(halfStripeThickness , maxHeight);
        Point2d translationVector = new Point2d(32.0, 5.0);
        secondRectangle.rotate(secondRectangle.getCoords(), -0.40);
        secondRectangle.translate(secondRectangle.getCoords(), translationVector);
        Point2d point = new Point2d(91.0, 0.0);
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
        Ellipse ellipse = new Ellipse(halfMaxHeight, maxHeight * 1.5);
        Ellipse ellipseRemove = new Ellipse(halfMaxHeight * 0.65, maxHeight * 1.5 * 0.87);
        ellipse.remove(ellipseRemove);
        BaseShape shape = new BaseShape();
        shape.add(ellipse);
        return shape;
    }

}
