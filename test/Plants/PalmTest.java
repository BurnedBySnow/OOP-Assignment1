package Plants;

import Enums.Nourishment;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalmTest {

    public Palm palm = new Palm("TestPalm", 5, Nourishment.Water);
    public Palm palm2 = new Palm("TestPalm2", 1, Nourishment.Water);

    @Test
    void calculateNourishmentTest() {
        assert (Double.parseDouble(palm.calculateNourishment().split(" ")[0]) == 0.5 * 5);
        assert (Double.parseDouble(palm.calculateNourishment().split(" ")[0]) == 0.5 * palm.height);
        assert (Double.parseDouble(palm.calculateNourishment().split(" ")[0]) != 0.5 * 2);
        assert (Double.parseDouble(palm2.calculateNourishment().split(" ")[0]) == 0.5 * 1);
        assert (Double.parseDouble(palm2.calculateNourishment().split(" ")[0]) == 0.5 * palm2.height);
        assert (Double.parseDouble(palm2.calculateNourishment().split(" ")[0]) != 0.5 * 2);
    }
}