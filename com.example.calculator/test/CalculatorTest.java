import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 * User: STU
 * Date: 12-10-21
 * Time: 下午2:30
 * To change this template use File | Settings | File Templates.
 */
public class CalculatorTest {
    private Calculator calculatorObj;

    @Before
    public void init(){
        calculatorObj = new Calculator();
    }

    @Test
    public void sum(){
        int sum = calculatorObj.calcSum("3+4");
        Assert.assertEquals(7,sum);
    }

}
