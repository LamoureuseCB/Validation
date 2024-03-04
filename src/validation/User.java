package validation;

public class User {
    private int id;
    private int dateOfBirth;
    private String email;
    private String login;
    private String name;


    public User(int id, int dateOfBirth, String email, String login, String name) {
        this.id = id;
        this.dateOfBirth = dateOfBirth;
        this.email = email;
        this.login = login;
        this.name = name;
    }

    public boolean validate() {
        if (dateOfBirth <= 2024) {
            if (name.equals("")) {
                name = login;
            }
            return true;
        } else {
            System.out.println("Дата рождения не должна быть позже 2024 года");
            return false;
        }
    }

    public String getName() {
        return name;
    }


    public void setDateOfBirth(int dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setName(String name) {
        this.name = name;
    }

}




