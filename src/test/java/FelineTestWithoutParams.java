import com.example.Feline;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class FelineTestWithoutParams {

    Feline feline = new Feline();

    @Test
    public void validateEatMeatFeline() throws Exception {
        List<String> expected = List.of("Животные", "Птицы", "Рыба");
        List<String> actual = feline.eatMeat();
        assertEquals(expected, actual);
    }

    @Test
    public void validateGetFamilyFeline() {
        String expected = "Кошачьи";
        String actual = feline.getFamily();
        assertEquals(expected, actual);
    }

    @Test
    public void validateGetKittensFeline() {
        int expected = 1;
        int actual = feline.getKittens();
        assertEquals(expected, actual);
    }

}
