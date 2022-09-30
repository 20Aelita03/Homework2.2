package Cars;

public class Main {
    public static void main(String[] args) {
        Car lada = new Car();
        lada.brand = "Lada";
        lada.model = "Grande";
        lada.engineVolumeInLiters = 1.7;
        lada.bodyColor = "Желтый";
        lada.productionYear = 2015;
        lada.assemblyCountry = "Россия";

        lada.getMassage();

        Car audi = new Car();
        audi.brand = "Audi";
        audi.model = "A8 50 L TDI quattro";
        audi.engineVolumeInLiters = 3.0;
        audi.bodyColor = "Черный";
        audi.productionYear = 2020;
        audi.assemblyCountry = "Германия";

        audi.getMassage();

        Car bmw = new Car();
        bmw.brand = "BMW";
        bmw.model = "Z8";
        bmw.engineVolumeInLiters = 3.0;
        bmw.bodyColor = "Черный";
        bmw.productionYear = 2021;
        bmw.assemblyCountry = "Германия";

        bmw.getMassage();

        Car kia = new Car();
        kia.brand = "Kia";
        kia.model = "Sportage 4";
        kia.engineVolumeInLiters = 2.4;
        kia.bodyColor = "Красный";
        kia.productionYear = 2018;
        kia.assemblyCountry = "Южная Корея";

        kia.getMassage();

        Car hyundai = new Car();
        hyundai.brand = "Hyundai";
        hyundai.model = "Avante";
        hyundai.engineVolumeInLiters = 1.6;
        hyundai.bodyColor = "Оранжевый";
        hyundai.productionYear = 2016;
        hyundai.assemblyCountry = "Южная Корея";

        hyundai.getMassage();
    }
}
