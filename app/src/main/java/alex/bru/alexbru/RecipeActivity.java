package alex.bru.alexbru;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.List;

public class RecipeActivity extends AppCompatActivity {

    // Modelo
    private Recipe recipe;
    private List<String> ingredients;
    private String description = "Cortar papatas, freírlas suevamente...";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipe);

        ingredients.add("Patatas");
        ingredients.add("Huevos");
        
        recipe = new Recipe(
                "Tortilla de Patatas",
                45,
                ingredients,
                description);
    }
}
