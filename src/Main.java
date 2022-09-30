public class Main {
    public static void main(String[] args) {
        Person maksim = new Person();
        maksim.name = "Максим";
        maksim.currentCity = "Минск";
        maksim.dateOfBirth = 1987;
        maksim.jobTitle = "бренд-менеджер";

        maksim.welcomeMessage();

        Person anya = new Person();
        anya.name = "Аня";
        anya.currentCity = "Москва";
        anya.dateOfBirth = 1993;
        anya.jobTitle = "методист образовательных программ";

        anya.welcomeMessage();

        Person katya = new Person();
        katya.name = "Катя";
        katya.currentCity = "Калининград";
        katya.dateOfBirth = 1994;
        katya.jobTitle = "продакт-менеджер";

        katya.welcomeMessage();

        Person artem = new Person();
        artem.name = "Артем";
        artem.currentCity = "Москва";
        artem.dateOfBirth = 1995;
        artem.jobTitle = "директор по развитию бизнеса";

        artem.welcomeMessage();

    }
}