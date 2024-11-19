package calculator.service;


import org.springframework.stereotype.Service;


@Service
public class CalculatorServiceImpl implements calculatorService {

    @Override
    public Integer plus (Integer num1,Integer num2) {
        return num1 + num2;
    }
    @Override
    public Integer minus(Integer num1, Integer num2) {
        return num1 - num2;
    }
    @Override
    public Integer multiply(Integer num1, Integer num2) {
        return num1 * num2;
    }
    @Override
    public Integer divide(Integer num1, Integer num2) {
        if (num2 == 0) {
            throw new IllegalArgumentException("Второе число не может равняться 0");
        }
        return num1 / num2;
    }

}
