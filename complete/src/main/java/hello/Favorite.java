package hello;

public class Favorite {
    private final String name;
    private final String favoritefood;

    public Favorite(String name, String favoritefood) {
        this.name = name;
        this.favoritefood = favoritefood;
    }

    public String getName() {
        return name;
    }

    public String getFood() {
        return favoritefood;
    }
}
