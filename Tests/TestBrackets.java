import com.m3c.agw.BracketCounter;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by alumniCurie02 on 11/10/2017.
 */
public class TestBrackets {

    private BracketCounter bracketCounter;

    @Before
    public void init() {
        bracketCounter = new BracketCounter();
    }

    @Test
    public void testSingleSquareBrackets() {
        String testString = "[]";
        boolean outcome = bracketCounter.countBrackets(testString);
        Assert.assertTrue(outcome);
    }

    @Test
    public void testMultiBrackets() {
        String testString = "[]()()";
        boolean outcome = bracketCounter.countBrackets(testString);
        Assert.assertTrue(outcome);
    }

    @Test
    public void testNestedBrackets() {
        String testString = "([([([])])])";
        boolean outcome = bracketCounter.countBrackets(testString);
        Assert.assertTrue(outcome);
    }

    @Test
    public void testInvalidCharacters() {
        String testString = "abc";
        boolean outcome = bracketCounter.countBrackets(testString);
        Assert.assertTrue(outcome);
    }

    @Test
    public void testMixedCharacters() {
        String testString = "(abcd)";
        boolean outcome = bracketCounter.countBrackets(testString);
        Assert.assertTrue(outcome);
    }

    @Test
    public void testMixedCharactersInvalidBrackets() {
        String testString = "(abc(";
        boolean outcome = bracketCounter.countBrackets(testString);
        Assert.assertFalse(outcome);
    }

    @Test
    public void testIncorrectOrders() {
        String testString = "(([)])";
        boolean outcome = bracketCounter.countBrackets(testString);
        Assert.assertFalse(outcome);
    }

    @After
    public void teardown() {

    }
}
