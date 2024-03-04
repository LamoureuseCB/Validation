package validation;

public class Database {
    private User[] users;
    private Film[] films;
    private int amountOfUsers = 0;
    private int amountOfFilms = 0;
    private int freePlaces = 10;
    private String name;

    public Database() {
        this.users = new User[freePlaces];
        this.films = new Film[freePlaces];
    }

    public void addUser(User user) {
        if (user.validate()) {
            if (amountOfUsers < freePlaces) {
                users[amountOfUsers] = user;
                amountOfUsers++;
                System.out.println("Пользователь " + user.getName() + " успешно добавлен в массив.");
            } else {
                System.out.println("Превышен лимит массива для пользователей.");
            }
        } else {
            System.out.println("Пользователь " + user.getName() + " не может быть добавлен в  массив из-за некорректных данных.");
        }
    }


    public void addFilm(Film film) {
        if (film.validate()) {
            if (amountOfFilms < freePlaces) {
                films[amountOfFilms] = film;
                amountOfFilms++;
                System.out.println("Фильм " + film.getName() + " успешно добавлен в массив.");
            } else {
                System.out.println("Превышен лимит массива для фильмов.");
            }
        } else {
            System.out.println("Фильм " + film.getName() + " не может быть добавлен в  массив из-за некорректных данных.");
        }

    }


    public void showUsers() {
        System.out.println("Пользователи в базе данных:");
        for (int i = 0; i < amountOfUsers; i++) {
            System.out.println(users[i].getName());
        }
    }

    public void showFilms() {
        System.out.println("Фильмы в базе данных:");
        for (int i = 0; i < amountOfFilms; i++) {
            System.out.println(films[i].getName());
        }
    }
}


