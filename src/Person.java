public class Person {
    int dateOfBirth;
    String name;
    String currentCity;
    String jobTitle;


    void welcomeMessage(){
        System.out.println("Привет! Меня зовут " + name + ". Я из города " + currentCity + ". Я родился в " + dateOfBirth
                + " году. Я работаю на должности " + jobTitle + ". Будем знакомы!");
    }
}
