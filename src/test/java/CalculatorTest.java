import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    @Test
    public void JUnitWorking()
    {
        Calculator calculator = new Calculator();
        Assertions.assertTrue(true);
    }

    @Test
    public void Add_Nothing_Return0(){
        Calculator calculator = new Calculator();
        int result = calculator.Add("");
        Assertions.assertEquals(0, result);
    }

    @Test
    public void Add_SingleNumber_ReturnSingleNumber(){
        Calculator calculator = new Calculator();
        int result = calculator.Add("1");
        Assertions.assertEquals(1, result);
    }

    @Test
    public void Add_TwoNumbers_ReturnSum(){
        Calculator calculator = new Calculator();
        int result = calculator.Add("1,2");
        Assertions.assertEquals(3, result);
    }
}
