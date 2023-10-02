package Plants;

import Enums.Nourishment;
import org.junit.jupiter.api.Test;

import java.text.DecimalFormat;

import static org.junit.jupiter.api.Assertions.*;

class CarnivorousPlantTest {
    public CarnivorousPlant carnivorousPlant = new CarnivorousPlant("Test", 0.7f, Nourishment.Protein);
    private final DecimalFormat f = new DecimalFormat("0.00");

    @Test
    void calculateNourishmentTest() {
        assert (Double.parseDouble(carnivorousPlant.calculateNourishment().split(" ")[0]) == Double.parseDouble(f.format(0.1 + 0.2 * 0.7f)));
        assert (Double.parseDouble(carnivorousPlant.calculateNourishment().split(" ")[0]) == Double.parseDouble(f.format(0.1 + 0.2 * carnivorousPlant.height)));
        assert (Double.parseDouble(carnivorousPlant.calculateNourishment().split(" ")[0]) != Double.parseDouble(f.format(0.1 + 0.5 * 2f)));
    }
}