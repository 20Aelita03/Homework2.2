import java.time.LocalDate;

public class Person {
    private int dateOfBirth;
    String name;
    private String currentCity;
    String jobTitle;


    void welcomeMessage(){
        System.out.println("Привет! Меня зовут " + name + ". Я из города " + currentCity + ". Я родился в " +
                 dateOfBirth + " году. Я работаю на должности " + jobTitle + ". Будем знакомы!");
    }


    Person(int age) {

        if (age >= 0) {
            this.dateOfBirth = LocalDate.now().getYear() - age;
        } else {
            this.dateOfBirth = LocalDate.now().getYear() - Math.abs(age);
        }
        name = "Информация не указана";
        currentCity = "Информация не указана";
        jobTitle = "Информация не указана";
    }

    Person (String name,int age, String currentCity) {
        if(age >= 0){
            this.dateOfBirth = LocalDate.now().getYear() - age;
        } else {
            this.dateOfBirth = LocalDate.now().getYear() - Math.abs(age);
        }
        this.name = name;
        this.currentCity = currentCity;
        jobTitle = "Информация не указана";
    }
    Person(int age, String name, String currentCity, String jobTitle){
        if(age >= 0){
            this.dateOfBirth = LocalDate.now().getYear() - age;
        } else {
            this.dateOfBirth = LocalDate.now().getYear() - Math.abs(age);
        }
        this.name = name;
        this.currentCity = currentCity;
        this.jobTitle = jobTitle;
    }

    public int getAge() {
        return LocalDate.now().getYear() - dateOfBirth;
    }

    public void setAge(int age) {
        if (age < 0) {
            this.dateOfBirth = LocalDate.now().getYear() - Math.abs(age);
        }

    }

    public String getCurrentCity() {
        return currentCity;
    }

    public void setCurrentCity(String currentCity) {
        if(currentCity == null || currentCity.isEmpty() || currentCity.isBlank()) {
            currentCity = "Информация не указана";
        }else {
            this.currentCity = currentCity;
        }

    }
}

