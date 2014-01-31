import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RectangleTest {
    @Test
    public void testCalculateAreaWillGiveAreaOfRectangle() {
        Rectangle rect = Rectangle.getRectangle(2, 3);
        assertEquals(6,rect.getArea());
    }


    @Test
    public void testGetParameterWillGiveParameterOfRectangle() {
        Rectangle rectangle = Rectangle.getRectangle(2,3);

        assertEquals(10, rectangle.getPerimeter());
    }

    @Test
    public void testGetAreaWillGiveAreaOfSquare(){
        Rectangle square = Rectangle.getSquare(3);
        assertEquals(9,square.getArea());
    }
    @Test
    public void testGetParameterWillGiveParameterOfSquare(){
        Rectangle square = Rectangle.getSquare(3);
        assertEquals(12,square.getPerimeter());
    }

}
