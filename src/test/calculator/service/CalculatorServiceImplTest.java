package test.calculator.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static test.calculator.calculatorConstans.*;


class CalculatorServiceImplTest {

    private final CalculatorServiceImpl out = new CalculatorServiceImpl();

    @Test
    void plus() {
        Integer result1 = out.plus(num1,num2);
        Integer plus1 = num1+num2;
        Assertions.assertEquals(plus1,result1);
        Integer result2 = out.plus(num3,num4);
        Integer plus2 = num3+num4;
        Assertions.assertEquals(plus2,result2);
    }

    @Test
    void minus() {
        Integer result1 = out.minus(num1,num2);
        Integer minus1 = num1-num2;
        Assertions.assertEquals(minus1,result1);
        Integer result2 = out.minus(num3,num4);
        Integer minus2 = num3-num4;
        Assertions.assertEquals(minus2,result2);
    }

    @Test
    void multiply() {
        Integer result1 = out.multiply(num1,num2);
        Integer multiply1 = num1*num2;
        Assertions.assertEquals(multiply1,result1);
        Integer result2 = out.multiply(num3,num4);
        Integer multiply2 = num3*num4;
        Assertions.assertEquals(multiply2,result2);
    }

    @Test
    void divide() {
        Integer result1 = out.divide(num1,num2);
        Integer divide1 = num1/num2;
        Assertions.assertEquals(divide1,result1);
        Integer result2 = out.divide(num3,num4);
        Integer divide2 = num3/num4;
        Assertions.assertEquals(divide2,result2);
    }
    @Test
     void divideByZero() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> out.divide(num1,num5));
    }
}