package fracCalc;

import org.junit.Test;

// Checkpoint 3-only tests
public class FracCalcTestCheckpoint3
{
	@Test public void testCheckpoint3_MultiplicationBasic1() {  FracCalcTestALL.assertForCheckpoint3AndLater("3", 		FracCalc.produceAnswer("1_1/2 * 2"));}
	@Test public void testCheckpoint3_MultiplicationBasic2() {  FracCalcTestALL.assertForCheckpoint3AndLater("1/2", 	FracCalc.produceAnswer("1_1/2 * 1/3"));}
	@Test public void testCheckpoint3_MultiplicationBasic3() {  FracCalcTestALL.assertForCheckpoint3AndLater("1", 		FracCalc.produceAnswer("7/8 * 8/7"));}
    @Test public void testCheckpoint3_MultiplicationBasic4() {	FracCalcTestALL.assertForCheckpoint3AndLater("378/943", FracCalc.produceAnswer("27/41 * 14/23"));}
    @Test public void testCheckpoint3_MultiplicationBasic5() {	FracCalcTestALL.assertForCheckpoint3AndLater("164268", 	FracCalc.produceAnswer("234 * 702"));}
    @Test public void testCheckpoint3_MultiplicationByZero2() {	FracCalcTestALL.assertForCheckpoint3AndLater("0", 		FracCalc.produceAnswer("0 * 0"));}
    @Test public void testCheckpoint3_MultiplicationByZero3() {	FracCalcTestALL.assertForCheckpoint3AndLater("0", 		FracCalc.produceAnswer("0 * 9321"));}
}
