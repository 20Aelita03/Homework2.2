public class Main {
    public static void main(String[] args) {
        Person maksim = new Person(1987, "Максим", "Минск", "бренд-менеджер" );
        maksim.welcomeMessage();

        Person anya = new Person(1993, "Аня", "Москва", "методист образовательных программ");
        anya.welcomeMessage();

        Person katya = new Person(1994, "Катя", "Калининград", "продакт-менеджер");
        katya.welcomeMessage();

        Person artem = new Person(1995, "Артем", "Москва", "директор по развитию бизнеса");
        artem.welcomeMessage();


    }
}