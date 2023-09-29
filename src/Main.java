import Plants.Cactus;
import Plants.CarnivorousPlant;
import Plants.Palm;
import Plants.Plant;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Hotel hotel = new Hotel("Greenest");

        Plant cactusIgge = new Cactus("Igge", 0.2f);
        Plant palmLaura = new Palm("Laura", 5);
        Plant carnivorousPlantMeatLoaf = new CarnivorousPlant("MeatLoaf", 0.7f);
        Plant palmOlof = new Palm("Olof", 1);

        hotel.addToList(cactusIgge);
        hotel.addToList(palmLaura);
        hotel.addToList(palmOlof);
        hotel.addToList(carnivorousPlantMeatLoaf);

        String res = JOptionPane.showInputDialog("What plant is to be nourished?");

        if(hotel.getPlantFromList(res) != null){
            JOptionPane.showMessageDialog(null, hotel.getPlantFromList(res).calculateNourishment());
        } else {
            JOptionPane.showMessageDialog(null, "No plant with that name.");
        }
    }
}