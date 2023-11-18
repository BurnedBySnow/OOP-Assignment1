package Plants;

import Enums.Nourishment;
import Enums.Type;
import Interfaces.PlantInterface;

// superclass for the different plants
public abstract class Plant implements PlantInterface {
    // protected variables to be able to access within package
    protected final String name;
    protected Type type; // cactus, palm or carnivorous
    protected float height;
    protected Nourishment nourishment; // water, mineral water or protein

    public Plant(Type type, String name, float height, Nourishment nourishment) {
        this.name = name;
        this.type = type;
        this.height = height;
        this.nourishment = nourishment;
    }

    public String getName(){
        return name;
    }

    public void setHeight(float height) {
        this.height = height;
    }
}
