package fracCalc;

import org.junit.Test;

//Checkpoint 6-only tests
public class FracCalcTestCheckpoint6 {
    @Test public void testCheckpoint3_Subtraction1() {FracCalcTestALL.assertForCheckpoint3AndLater("0", 	 FracCalc.produceAnswer("4_1/2 - 4_1/2"));}
    @Test public void testCheckpoint3_Subtraction2() {FracCalcTestALL.assertForCheckpoint3AndLater("5", 	 FracCalc.produceAnswer("7_1/2 - 2_1/2"));}
    @Test public void testCheckpoint3_Subtraction3() {FracCalcTestALL.assertForCheckpoint3AndLater("1/3", 	 FracCalc.produceAnswer("1/2 - 1/6"));}
    @Test public void testCheckpoint3_Subtraction4() {FracCalcTestALL.assertForCheckpoint3AndLater("1/24", 	 FracCalc.produceAnswer("7/8 - 5/6"));}
    @Test public void testCheckpoint3_Subtraction5() {FracCalcTestALL.assertForCheckpoint3AndLater("-1_1/4", FracCalc.produceAnswer("2_2/4 - 3_3/4"));}

}
