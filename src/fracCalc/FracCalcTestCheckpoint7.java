package fracCalc;

import org.junit.Test;

//Checkpoint 7-only tests
public class FracCalcTestCheckpoint7
{
 @Test public void testCheckpoint3_AdditionWithNegatives1() 	  {FracCalcTestALL.assertForCheckpoint3AndLater("2", 			FracCalc.produceAnswer("4 + -2"));}
 @Test public void testCheckpoint3_AdditionWithNegatives2() 	  {FracCalcTestALL.assertForCheckpoint3AndLater("-14/15", 		FracCalc.produceAnswer("-3_3/5 + 2_2/3"));}
 @Test public void testCheckpoint3_AdditionWithNegatives3() 	  {FracCalcTestALL.assertForCheckpoint3AndLater("-6_1/4", 		FracCalc.produceAnswer("-3_3/4 + -2_1/2"));}
 @Test public void testCheckpoint3_SubtractionWithNegatives3() 	  {FracCalcTestALL.assertForCheckpoint3AndLater("-1_1/4", 		FracCalc.produceAnswer("-3_3/4 - -2_2/4"));}
 @Test public void testCheckpoint3_SubtractionCombined2() 		  {FracCalcTestALL.assertForCheckpoint3AndLater("8_5/21", 		FracCalc.produceAnswer("-12_3/7 - -20_2/3"));}
 @Test public void testCheckpoint3_MultiplicationWithNegatives2() {FracCalcTestALL.assertForCheckpoint3AndLater("-8", 			FracCalc.produceAnswer("-12/3 * 2/1"));}
 @Test public void testCheckpoint3_MultiplicationWithNegatives6() {FracCalcTestALL.assertForCheckpoint3AndLater("15_5/7", 		FracCalc.produceAnswer("-3_2/3 * -4_2/7"));}
 @Test public void testCheckpoint3_MultiplicationCombined1()	  {FracCalcTestALL.assertForCheckpoint3AndLater("1065_115/168", FracCalc.produceAnswer("-32_75/16 * -27_43/21"));}
 @Test public void testCheckpoint3_MultiplicationCombined2() 	  {FracCalcTestALL.assertForCheckpoint3AndLater("-15_67/943", 	FracCalc.produceAnswer("1_27/41 * -3_140/23"));}
 @Test public void testCheckpoint3_DivisionWithNegatives5() 	  {FracCalcTestALL.assertForCheckpoint3AndLater("-2_6/7", 		FracCalc.produceAnswer("-20 / 7"));}
 @Test public void testCheckpoint3_DivisionWithNegatives6() 	  {FracCalcTestALL.assertForCheckpoint3AndLater("1_13/32", 		FracCalc.produceAnswer("-3_3/4 / -2_2/3"));}
 @Test public void testCheckpoint3_DivisionCombined2() 			  {FracCalcTestALL.assertForCheckpoint3AndLater("-2_2/3", 		FracCalc.produceAnswer("16/4 / -3/2"));}
 @Test public void testCheckpoint3_DivisionCombined3() 			  {FracCalcTestALL.assertForCheckpoint3AndLater("6_661/5520", 	FracCalc.produceAnswer("-38_3/72 / -4_82/37"));}
 
}
