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
    public void testWillConvertCentimeterToMillimeter(){
        Length length = new Length(1,new Centimeter());
        Length length1 = length.convertTo(new Millimeter());

        assertEquals(true,length.equals(length1));
    }

    @Test
    public void testWillConvertMeterToMillimeter(){
        Length length = new Length(1,new Meter());
        Length length1 = length.convertTo(new Millimeter());

        assertEquals(true,length.equals(length1));
    }

    @Test
    public void testWillConvertKmToMillimeter(){
        Length length = new Length(1,new Kilometer());
        Length length1 = length.convertTo(new Millimeter());

        assertEquals(true,length.equals(length1));
    }

    @Test
    public void testWillConvertFootToMillimeter(){
        Length length = new Length(1,new Foot());
        Length length1 = length.convertTo(new Millimeter());

        assertEquals(true,length.equals(length1));
    }

    @Test
    public void testWillConvertInchToMillimeter(){
        Length length = new Length(1,new Inch());
        Length length1 = length.convertTo(new Millimeter());

        assertEquals(true,length.equals(length1));
    }

    @Test
    public void testWillConvertYardsToMillimeter(){
        Length length = new Length(1,new Yard());
        Length length1 = length.convertTo(new Millimeter());

        assertEquals(true,length.equals(length1));
    }

    @Test
    public void testWillConvertMilesToMillimeter(){
        Length length = new Length(1,new Mile());
        Length length1 = length.convertTo(new Millimeter());

        assertEquals(true,length.equals(length1));
    }



    @Test
    public void testWillConvertMillimeterToCentimeter(){
        Length length = new Length(1000,new Millimeter());
        Length length1 = length.convertTo(new Centimeter());

        assertEquals(true,length.equals(length1));
    }
    @Test
    public void testWillConvertMeterToCentimeter(){
        Length length = new Length(1,new Meter());
        Length length1 = length.convertTo(new Centimeter());

        assertEquals(true,length.equals(length1));
    }
    @Test
     public void testWillConvertKmToCentimeter(){
        Length length = new Length(1,new Kilometer());
        Length length1 = length.convertTo(new Centimeter());

        assertEquals(true,length.equals(length1));
    }
    @Test
    public void testWillConvertInchToCentimeter(){
        Length length = new Length(1,new Inch());
        Length length1 = length.convertTo(new Centimeter());

        assertEquals(true,length.equals(length1));
    }

    @Test
    public void testWillConvertFootToCentimeter(){
        Length length = new Length(1,new Foot());
        Length length1 = length.convertTo(new Centimeter());

        assertEquals(true,length.equals(length1));
    }
    @Test
     public void testWillConvertYardsToCentimeter(){
        Length length = new Length(1,new Yard());
        Length length1 = length.convertTo(new Centimeter());

        assertEquals(true,length.equals(length1));
    }
    @Test
     public void testWillConvertMileToCentimeter(){
        Length length = new Length(1,new Mile());
        Length length1 = length.convertTo(new Centimeter());

        assertEquals(true,length.equals(length1));
    }




    @Test
    public void testWillConvertMillimeterToMeter(){
        Length length = new Length(1,new Millimeter());
        Length length1 = length.convertTo(new Meter());

        assertEquals(true,length.equals(length1));
    }

    @Test
    public void testWillConvertCentimeterToMeter(){
        Length length = new Length(1,new Centimeter());
        Length length1 = length.convertTo(new Meter());

        assertEquals(true,length.equals(length1));
    }
    @Test
    public void testWillConvertKilometerToMeter(){
        Length length = new Length(1,new Kilometer());
        Length length1 = length.convertTo(new Meter());

        assertEquals(true,length.equals(length1));
    }
    @Test
    public void testWillConvertInchToMeter(){
        Length length = new Length(1,new Inch());
        Length length1 = length.convertTo(new Meter());

        assertEquals(true,length.equals(length1));
    }
    @Test
    public void testWillConvertFootToMeter(){
        Length length = new Length(1,new Foot());
        Length length1 = length.convertTo(new Meter());

        assertEquals(true,length.equals(length1));
    }
    @Test
    public void testWillConvertYardsToMeter(){
        Length length = new Length(1,new Yard());
        Length length1 = length.convertTo(new Meter());

        assertEquals(true,length.equals(length1));
    }
    @Test
    public void testWillConvertMilesToMeter(){
        Length length = new Length(1,new Millimeter());
        Length length1 = length.convertTo(new Meter());

        assertEquals(true,length.equals(length1));
    }
}



