package Plants;

import Enums.Type;
import Interfaces.PlantInterface;

public abstract class Plant implements PlantInterface {
    protected final String name;
    protected Type type;
    protected float height;

    public Plant(Type type, String name, float height) {
        this.name = name;
        this.type = type;
        this.height = height;
    }

    public String getName(){
        return name;
    }
}
