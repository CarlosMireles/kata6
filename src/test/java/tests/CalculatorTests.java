package tests;

import org.junit.Test;
import software.ulpgc.kata6.Calculator;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CalculatorTests {
    @Test
    public void should_return_false_isPrime_for_1(){
        boolean result = Calculator.isPrime(1);
        assertThat(result).isEqualTo(false);
    }
    @Test
    public void should_return_true_isPrime_for_5(){
        boolean result = Calculator.isPrime(5);
        assertThat(result).isEqualTo(true);
    }
    @Test
    public void should_return_false_isEven_for_3(){
        boolean result = Calculator.isEven(3);
        assertThat(result).isEqualTo(false);
    }
    @Test
    public void should_return_true_isEven_for_4(){
        boolean result = Calculator.isEven(4);
        assertThat(result).isEqualTo(true);
    }
    @Test
    public void should_return_false_isOdd_for_6(){
        boolean result = Calculator.isOdd(6);
        assertThat(result).isEqualTo(false);
    }
    @Test
    public void should_return_true_isOdd_for_9(){
        boolean result = Calculator.isOdd(9);
        assertThat(result).isEqualTo(true);
    }
    @Test
    public void should_return_120_factorial_for_5(){
        int result = Calculator.factorial(5);
        assertThat(result).isEqualTo(120);
    }
    @Test
    public void should_return_6_factorial_for_3(){
        int result = Calculator.factorial(3);
        assertThat(result).isEqualTo(6);
    }
    @Test
    public void first_7_fibonacci(){
        int[] expected = {0,1,1,2,3,5,8};
        int[] result = Calculator.fibonacciUntil(7);
        assertThat(result).isEqualTo(expected);
    }
    @Test
    public void first_10_fibonacci(){
        int[] expected = {0,1,1,2,3,5,8,13,21,34};
        int[] result = Calculator.fibonacciUntil(10);
        assertThat(result).isEqualTo(expected);
    }
}
