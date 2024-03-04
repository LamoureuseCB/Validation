package validation;

public class Test {
    public static void main(String[] args) {
        Database database = new Database();
        User user = new User(123, 1996, "fg@mail.ru", "admin", "");
        User user1 = new User(445, 2025, "sg@mail.com", "Alex", "Alexey");
        Film film = new Film(123, "Воздух", "драма", 1950, 120);
        Film film1 = new Film(667, "Небо", "документальный", 2000, 180);


        database.addUser(user);
        database.addUser(user1);
        database.addFilm(film);
        database.addFilm(film1);
        System.out.println();

        database.showUsers();
        System.out.println();
        database.showFilms();


        user.setDateOfBirth(2000);
        user.setName("Иван");
        user.setEmail("ivan@mail.ru");


        film.setName("Вода");
        film.setDescription("драма");
        film.setReleaseYear(2023);
        film.setDuration(150);

        System.out.println();
        database.showUsers();
        System.out.println();
        database.showFilms();
    }
}
