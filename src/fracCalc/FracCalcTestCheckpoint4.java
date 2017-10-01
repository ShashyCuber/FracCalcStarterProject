package fracCalc;

import org.junit.Test;

//Checkpoint 4-only tests
public class FracCalcTestCheckpoint4 {
    @Test public void testCheckpoint3_DivisionBasic1()	  {FracCalcTestALL.assertForCheckpoint3AndLater("9/16", FracCalc.produceAnswer("3/4 / 4/3"));}
    @Test public void testCheckpoint3_DivisionBasic2()    {FracCalcTestALL.assertForCheckpoint3AndLater("2_1/4",FracCalc.produceAnswer("3/2 / 2/3"));}
    @Test public void testCheckpoint3_DivisionBasic3()    {FracCalcTestALL.assertForCheckpoint3AndLater("2", 	FracCalc.produceAnswer("10/7 / 5/7"));}
    @Test public void testCheckpoint3_DivisionBasic4()    {FracCalcTestALL.assertForCheckpoint3AndLater("1/18", FracCalc.produceAnswer("2/3 / 12"));}
    @Test public void testCheckpoint3_DivisionBasic5()    {FracCalcTestALL.assertForCheckpoint3AndLater("8", 	FracCalc.produceAnswer("24 / 3"));}
    @Test public void testCheckpoint3_DivisionBasic6()    {FracCalcTestALL.assertForCheckpoint3AndLater("4_4/5",FracCalc.produceAnswer("24 / 5"));}
    @Test public void testCheckpoint3_DivisionBasic7()    {FracCalcTestALL.assertForCheckpoint3AndLater("18",	FracCalc.produceAnswer("24 / 1_1/3"));}
    @Test public void testCheckpoint3_DivisionBasic8()    {FracCalcTestALL.assertForCheckpoint3AndLater("2_2/5",FracCalc.produceAnswer("3_1/5 / 1_1/3"));}
    @Test public void testCheckpoint3_DivisionWithZero5() {FracCalcTestALL.assertForCheckpoint3AndLater("0", 	FracCalc.produceAnswer("0 / 46/27"));}
    @Test public void testCheckpoint3_DivisionWithZero6() {FracCalcTestALL.assertForCheckpoint3AndLater("0", 	FracCalc.produceAnswer("0/24 / 1/46"));}

}
