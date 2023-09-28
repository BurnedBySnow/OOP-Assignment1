package Plants;

import Enums.Type;

public abstract class Plant {
    protected Type type;
    protected float height;

    public Plant(Type type, String name, float height) {
        this.type = type;
        this.height = height;
    }
}
