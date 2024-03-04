package validation;

public class Film {
    private int id;
    private String name;
    private String description;
    private int releaseYear;
    private int duration;


    public Film(int id, String name, String description, int releaseYear, int duration) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.releaseYear = releaseYear;
        this.duration = duration;


    }

    public boolean validate() {
        if (releaseYear >= 1895 && duration > 0) {
            return true;
        } else {
            System.out.println(" Некорректные данные. Фильм не может быть добавлен");
            return false;
        }
    }

    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public void setDescription(String description) {
        this.description = description;
    }


    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }


    public void setDuration(int duration) {
        this.duration = duration;
    }
}


