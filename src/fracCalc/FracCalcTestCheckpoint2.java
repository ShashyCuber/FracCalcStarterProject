package fracCalc;

import org.junit.Test;

// Checkpoint 2-only tests
public class FracCalcTestCheckpoint2
{
    @Test public void testCheckpoint2_1() { FracCalcTestALL.assertForCheckpoint2AndLater("whole:6 numerator:5 denominator:8",  "12_3/8",  FracCalc.produceAnswer("5_3/4 + 6_5/8"));}
    @Test public void testCheckpoint2_2() { FracCalcTestALL.assertForCheckpoint2AndLater("whole:20 numerator:0 denominator:1", "-19_4/7", FracCalc.produceAnswer("3/7 - 20"));}
    @Test public void testCheckpoint2_3() { FracCalcTestALL.assertForCheckpoint2AndLater("whole:0 numerator:27 denominator:21","30_5/7",  FracCalc.produceAnswer("32 - 27/21"));}
    @Test public void testCheckpoint1_4() {	FracCalcTestALL.assertForCheckpoint2AndLater("whole:7003 numerator:0 denominator:1","224096",  FracCalc.produceAnswer("32 * 7003"));}


}
