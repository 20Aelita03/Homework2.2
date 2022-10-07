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

    Car(double engineVolumeInLiters, String bodyColor, int productionYear) {
        brand = "default";
        model = "default";
        if (engineVolumeInLiters >= 0){
            this.engineVolumeInLiters = engineVolumeInLiters;
        } else {
            this.engineVolumeInLiters = Math.abs(engineVolumeInLiters);
        }
        this.bodyColor = bodyColor;
        if (productionYear >= 0) {
            this.productionYear = productionYear;
        } else {
            this.productionYear =Math.abs(productionYear);
        }
        assemblyCountry = "default";
    }

    Car(String brand, String model, double engineVolumeInLiters,  int productionYear, String assemblyCountry){
        this.brand = brand;
        this.model = model;
        if (engineVolumeInLiters >= 0){
        this.engineVolumeInLiters = engineVolumeInLiters;
        } else {
            this.engineVolumeInLiters = Math.abs(engineVolumeInLiters);
        }
        bodyColor = "белый";
        if (productionYear >= 0) {
            this.productionYear = productionYear;
        } else {
            this.productionYear =Math.abs(productionYear);
        }
        this.assemblyCountry = assemblyCountry;
    }

    Car(String brand, String model, double engineVolumeInLiters, String bodyColor, String assemblyCountry){
        this.brand = brand;
        this.model = model;
        if (engineVolumeInLiters >= 0){
            this.engineVolumeInLiters = engineVolumeInLiters;
        } else {
            this.engineVolumeInLiters = Math.abs(engineVolumeInLiters);
        }
        this.bodyColor = bodyColor;
        productionYear = 2000;
        this.assemblyCountry = assemblyCountry;
    }

    Car(String brand, String model, String bodyColor, int productionYear, String assemblyCountry){
        this.brand = brand;
        this.model = model;
        engineVolumeInLiters = 1.5;
        this.bodyColor = bodyColor;
        if (productionYear >= 0) {
            this.productionYear = productionYear;
        } else {
            this.productionYear =Math.abs(productionYear);
        }
        this.assemblyCountry = assemblyCountry;
    }

     Car(String brand, String model, double engineVolumeInLiters, String bodyColor, int productionYear, String assemblyCountry){
        this.brand = brand;
        this.model = model;
         if (engineVolumeInLiters >= 0){
             this.engineVolumeInLiters = engineVolumeInLiters;
         } else {
             this.engineVolumeInLiters = Math.abs(engineVolumeInLiters);
         }
        this.bodyColor = bodyColor;
         if (productionYear >= 0) {
             this.productionYear = productionYear;
         } else {
             this.productionYear =Math.abs(productionYear);
         }
        this.assemblyCountry = assemblyCountry;
     }
}
