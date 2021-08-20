import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnimalTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }


    @Test
    public void NewHeroObjectedIsCreatedSuccessfully() {
        Animal animal = new Animal("Thor", "young", "okay");
        assertEquals(true, true);
    }

    public Animal setUpInstanceOf_NewAnimal() {
        Animal animal= new Animal("KInkachu", "old", "ill");
        return animal;
    }

    public Animal setUpAnotherAnimal() {
        Animal animal = new Animal("monkey", "Newborn", "healthy");
        return animal;
    }

    @Test
    void AnimalName_true() {
        Animal animal = setUpInstanceOf_NewAnimal();
        assertEquals("KInkachu",animal.getName());
    }

    @Test
    void AnimalHealthAsserts_true() {
        Animal animal = setUpAnotherAnimal();
        assertEquals("healthy",animal.getHealth());
    }
}
