package Cars;

import transport.Car;

public class Main {
    public static void main(String[] args) {
        insurance lada1 = new insurance("22-12-2023", "12000", "123456789");
        insurance audi1 = new insurance("17-03-2030", "20000", "987654321");
        insurance bmw1 = new insurance("10-10-2022", "15000", "111111111");
        insurance kia1 = new insurance("01-03-2025", "17500", "121212121");
        insurance hyundai1 = new insurance("01-01-2023", "5700", "22222222");





        Car lada = new Car("Lada", "Grande", 1.7, "Желтый", 2015,
                "Россия", " ", " ", 0, " ", " ", lada1);
        lada.getMassage();

        Car audi = new Car("Audi", "A8 50 L TDI quattro", 3.0, "Черный",
                2020, "Германия", " ", " ", 0, " ",
                " ", audi1);
        audi.getMassage();

        Car bmw = new Car("BMW", "Z8", 3.0, "Черный", 2021,
                "Германия", " ", " ", 0, " ", " ", bmw1);
        bmw.getMassage();

        Car kia = new Car("Kia", "Sportage 4", 2.4, "Красный", 2018,
                "Южная Корея", " ", " ", 0, " ", " ", kia1);
        kia.getMassage();

        Car hyundai = new Car("Hyundai", "Avante", 1.6, "Оранжевый",
                2016, "Южная Корея", " ", " ", 0,
                " ", " ", hyundai1);
        hyundai.getMassage();



    }
}
