package alex.bru.alexbru;

import java.util.List;

public class Recipe {
    private String name;
    private int minutes;
    private List<String> ingredients;
    private String description;

    public Recipe(String name, int minutes, List<String> ingredients, String description) {
        this.name = name;
        this.minutes = minutes;
        this.ingredients = ingredients;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    public void setIngredientes(List<String> ingredients) {
        this.ingredients = ingredients;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
