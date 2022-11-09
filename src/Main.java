public class Main {
    public static void main(String[] args) {
        Person maksim = new Person(35, "Максим", "Минск", "бренд-менеджер" );
        maksim.welcomeMessage();

        Person anya = new Person(29, "Аня", "Москва", "методист образовательных программ");
        anya.welcomeMessage();

        Person katya = new Person(28, "Катя", "Калининград", "продакт-менеджер");
        katya.welcomeMessage();

        Person artem = new Person(27, "Артем", "Москва", "директор по развитию бизнеса");
        artem.welcomeMessage();

        Person vladimir = new Person("Владимир", 21 , "Казань");
        vladimir.welcomeMessage();


    }
}