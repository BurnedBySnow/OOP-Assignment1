package Enums;

public enum Nourishment {
    Water ("water"),
    Protein ("protein drink"),
    MineralWater ("mineral water");

    public final String nourishment;

    Nourishment(String nourishment) {
        this.nourishment = nourishment;
    }
}
