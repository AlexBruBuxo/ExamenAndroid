package alex.bru.alexbru;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class RecipeActivity extends AppCompatActivity {

    // Modelo
    private Recipe recipe;
    private List<String> ingredients;
    private String description = "Cortar papatas, freírlas suevamente...";

    private TextView name_view, minutes_view, ingredients_view, description_view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipe);

        ingredients = new ArrayList<>();
        ingredients.add("Patatas");
        ingredients.add("Huevos");

        recipe = new Recipe(
                "Tortilla de Patatas",
                45,
                ingredients,
                description);

        name_view = findViewById(R.id.name_view);
        minutes_view = findViewById(R.id.minutes_view);
        description_view = findViewById(R.id.description_view);
        ingredients_view = findViewById(R.id.ingredients_view);

    }
}
