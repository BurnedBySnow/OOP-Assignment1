package Enums;

public enum Nourishment {
    Water ("water"),
    Protein ("protein drink"),
    MineralWater ("mineral water");

    public final String string;

    Nourishment(String string) {
        this.string = string;
    }
}
