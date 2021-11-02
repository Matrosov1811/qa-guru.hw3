package pav.matrosov;

public class CarModel extends CarMake{
    private final String modelName;
    private String carColor;
    private final int seatsNumber;

    public CarModel(int wheels, String handdrive, String sourceNature, String makeName, String modelName, String carColor, int seatsNumber) {
        super(wheels, handdrive, sourceNature, makeName);
        this.modelName = modelName;
        this.carColor = carColor;
        this.seatsNumber = seatsNumber;
    }

    @Override
    public String toString() {
        return "CarInfo: \n" +
                "Number of wheels = " + wheels + "\n" +
                handdrive + "handdrive\n" +
                "Made in " + sourceNature + "\n" +
                "Make = " + makeName + "\n" +
                "Model = " + modelName + "\n" +
                "Color = " + carColor +"\n" +
                "Number of seats = " + seatsNumber;
    }

    public String getModelName() {
        return modelName;
    }

    public String getCarColor() {
        return carColor;
    }

    public void setCarColor(String carColor) {
        this.carColor = carColor;
    }

    public int getSeatsNumber() {
        return seatsNumber;
    }

}
