package pav.matrosov;

public class CarMake extends Car{
    public final String sourceNature;
    public final String makeName;

    public CarMake(int wheels, String handdrive, String sourceNature, String makeName) {
        super(wheels, handdrive);
        this.sourceNature = sourceNature;
        this.makeName = makeName;
    }

    public String getSourceNature() {
        return sourceNature;
    }

    public String getMakeName() {
        return makeName;
    }
}
