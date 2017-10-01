package fracCalc;

import org.junit.Test;

//Checkpoint 5-only tests
public class FracCalcTestCheckpoint5 {

    @Test public void testCheckpoint3_AdditionSimple3() {FracCalcTestALL.assertForCheckpoint3AndLater("4_3/7", FracCalc.produceAnswer("1_1/7 + 3_2/7"));}
    @Test public void testCheckpoint3_AdditionWholeNumbers2() {FracCalcTestALL.assertForCheckpoint3AndLater("1", FracCalc.produceAnswer("2/3 + 1/3"));}
    @Test public void testCheckpoint3_AdditionWholeNumbers7() {FracCalcTestALL.assertForCheckpoint3AndLater("1021778", FracCalc.produceAnswer("124543 + 897235"));}
    @Test public void testCheckpoint3_AdditionDifferentDenominators1() {FracCalcTestALL.assertForCheckpoint3AndLater("1_1/20", FracCalc.produceAnswer("4/5 + 2/8"));}
    @Test public void testCheckpoint3_AdditionCombined4() { FracCalcTestALL.assertForCheckpoint3AndLater("62_11/19", FracCalc.produceAnswer("0 + 34_543/19"));}

}
