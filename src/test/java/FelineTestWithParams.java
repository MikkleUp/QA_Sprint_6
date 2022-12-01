import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class FelineTestWithParams {
    Feline feline = new Feline();

    private final int testCountKittens;

    public FelineTestWithParams(int testCountKittens) {
        this.testCountKittens = testCountKittens;
    }

    @Test
    public void validateGetKittensWithTestDataSet() {
        int actual = feline.getKittens(testCountKittens);
        assertEquals(testCountKittens, actual);
    }

    @Parameterized.Parameters
    public static Object[][] getTestDataForCountKittens() {
        return new Object[][]{
                {1},
                {-1},
                {0},
        };
    }
}

