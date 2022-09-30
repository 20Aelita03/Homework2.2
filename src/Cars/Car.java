package Cars;

public class Car {
    String brand;
    String model;
    double engineVolumeInLiters;
    String bodyColor;
    int productionYear;
    String assemblyCountry;

    void getMassage(){
        System.out.println( brand + " " + model + ", объем двигателя - " + engineVolumeInLiters + ", цвет кузова - "
        + bodyColor + ", год выпуска - " + productionYear + ", страна производства - " + assemblyCountry + ".");
    }
}
