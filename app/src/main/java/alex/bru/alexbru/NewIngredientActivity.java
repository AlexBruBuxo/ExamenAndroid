package alex.bru.alexbru;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class NewIngredientActivity extends AppCompatActivity {

    private EditText ingredient_edit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_ingredient);

        ingredient_edit = findViewById(R.id.ingredient_edit);
    }

    public void onClickAdd(View view) {
        Intent data = new Intent();
        data.putExtra("result", ingredient_edit.getText().toString());
        setResult(RESULT_OK, data);
        finish();
    }
}
