package test.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import pro.sky.calculator.service.CalculatorServiceImpl;

import java.util.stream.Stream;

import static pro.sky.calculator.CalculatorConstans.*;


public class calculatorServiceImplTest {
    private final CalculatorServiceImpl out = new CalculatorServiceImpl();
    public static Stream<Arguments> paramTest(){
        return  Stream.of(
                Arguments.of(num1,num2),
                Arguments.of(num3,num4)
        );
    }
    @ParameterizedTest
    @MethodSource("paramTest")
    public void plus (Integer num1, Integer num2){
        Integer result = out.plus(num1,num2);
        Integer plus = num1+num2;
        Assertions.assertEquals(plus,result);
    }
    @ParameterizedTest
    @MethodSource("paramTest")
    public void minus (Integer num1, Integer num2){
        Integer result = out.minus(num1,num2);
        Integer minus = num1-num2;
        Assertions.assertEquals(minus,result);
    }
    @ParameterizedTest
    @MethodSource("paramTest")
    public void multiply (Integer num1, Integer num2){
        Integer result = out.multiply(num1,num2);
        Integer multiply = num1*num2;
        Assertions.assertEquals(multiply,result);
    }
    @ParameterizedTest
    @MethodSource("paramTest")
    public void divide (Integer num1, Integer num2){
        Integer result = out.divide(num1,num2);
        Integer divide = num1/num2;
        Assertions.assertEquals(divide,result);
    }
}
