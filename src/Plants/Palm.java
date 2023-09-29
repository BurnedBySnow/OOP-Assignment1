package Plants;

import Enums.Nourishment;
import Enums.Type;
import Interfaces.PlantInterface;

public class Palm extends Plant implements PlantInterface {
    public Palm(String name, float height) {
        super(Type.Palm, name, height);
    }

    @Override
    public String calculateNourishment() {
        return (0.5 * this.height) + " litres of " + Nourishment.Water.nourishment;
    }

    @Override
    public String getName() {
        return this.name;
    }

}
