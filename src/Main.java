import Enums.Nourishment;
import Plants.Cactus;
import Plants.CarnivorousPlant;
import Plants.Palm;
import Plants.Plant;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Hotel hotel = getHotel();

        String res = JOptionPane.showInputDialog("What plant is to be nourished?");

        if(hotel.getPlantFromList(res) != null){
            JOptionPane.showMessageDialog(null, hotel.getPlantFromList(res).calculateNourishment());
        } else {
            JOptionPane.showMessageDialog(null, "No plant with that name.");
        }
    }

    private static Hotel getHotel() {
        Hotel hotel = new Hotel();

        Plant cactusIgge = new Cactus("Igge", 0.2f, Nourishment.MineralWater);
        Plant palmLaura = new Palm("Laura", 5, Nourishment.Water);
        Plant carnivorousPlantMeatLoaf = new CarnivorousPlant("MeatLoaf", 0.7f, Nourishment.Protein);
        Plant palmOlof = new Palm("Olof", 1, Nourishment.Water);

        hotel.addToList(cactusIgge);
        hotel.addToList(palmLaura);
        hotel.addToList(palmOlof);
        hotel.addToList(carnivorousPlantMeatLoaf);
        return hotel;
    }
}