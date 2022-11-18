package Flower;

public class flower {
    private String flowerColor;
    private String country;
    private double cost;
    int lifeSpan;
    String name;


    flower(String flowerColor, String country,double cost, int lifeSpan, String name){
        if (flowerColor.isBlank() || flowerColor.isEmpty()){
            this.flowerColor = "белый";
        } else {
            this.flowerColor = flowerColor;
        }


        if(cost > 0){
            this.cost = cost;
        } else if (cost < 0){
            this.cost = Math.abs(cost);
        } else {
            this.cost = 1;
        }


        if(country.isEmpty() || country.isBlank()){
            this.country = "Россия";
        } else {
            this.country = country;
        }
        
        
        if (lifeSpan > 0){
            this.lifeSpan = lifeSpan;
        } else if (lifeSpan < 0) {
            this.lifeSpan = Math.abs(lifeSpan);
        } else {
            this.lifeSpan = 3;
        }

        this.name =name;

    }

    void getMassage(){
        System.out.println(name + " из страны " + country + ". Цвет - " + flowerColor + ". Стоимость: " + cost +
                ". Срок стояния: " + lifeSpan);
    }


}
