package Plants;

import Enums.Nourishment;
import Enums.Type;

// inherits from Plant
public class CarnivorousPlant extends Plant {
    public CarnivorousPlant(String name, float height, Nourishment nourishment) {
        super(Type.Carnivorous, name, height, nourishment);
    }

    @Override
    public String calculateNourishment() {
        return String.format("%.2f litre of " + nourishment.string, 0.1 + (0.2 * this.height));
    }
}
