import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 * User: STU
 * Date: 12-10-21
 * Time: 下午4:11
 * To change this template use File | Settings | File Templates.
 */
public class GuessTest {
    private  Guess  guessObj;

    @Before
    public void init(){
        String serverNumber = "9305";
        guessObj = new Guess(serverNumber);
    }

    @Test
    public void coretest(){
        String userInput = "9305";
        String res = guessObj.validate(userInput);
        Assert.assertEquals("4A0B",res);
    }

}
