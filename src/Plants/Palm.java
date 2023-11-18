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
        return String.format("%.2f litre of " + nourishment.string, (0.5 * this.height));
    }
}
