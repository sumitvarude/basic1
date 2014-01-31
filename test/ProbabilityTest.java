import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ProbabilityTest {
    @Test
    public void testWillGiveProbability(){
        Probability probability = new Probability(0.2);
        assertEquals(0.2,probability.getValue(),0.0);
    }

    @Test
    public void testWillGiveInverseProbability(){
        Probability probability = new Probability(0.3);
        assertEquals(new Probability(0.7),probability.getInverseProbability());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWillValidateProbability(){
        Probability probability = new Probability(5);
    }
    @Test
    public void testWillGive(){
        Probability probability = new Probability(2,4);
        Probability expected = new Probability(0.5);
        assertEquals(expected,probability);
    }
    @Test
    public void testWillGiveANDResult(){
        Probability probability1 = new Probability(0.3);
        Probability probability2 = new Probability(0.4);
        Probability expected = new Probability(0.12);
        Probability result = probability1.and(probability2);
        assertEquals(expected,result);
    }

    @Test
    public void testWillGiveORResult(){
        Probability p1 = new Probability(0.5);
        Probability p2 = new Probability(0.5);
        Probability expected = new Probability(0.75);
        Probability result = p1.or(p2);
        assertEquals(expected,result);
    }
    @Test
    public void testWillGiveXORResult(){
        Probability p1 = new Probability(0.5);
        Probability p2 = new Probability(0.5);
        Probability expected = new Probability(0.5);
        Probability result = p1.xOr(p2);
        assertEquals(expected,result);
    }

}
