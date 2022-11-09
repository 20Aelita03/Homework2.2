package Flower;

public class Main {
    public static void main(String[] args) {
        flower commonRose = new flower("","Голландия",35.59,0, "Роза Обыкновенная");
        commonRose.getMassage();
        flower chrysanthemum = new flower("","",15, 5, "Хризантема");
        chrysanthemum.getMassage();
        flower peony = new flower("","Англия", 69.9,1, "Пион");
        peony.getMassage();
        flower gypsophila = new flower("","Турция", 19.5,10, "Гипсофила");
        gypsophila.getMassage();
    }

    }
