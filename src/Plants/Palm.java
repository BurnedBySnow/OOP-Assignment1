package Plants;

import Enums.Nourishment;
import Enums.Type;

// inherits from Plant
public class Palm extends Plant {
    public Palm(String name, float height, Nourishment nourishment) {
        super(Type.Palm, name, height, nourishment);
    }

    @Override
    public String calculateNourishment() {
        return (0.5 * this.height) + " litres of " + nourishment.string;
    }
}
