import static org.junit.Assert.*;

import java.beans.Transient;

import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}


  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }

  @Test
  public void testReversedInPlaceNew(){
    int[] input1 = { 3 , 4 , 5 , 6};
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 6, 5, 4, 3 }, input1);
  }

  @Test
  public void testReversedNew(){
    int[] input1 = { 3 , 4 , 5 , 6};
    assertArrayEquals(new int[]{ 6, 5 ,4, 3}, ArrayExamples.reversed(input1));
    }

  @Test
  public void testAverageLowestEmpty(){
    double[] input1 = { 3 };
    assertEquals(0.0, ArrayExamples.averageWithoutLowest(input1), 0);
  }

  @Test
  public void testAverageLowest(){
    double[] input1 = { 3, 3, 3, 4, 4, 4, 10 };
    assertEquals(4.66666, ArrayExamples.averageWithoutLowest(input1), 0.01);
  }
}
