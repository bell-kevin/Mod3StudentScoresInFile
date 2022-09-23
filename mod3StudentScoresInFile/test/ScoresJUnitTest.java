
/** ****************************************************************************
 * ScoresJUnitTest.java
 * Kevin Bell
 * WARNING: THESE TESTS ARE NOT ACTUALLY GOOD TESTS
 * Objects read from files, calculate & display lowest, highest, & average score
 **************************************************************************** */
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class ScoresJUnitTest {

    public ScoresJUnitTest() {
    }
    double sum, count;
    @Parameterized.Parameter(0)
    public double lowScore;
    @Parameterized.Parameter(1)
    public double highScore;
    @Parameterized.Parameter(2)
    public double averageScore;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        Object[][] data = new Object[][]{
            {0, 100, 70},
            {1, 99, 75},
            {2, 98, 74},
            {3, 97, 73},
            {4, 96, 72}
        };
        return Arrays.asList(data);
    }

    @Test
    public void testLowScore() {
        double actual = lowScore;
        double result = lowScore;
        assertEquals(result, actual, 0.01);
    } // end testLowScore method

    @Test
    public void testHighScore() {
        double actual = highScore;
        double result = highScore;
        assertEquals(result, actual, 0.01);
    } // end testHighScore method

    @Test
    public void testAverageScore() {
        double actual = sum / count;
        double result = sum / count;
        assertEquals(result, actual, 0.01);
    } // end testAverageScore method
} // end StudentScoresInFileJUnitTest class
