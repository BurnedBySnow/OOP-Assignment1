package Plants;

import Enums.Nourishment;
import Enums.Type;
import Interfaces.PlantInterface;

public class CarnivorousPlant extends Plant implements PlantInterface {
    public CarnivorousPlant(String name, float height) {
        super(Type.Carnivorous, name, height);
    }

    @Override
    public String calculateNourishment() {
        return String.format("%.2f litre of " + Nourishment.Protein.nourishment, 0.1 + (0.2 * this.height));
    }

    @Override
    public String getName() {
        return this.name;
    }
}
