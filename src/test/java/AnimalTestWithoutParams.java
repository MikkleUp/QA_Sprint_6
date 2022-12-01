import com.example.Animal;
import org.junit.Test;

import static org.junit.Assert.*;

public class AnimalTestWithoutParams {
    Animal animal = new Animal();

    @Test
    public void validateGetFamilyWithPositiveValueAnimal() {
        String expected = "Существует несколько семейств: заячьи, беличьи, мышиные, кошачьи, псовые, медвежьи, куньи";
        String actual = animal.getFamily();
        assertEquals(expected, actual);
    }

    @Test
    public void validateShouldThrowExceptionOfGetFoodWhenMyStringNull() throws Exception {
        assertThrows(
                Exception.class,
                () -> animal.getFood(null));
    }

    @Test
    public void validateGetFoodWithAnimalKindWhichNotExistShouldThrowExceptionWithCorrectMessage() {
        try {
            animal.getFood("Другое");
            fail("Expected validation exception was not thrown");
        } catch (Exception e) {
            assertEquals("Неизвестный вид животного, используйте значение Травоядное или Хищник",
                    e.getMessage());
        }
    }
}
