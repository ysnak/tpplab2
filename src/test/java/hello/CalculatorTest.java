package hello;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

  @Test
  public void test1(){
    Calculator calculator = new Calculator();
    double value = calculator.calculate("30+35*2");
    assertEquals(100D, value);
  }
  
  //@Test
  //public void test2(){
  //  Calculator calculator = new Calculator();
  //  double value = calculator.calculate("20+20/2");
  //  assertEquals(300D, value);
  //}
}
