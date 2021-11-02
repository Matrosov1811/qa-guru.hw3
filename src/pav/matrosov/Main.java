package pav.matrosov;

public class Main {
    public static void main(String[] args) {

        CarModel bestCar = new CarModel(4, "left", "japan", "lexus", "GS300", "grey", 5);
        bestCar.setCarColor("dark grey");
        System.out.println(bestCar);
    }
}
