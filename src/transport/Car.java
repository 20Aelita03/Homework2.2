package transport;

import Cars.insurance;

public class Car {
    private String brand;
    private String model;
    private double engineVolumeInLiters;
    private String bodyColor;
    private int productionYear;
    private String assemblyCountry;
    private String transmission;
    private String bodyType;
    private String registrationNumber;
    private int numberOfSeats;
    private String tires;
    private insurance insurance;






    public void getMassage(){
        System.out.println( brand + " " + model + ", объем двигателя - " + engineVolumeInLiters + ", цвет кузова - "
        + bodyColor + ", год выпуска - " + productionYear + ", страна производства - " + assemblyCountry + " .Коробка передач - " + transmission +
                " .Тип кузова - " + bodyType + " .Регистрационный номер - " + registrationNumber +
                " .Количество мест - " + numberOfSeats + " .Резина - " + tires + " Данные страховки: Годен до: " + insurance.getValidity() +
                " Цена: " + insurance.getPrice() + " Номер: " + insurance.getNumber() + ".");
    }

    public void changeTiresToSeasonal(String tires){
        if (tires.equals("летняя") || tires.equals("Летняя")){
            tires = "зимняя";
        } else if (tires.equals("зимняя") || tires.equals("Зимняя")){
            tires = "летняя";
        }
    }

    public Car(double engineVolumeInLiters, String bodyColor, int productionYear) {
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
        transmission = "default";
        bodyType = "default";
        numberOfSeats = 0;
        tires = "default";
        registrationNumber = "default";

    }

    public Car(String brand, String model, double engineVolumeInLiters,  int productionYear, String assemblyCountry){
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

        transmission = "default";
        bodyType = "default";
        numberOfSeats = 0;
        tires = "default";
        registrationNumber = "default";
    }

    public Car(String brand, String model, double engineVolumeInLiters, String bodyColor, String assemblyCountry){
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
        transmission = "default";
        bodyType = "default";
        numberOfSeats = 0;
        tires = "default";
        registrationNumber = "default";
    }

    public Car(String brand, String model, String bodyColor, int productionYear, String assemblyCountry){
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
        transmission = "default";
        bodyType = "default";
        numberOfSeats = 0;
        tires = "default";
        registrationNumber = "default";
    }

     public Car(String brand, String model, double engineVolumeInLiters, String bodyColor, int productionYear,
                String assemblyCountry, String transmission, String bodyType, int numberOfSeats, String tires,
                String registrationNumber, insurance insurance){
         if(brand.isEmpty() || brand.isBlank()){
             this.brand = "Бренд";
         } else {
             this.brand = brand;
         }

         if(model.isEmpty() || model.isBlank()){
             this.model = "Модель";
         } else {
             this.model = model;
         }

         if (engineVolumeInLiters >= 0){
             this.engineVolumeInLiters = engineVolumeInLiters;
         } else {
             this.engineVolumeInLiters = Math.abs(engineVolumeInLiters);
         }

         if(bodyColor.isEmpty() || bodyColor.isBlank()){
             this.bodyColor = "Цвет кузова";
         } else {
             this.bodyColor = bodyColor;
         }

         if (productionYear >= 0) {
             this.productionYear = productionYear;
         } else {
             this.productionYear =Math.abs(productionYear);
         }

         if(assemblyCountry.isEmpty() || assemblyCountry.isBlank()){
             this.assemblyCountry = "Россия";
         } else {
             this.assemblyCountry = assemblyCountry;
         }

         if(transmission.isEmpty() || transmission.isBlank()){
             this.transmission = "Трансмиссия";
         } else {
             this.transmission = transmission;
         }

         if(bodyType.isEmpty() || bodyType.isBlank()){
             this.bodyType = "Тип кузова";
         } else {
             this.bodyType = bodyType;
         }

         if (numberOfSeats >= 0) {
             this.numberOfSeats = numberOfSeats;
         } else {
             this.numberOfSeats =Math.abs(numberOfSeats);
         }

         if(tires.isEmpty() || tires.isBlank()){
             this.tires = "летняя";
         } else {
             this.tires = tires;
         }

         this.registrationNumber = registrationNumber;
         this.insurance = insurance;
     }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public String getAssemblyCountry() {
        return assemblyCountry;
    }

    public double getEngineVolumeInLiters() {
        return engineVolumeInLiters;
    }

    public String getBodyColor() {
        return bodyColor;
    }

    public String getTransmission() {
        return transmission;
    }

    public String getBodyType() {
        return bodyType;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public String getTires() {
        return tires;
    }

    public void setEngineVolumeInLiters(double engineVolumeInLiters) {
        this.engineVolumeInLiters = engineVolumeInLiters;
    }

    public void setBodyColor(String bodyColor) {
        this.bodyColor = bodyColor;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public void setTires(String tires) {
        this.tires = tires;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }
}
