package Plants;

import Enums.Nourishment;
import Enums.Type;

// inherits from Plant
public class Cactus extends Plant {
    public Cactus(String name, float height, Nourishment nourishment) {
        super(Type.Cactus, name, height, nourishment);
    }

    @Override
    public String calculateNourishment() {
        return "2 centilitres of " + nourishment.string;
    }
}
