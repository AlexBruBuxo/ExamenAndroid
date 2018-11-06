package alex.bru.alexbru;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class RecipeActivity extends AppCompatActivity {

    // Model
    private Recipe recipe;
    private List<String> ingredients;
    private String description = "Cortar papatas (y opcionalmente, cebolla), fríelas suavemente durante 25-30 minutos. Bate los huevos. Añade sal a tu gusto. Mezcla las patatas y los hevos batidos y deja reposar almenos 2 horas. Fríe la mezcla dejando que cuaje y dando la vuelta con un plato o una tapa.";

    // References to layout
    private TextView name_view, minutes_view, ingredients_view, description_view;

    // Intent id
    private static final int EDIT_INGRED = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipe);

        // Create local Model
        ingredients = new ArrayList<>();
        ingredients.add("Patatas");
        ingredients.add("Huevos");
        recipe = new Recipe(
                "Tortilla de Patata",
                45,
                ingredients,
                description);

        // References to layout
        name_view = findViewById(R.id.name_view);
        minutes_view = findViewById(R.id.minutes_view);
        description_view = findViewById(R.id.description_view);
        ingredients_view = findViewById(R.id.ingredients_view);

        // Copy Model to Layout
        printRecipe(recipe);
    }

    public void printRecipe(Recipe recipe) {
        name_view.setText(recipe.getName());

        String minutes = Integer.toString(recipe.getMinutes()) + " " + getString(R.string.minutes);
        minutes_view.setText(minutes);

        description_view.setText(recipe.getDescription());

        List<String> ingredientes = recipe.getIngredients();
        String lineas = "";
        for (int i = 0; i  < ingredientes.size(); i++) {
            lineas += ingredientes.get(i) + "\n" + "\n";
        }
        ingredients_view.setText(lineas);
    }

    public void onClickAdd(View view) {
        Intent intent = new Intent(this, NewIngredientActivity.class);
        startActivityForResult(intent, EDIT_INGRED);
    }

    public void addIngredient(String ingredient) {
        String list = ingredients_view.getText().toString();
        list += ingredient + "\n" + "\n";
        ingredients_view.setText(list);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        switch (requestCode) {
            case EDIT_INGRED:
                if (resultCode == RESULT_OK) {
                    String ingrediente = data.getStringExtra("result");
                    addIngredient(ingrediente);
                }
                break;
            default:
                super.onActivityResult(requestCode, resultCode, data);
        }
    }
}
