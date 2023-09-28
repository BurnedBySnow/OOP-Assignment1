import Plants.Cactus;
import Plants.CarnivorousPlant;
import Plants.Palm;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Hotel hotel = new Hotel("Greenest");

        Cactus cactusIgge = new Cactus("Igge", 0.2f);
        Palm palmLaura = new Palm("Laura", 5);
        CarnivorousPlant carnivorousPlantMeatLoaf = new CarnivorousPlant("MeatLoaf", 0.7f);
        Palm palmOlof = new Palm("Olof", 1);

        hotel.addToCactusList(cactusIgge);
        hotel.addToPalmList(palmLaura);
        hotel.addToPalmList(palmOlof);
        hotel.addToCarnivorousPlantList(carnivorousPlantMeatLoaf);

        String res = JOptionPane.showInputDialog("What plant is to be nourished?");

        if(res.equals("Igge") | res.equals("igge")){
            JOptionPane.showMessageDialog(null, cactusIgge.calculateNourishment());
        } else if (res.equals("Laura") | res.equals("laura")) {
            JOptionPane.showMessageDialog(null, palmLaura.calculateNourishment());
        } else if (res.equals("Olof") | res.equals("olof")) {
            JOptionPane.showMessageDialog(null, palmOlof.calculateNourishment());
        } else if (res.equals("MeatLoaf") | res.equals("meatloaf")) {
            JOptionPane.showMessageDialog(null, carnivorousPlantMeatLoaf.calculateNourishment());
        } else {
            JOptionPane.showMessageDialog(null, "No plant with that name.");
        }
    }
}