import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LengthTest {
    @Test
    public void testWillGiveLengthAndUnitOfLengthCentimeter(){
        Length length = new Length(10,new Centimeter());
        assertEquals(10,length.getValue(),0.0);
        assertEquals(new Centimeter(),length.getUnit());
    }
    @Test
    public void testWillGiveLengthAndUnitOfLengthAsMeter(){
        Length length = new Length(10,new Meter());
        assertEquals(10,length.getValue(),0.0);
        assertEquals(new Meter(),length.getUnit());
    }
    @Test(expected = IllegalArgumentException.class)
    public void testWillNotTakeWrongLength(){
        new Length(-10,new Centimeter());
    }

    @Test
    public void testWillConvertMillimeterToCentimeter(){
        Length length = new Length(1,new Millimeter());
        Length length1 = length.convertTo(new Centimeter());

        assertEquals(true,length.equals(length1));
    }

    @Test
    public void testWillConvertMillimeterToMeter(){
        Length length = new Length(1,new Millimeter());
        Length length1 = length.convertTo(new Meter());

        assertEquals(true,length.equals(length1));
    }
}



