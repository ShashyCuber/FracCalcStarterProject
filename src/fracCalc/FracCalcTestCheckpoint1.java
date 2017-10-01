package fracCalc;

import org.junit.Test;

// Checkpoint 1-only tests
public class FracCalcTestCheckpoint1
{
    @Test public void testCheckpoint1_1() {FracCalcTestALL.assertForCheckpoint1AndLater("6_5/8","whole:6 numerator:5 denominator:8",  "12_3/8",  FracCalc.produceAnswer("5_3/4 + 6_5/8"));}
    @Test public void testCheckpoint1_2() {FracCalcTestALL.assertForCheckpoint1AndLater("20", 	"whole:20 numerator:0 denominator:1", "-19_4/7", FracCalc.produceAnswer("3/7 - 20"));}
    @Test public void testCheckpoint1_3() {FracCalcTestALL.assertForCheckpoint1AndLater("27/21","whole:0 numerator:27 denominator:21","30_5/7",  FracCalc.produceAnswer("32 - 27/21"));}
    @Test public void testCheckpoint1_4() {FracCalcTestALL.assertForCheckpoint1AndLater("7003","whole:7003 numerator:0 denominator:1","224096",  FracCalc.produceAnswer("32 * 7003"));}
}
