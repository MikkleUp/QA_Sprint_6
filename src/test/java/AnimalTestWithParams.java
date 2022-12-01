import com.example.Animal;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class AnimalTestWithParams {
    Animal animal = new Animal();

    private final String testAnimalKind;
    private final List<String> expectedListOfFood;

    public AnimalTestWithParams(String testAnimalKind, List<String> expectedListOfFood) {
        this.testAnimalKind = testAnimalKind;
        this.expectedListOfFood = expectedListOfFood;
    }

    @Test
    public void validateGetFoodWithPositiveValuesAnimal() throws Exception {
        List <String> actualListOfFeed = animal.getFood(testAnimalKind);
        assertEquals(expectedListOfFood, actualListOfFeed);

    }

    @Parameterized.Parameters
    public static Object[][] getFoodData() {
        return new Object[][]{
                {"Травоядное", List.of("Трава", "Различные растения")},
                {"Хищник", List.of("Животные", "Птицы", "Рыба")},
        };
    }

}

