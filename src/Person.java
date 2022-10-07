public class Person {
    int dateOfBirth;
    String name;
    String currentCity;
    String jobTitle;


    void welcomeMessage(){
        System.out.println("Привет! Меня зовут " + name + ". Я из города " + currentCity + ". Я родился в " + dateOfBirth
                + " году. Я работаю на должности " + jobTitle + ". Будем знакомы!");
    }


    Person(int dateOfBirth){
        if(dateOfBirth >= 0){
            this.dateOfBirth = dateOfBirth;
        } else {
            this.dateOfBirth = Math.abs(dateOfBirth);
        }
        name = "Информация не указана";
        currentCity = "Информация не указана";
        jobTitle = "Информация не указана";
    }

    Person(int dateOfBirth, String name, String currentCity, String jobTitle){
        if(dateOfBirth >= 0){
            this.dateOfBirth = dateOfBirth;
        } else {
            this.dateOfBirth = Math.abs(dateOfBirth);
        }
        this.dateOfBirth = dateOfBirth;
        this.name = name;
        this.currentCity = currentCity;
        this.jobTitle = jobTitle;
    }

    }

