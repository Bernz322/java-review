package Testing;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class MinionTest {
    @Test
    public void testConstructor() {
        Minion stuart = new Minion("Stuart", 1, "Yellow", "Gru");
        assertEquals("Stuart", stuart.getName());
        assertEquals(1, stuart.getEyes());
        assertEquals("Yellow", stuart.getColor());

        Minion bob = new Minion("Bob", 2, "Yellow", "Gru");
        assertEquals("Bob", bob.getName());
        assertEquals(2, bob.getEyes());
        assertEquals("Yellow", bob.getColor());
    }

    @Test
    public void testSetters() {
        Minion stuart = new Minion("Stuart", 1, "Yellow", "Gru");
        stuart.setMaster("Dr. Nefario");
        assertEquals("Dr. Nefario", stuart.getMaster());

        Minion bob = new Minion("Bob", 2, "Yellow", "Gru");
        bob.setMaster("Scarlet");
        // assertEquals("Gru", bob.getMaster()); // Will return an error
        assertEquals("Scarlet", bob.getMaster());
    }
}
